package com.ytc.controller;


import com.ytc.model.Adress;
import com.ytc.model.Cart;
import com.ytc.model.CartItem;
import com.ytc.model.Product;
import com.ytc.service.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/trolley")
public class trollerController {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @RequestMapping("insertCart")
    @ResponseBody
    public void insertCart(int id) {

        Product product1 = new Product(2, "jsad;", 180.00, "sdjkl", "nihao");

        //从redis中获取购物车信息


        String userId = "1";
        Cart sCart = (Cart) redisTemplate.opsForValue().get(userId);

        Cart cart = null;
        //判断购物车是否存在
        if (sCart == null) {
            //购物车不存在，先创建购物车
            cart = new Cart();
            //全新的购物项内容
            CartItem cartItem = new CartItem(product1, 1, product1.getPrice());
            //购物车中存的是购物项的集合 String: 的ID    CartItem：购物项 所展示的内容
            Map<Integer, CartItem> cartMap = new HashMap<Integer, CartItem>();
            cartMap.put(product1.getId(), cartItem);
            cart.setCartMap(cartMap);
            cart.setTotalPrice(product1.getPrice());
        } else {

            //判断 当前的商品之前是否买过    购物车的数据在Map集合中 判断 map的key是否存在
            if (sCart.getCartMap().containsKey(product1.getId())) {
                cart = new Cart();
                //使用key获取已经存在的购物项    直接修改购物项的数量和小计即可
                CartItem cartItem = sCart.getCartMap().get(product1.getId());
                //数量+1
                cartItem.setCount(cartItem.getCount() + 1);
                //小计+商品的单价
                cartItem.setSubtotal(cartItem.getSubtotal() + product1.getPrice());
                // 将修改后的购物项存入购物车的Map中   key 依然是ID   value 新的购物项
                Map<Integer, CartItem> cartMap = sCart.getCartMap();
                cartMap.put(product1.getId(), cartItem);
                cart.setCartMap(cartMap);

            } else {
                cart = sCart;
                //没买过  先创建全新的购物项
                CartItem cartItem = new CartItem(product1, 1, product1.getPrice());
                //存入购物车的Map集合
                cart.getCartMap().put(product1.getId(), cartItem);
            }
            //计算总价格 并set进购物车
            double sum = 0.0;
            Set<Integer> ks = cart.getCartMap().keySet();
            Set<Integer> ks1 = cart.getCartMap().keySet();
            for (Integer key : ks1) {
                CartItem item = cart.getCartMap().get(key);
                sum += (item.getProduct().getPrice()) * (item.getCount());
            }
            cart.setTotalPrice(sum);

        }

        //将购物车序列化之后存入redis  存入redis中的key是序列化后的userId 值是序列化后的cart对象
        //byte[] car = SerializationUtils.serialize(cart);
        //byte[] userIDBs = SerializationUtils.serialize(userId);
        //这个地方要注意不要用  set(String,String) 类型的，要用set(byte[],byte[])类型，否则存进去的类型不对
        redisTemplate.opsForValue().set(userId, cart);


    }

    @RequestMapping("selectcart")
    public String selectCart(Model model) {
        String userid = 1 + "";
        Cart cart = (Cart) redisTemplate.opsForValue().get(userid);
        model.addAttribute("cart", cart);
        return "cart";
    }

    @RequestMapping("/jiesuan")
    public String jiesuan(String ids, double price, Model model) {
        String userid = "1";
        Cart cart = (Cart) redisTemplate.opsForValue().get(userid);
        Map cartMap = cart.getCartMap();
        List<CartItem> list = new ArrayList<CartItem>();
        if (ids != null && !ids.equals("") && !ids.equals("null")) {

            String[] keys = ids.split(",");

            for (int i = 0; i < keys.length; i++) {
                Integer id = Integer.parseInt(keys[i].trim());
                CartItem cartItem = (CartItem) cartMap.get(id);
                list.add(cartItem);
            }
        }


        model.addAttribute("list", list);
        model.addAttribute("price", price);
        model.addAttribute("ids", ids);
        return "detail";
    }

    @RequestMapping("topay")
    @ResponseBody
    public void topay(String ids) {
        String userId = "1";
        Cart sCart = (Cart) redisTemplate.opsForValue().get(userId);
        double TotalPrice=sCart.getTotalPrice();
        Map cartMap = sCart.getCartMap();
        if (ids != null && !ids.equals("") && !ids.equals("null")) {

            String[] keys = ids.split(",");

            for (int i = 0; i < keys.length; i++) {
                Integer id = Integer.parseInt(keys[i].trim());
                cartMap.remove(id);
            }
            sCart.setCartMap(cartMap);
            double sum = 0.0;
            Set<Integer> ks =  sCart.getCartMap().keySet();
            Set<Integer> ks1 =  sCart.getCartMap().keySet();
            for (Integer key : ks1) {
                CartItem item =  sCart.getCartMap().get(key);
                sum += (item.getProduct().getPrice()) * (item.getCount());
            }
            sCart.setTotalPrice(sum);
            double price=TotalPrice-sum;
            redisTemplate.opsForValue().set(userId, sCart);

        }

    }

    @RequestMapping("pay")
    public String pay(double price,Model model){
        model.addAttribute("price",price);
       return  "sucesspay";
    }
}
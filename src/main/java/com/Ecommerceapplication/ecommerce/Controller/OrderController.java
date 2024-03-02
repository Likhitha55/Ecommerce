package com.Ecommerceapplication.ecommerce.Controller;

//import com.Ecommerceapplication.ecommerce.DTO.OrderDTO;
import com.Ecommerceapplication.ecommerce.Repository.OrderRepo;
import com.Ecommerceapplication.ecommerce.Repository.ProductRepo;
import com.Ecommerceapplication.ecommerce.Service.OrderService;
import com.Ecommerceapplication.ecommerce.models.Order;
import com.Ecommerceapplication.ecommerce.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @Autowired
    ProductRepo productRepo;
    @Autowired
    OrderRepo orderRepo;
    @PostMapping("/put-order")
    public void putOrderProductStartWithA(){
        orderService.putOrderProductStartWithA();
//        Order order = new Order();
//        List<Product> products = productRepo.getProductsStartsWithA();
//        order.setId(o.getId());
//        order.setUser(o.getUser());
//        order.setProducts(products);
//        orderRepo.save(order);
    }
}

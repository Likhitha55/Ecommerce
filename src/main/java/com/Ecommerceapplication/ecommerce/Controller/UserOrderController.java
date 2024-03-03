package com.Ecommerceapplication.ecommerce.Controller;

//import com.Ecommerceapplication.ecommerce.DTO.OrderDTO;
import com.Ecommerceapplication.ecommerce.Repository.UserOrderRepo;
import com.Ecommerceapplication.ecommerce.Repository.ProductRepo;
import com.Ecommerceapplication.ecommerce.Repository.UserOrderRepo;
import com.Ecommerceapplication.ecommerce.Service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class UserOrderController {
    @Autowired
    UserOrderService userOrderService;

    @Autowired
    ProductRepo productRepo;
    @Autowired
    UserOrderRepo userOrderRepo;
    @PostMapping("/put-order")
    public void putOrderProductStartWithA(@RequestParam int userId){
        userOrderService.putOrderProductStartWithA(userId);
//        Order order = new Order();
//        List<Product> products = productRepo.getProductsStartsWithA();
//        order.setId(o.getId());
//        order.setUser(o.getUser());
//        order.setProducts(products);
//        orderRepo.save(order);
    }
}

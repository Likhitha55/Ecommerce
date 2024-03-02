package com.Ecommerceapplication.ecommerce.Service;

import com.Ecommerceapplication.ecommerce.Repository.OrderRepo;
import com.Ecommerceapplication.ecommerce.Repository.ProductRepo;
import com.Ecommerceapplication.ecommerce.models.Order;
import com.Ecommerceapplication.ecommerce.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;
    @Autowired
    ProductRepo productRepo;
    public void putOrderProductStartWithA(){
        Order order = new Order();
        List<Product> allProducts = productRepo.findAll();
        List<Product> productsToBeAddedToOrder = new ArrayList<>();
        for(Product p : allProducts){
            String name = p.getProductName();
            if(name.charAt(0)=='A'){
                productsToBeAddedToOrder.add(p);
            }
        }
        order.setProducts(productsToBeAddedToOrder);
        orderRepo.save(order);
    }
}

package com.Ecommerceapplication.ecommerce.Service;

import com.Ecommerceapplication.ecommerce.Repository.AppUserRepo;
import com.Ecommerceapplication.ecommerce.Repository.UserOrderRepo;
import com.Ecommerceapplication.ecommerce.Repository.ProductRepo;
import com.Ecommerceapplication.ecommerce.Repository.UserOrderRepo;
import com.Ecommerceapplication.ecommerce.models.AppUser;
import com.Ecommerceapplication.ecommerce.models.Product;
import com.Ecommerceapplication.ecommerce.models.UserOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserOrderService {
    @Autowired
    UserOrderRepo userOrderRepo;
    @Autowired
    ProductRepo productRepo;
    @Autowired

    AppUserRepo appUserRepo;
    public void putOrderProductStartWithA(int userId){
        AppUser user = new AppUser();
        user = appUserRepo.findById(userId).orElse(null);
        UserOrder order = new UserOrder();
        List<Product> allProducts = productRepo.findAll();
        List<Product> productsToBeAddedToOrder = new ArrayList<>();
        for(Product p : allProducts){
            String name = p.getProductName();
            if(name.charAt(0)=='A'){
                productsToBeAddedToOrder.add(p);
            }
        }
        order.setProducts(productsToBeAddedToOrder);
        order.setAppUser(user);
        userOrderRepo.save(order);
    }
}


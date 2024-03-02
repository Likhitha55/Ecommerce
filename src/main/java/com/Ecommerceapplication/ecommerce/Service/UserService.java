package com.Ecommerceapplication.ecommerce.Service;

import com.Ecommerceapplication.ecommerce.Repository.UserRepo;
import com.Ecommerceapplication.ecommerce.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public void addUser(User u){
        User user = new User();
        user.setId(u.getId());
        user.setName(u.getName());
        user.setEmail(u.getEmail());
        user.setPassword(u.getPassword());
        userRepo.save(user);
    }
}

package com.Ecommerceapplication.ecommerce.Service;

import com.Ecommerceapplication.ecommerce.Repository.AppUserRepo;
import com.Ecommerceapplication.ecommerce.models.AppUser;
//import com.Ecommerceapplication.ecommerce.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    @Autowired
    AppUserRepo appUserRepo;
    public void addAppUser(AppUser u){
        AppUser user = new AppUser();
        user.setId(u.getId());
        user.setName(u.getName());
        user.setEmail(u.getEmail());
        user.setPassword(u.getPassword());
        appUserRepo.save(user);
    }
}

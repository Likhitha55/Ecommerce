package com.Ecommerceapplication.ecommerce.Repository;

import com.Ecommerceapplication.ecommerce.models.AppUser;
//import com.Ecommerceapplication.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser,Integer> {
}

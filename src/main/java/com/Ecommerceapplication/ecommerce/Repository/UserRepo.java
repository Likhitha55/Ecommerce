package com.Ecommerceapplication.ecommerce.Repository;

import com.Ecommerceapplication.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}

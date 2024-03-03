package com.Ecommerceapplication.ecommerce.Repository;


import com.Ecommerceapplication.ecommerce.models.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserOrderRepo extends JpaRepository<UserOrder,Integer> {
}

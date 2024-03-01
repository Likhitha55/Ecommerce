package com.Ecommerceapplication.ecommerce.Repository;

import com.Ecommerceapplication.ecommerce.models.Order;
import com.Ecommerceapplication.ecommerce.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order,Integer> {
}

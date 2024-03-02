package com.Ecommerceapplication.ecommerce.Repository;

import com.Ecommerceapplication.ecommerce.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    @Query(value="select * from product where productName like 'A%'",nativeQuery=true)
    public List<Product> getProductsStartsWithA();

    @Query(value="select MAX(price) from product", nativeQuery=true)
    public Product getMaxProduct();
}

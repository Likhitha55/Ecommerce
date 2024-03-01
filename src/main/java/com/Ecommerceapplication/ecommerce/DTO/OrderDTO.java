package com.Ecommerceapplication.ecommerce.DTO;

import com.Ecommerceapplication.ecommerce.models.Product;
import com.Ecommerceapplication.ecommerce.models.User;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrderDTO {
    int id;

    User user;


    List<Product> products;
}

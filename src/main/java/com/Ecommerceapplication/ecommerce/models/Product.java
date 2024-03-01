package com.Ecommerceapplication.ecommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    @Id
    int productId;
    String productName;
    String category;
    double price;
}

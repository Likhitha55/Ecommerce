package com.Ecommerceapplication.ecommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

//    @ManyToOne
//    @JoinColumn(name="order_id")
//    UserOrder userOrder;
}

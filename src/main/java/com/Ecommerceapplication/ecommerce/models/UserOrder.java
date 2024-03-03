package com.Ecommerceapplication.ecommerce.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserOrder {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

//    @OneToMany(cascade = CascadeType.ALL)
//    List<Product> products;
//
//    @ManyToOne
//    @JoinColumn(name = "userId")
//    AppUser appUser;

    @ManyToOne
    @JoinColumn(name = "user_userId")
    private AppUser appUser;

    @ManyToMany
    @JoinTable(
            name = "order_product",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;
}

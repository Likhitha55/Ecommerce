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
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
    List<Product> products;

    @ManyToOne
    @JoinColumn(name = "userId")
    AppUser appUser;
}

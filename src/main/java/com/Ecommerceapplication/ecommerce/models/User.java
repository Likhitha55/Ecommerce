package com.Ecommerceapplication.ecommerce.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    @Id
    int id;
    String name;
    String email;
    String password;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Order> order = new ArrayList<>();
}

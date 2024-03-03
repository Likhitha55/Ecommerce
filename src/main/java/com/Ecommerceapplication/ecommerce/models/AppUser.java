package com.Ecommerceapplication.ecommerce.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class AppUser {
    @Id
    int id;
    String name;
    String email;
    String password;
    @JsonIgnore
    @OneToMany(mappedBy = "appUser",cascade = CascadeType.ALL)
    List<UserOrder> order;
}

package com.Ecommerceapplication.ecommerce.DTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserReqDTO {
    int id;
    String name;
    String email;
    String password;
}

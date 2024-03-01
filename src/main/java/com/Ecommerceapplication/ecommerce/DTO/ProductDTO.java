package com.Ecommerceapplication.ecommerce.DTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductDTO {
    int productId;
    String productName;
    String category;
    double price;
}

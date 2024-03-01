package com.Ecommerceapplication.ecommerce.Controller;

import com.Ecommerceapplication.ecommerce.DTO.ProductDTO;
import com.Ecommerceapplication.ecommerce.Repository.ProductRepo;
import com.Ecommerceapplication.ecommerce.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductRepo productRepo;

    @PostMapping("/add-product")
    public void addProduct(@RequestBody ProductDTO productDTO){
        Product product = new Product();
        product.setProductId(productDTO.getProductId());
        product.setProductName(productDTO.getProductName());
        product.setCategory(productDTO.getCategory());
        product.setPrice(productDTO.getPrice());
        productRepo.save(product);
    }
    @GetMapping("/max-product")
    public Product getMaxProduct(){
        return productRepo.getMaxProduct();
    }
}

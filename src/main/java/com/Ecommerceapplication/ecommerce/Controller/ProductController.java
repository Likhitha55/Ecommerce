package com.Ecommerceapplication.ecommerce.Controller;

//import com.Ecommerceapplication.ecommerce.DTO.ProductDTO;
import com.Ecommerceapplication.ecommerce.Repository.ProductRepo;
import com.Ecommerceapplication.ecommerce.Service.ProductService;
import com.Ecommerceapplication.ecommerce.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    ProductRepo productRepo;

    @PostMapping("/add-product")
    public void addProduct(@RequestBody Product p){
        productService.addProduct(p);
//        Product product = new Product();
//        product.setProductId(productDTO.getProductId());
//        product.setProductName(productDTO.getProductName());
//        product.setCategory(productDTO.getCategory());
//        product.setPrice(productDTO.getPrice());
//        productRepo.save(product);
    }
    @GetMapping("/max-product")
    public Optional<Product> getMaxProduct(@RequestParam String category){
        return productService.getMaxProduct(category);
//        return productRepo.getMaxProduct();
    }
    @GetMapping("/most-ordered")
    public Product getMostOrderedProduct(){
        return productService.getMostOrderedProduct();
    }
}

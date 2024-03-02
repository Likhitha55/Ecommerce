package com.Ecommerceapplication.ecommerce.Service;

import com.Ecommerceapplication.ecommerce.Repository.ProductRepo;
import com.Ecommerceapplication.ecommerce.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public void addProduct(Product p){
        Product product = new Product();
        product.setProductName(p.getProductName());
        product.setProductId(p.getProductId());
        product.setCategory(p.getCategory());
        product.setPrice(p.getPrice());
        productRepo.save(product);
    }
    public Optional<Product> getMaxProduct(String requiredCategory){
        List<Product> allProducts = productRepo.findAll();
        Product productToBeReturned;
        int productId = 0;
        double max = Double.MIN_VALUE;
        for(Product p : allProducts){
            String productCategory = p.getCategory();
            if(productCategory.equals(requiredCategory)){
                double price = p.getPrice();
                if(price>max){
                    max=price;
                    productId = p.getProductId();
                }
            }
        }
        return productRepo.findById(productId);

    }
    public Product getMostOrderedProduct(){
        List<Product> allProducts = productRepo.findAll();
        Product pro = null;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(Product p : allProducts){
            
        }
        return pro;
    }
}

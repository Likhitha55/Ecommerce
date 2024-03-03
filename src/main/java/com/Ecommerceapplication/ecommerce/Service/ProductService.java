package com.Ecommerceapplication.ecommerce.Service;

import com.Ecommerceapplication.ecommerce.Repository.ProductRepo;
import com.Ecommerceapplication.ecommerce.Repository.UserOrderRepo;
import com.Ecommerceapplication.ecommerce.models.Product;
import com.Ecommerceapplication.ecommerce.models.UserOrder;
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
    @Autowired
    UserOrderRepo userOrderRepo;
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
        List<UserOrder> allOrders = userOrderRepo.findAll();
//        List<List<Product>> allProductsList = null;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(UserOrder order : allOrders){
            List<Product> products = order.getProducts();
            for(Product p : products){
                map.put(p.getProductId(), map.getOrDefault(p.getProductId(),0)+1);
            }
        }
        int maxCount = Integer.
                MIN_VALUE;
        Product maxOrderedProduct = new Product();
        for(int id : map.keySet()){
            int curr = map.get(id);
            if(curr > maxCount){
                maxCount = curr;
                maxOrderedProduct = productRepo.findById(map.get(curr)).orElse(null);
            }else if(curr == maxCount){
                if(productRepo.findById(id).orElse(null).getPrice() >= productRepo.findById(maxOrderedProduct.getProductId()).orElse(null).getPrice()){
                    maxOrderedProduct = productRepo.findById(map.get(curr)).orElse(null);
                }
            }
        }
        return maxOrderedProduct;
    }
}

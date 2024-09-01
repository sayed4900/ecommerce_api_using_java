package com.sayed.dreamshops.service.product;

import com.sayed.dreamshops.model.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product) ;

    Product getProductById(Long id);
    void deleteProductById(Long id);
    void updateProductById(Product product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category,String brand);
    List<Product> getProductByName(String name);
    List<Product> getProductByBrandAndName(String brand,String name);
    Long countProductsByBrandAndName(String category);
}

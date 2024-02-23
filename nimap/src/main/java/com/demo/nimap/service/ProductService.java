package com.demo.nimap.service;


import com.demo.nimap.model.Product;
import com.demo.nimap.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;


import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Get all products
//    public List<Product> getAllProducts(int page, int size) {
//        return productRepository.findAll();
//    }
 // Get all products with pagination
    public List<Product> getAllProducts(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Product> productPage = productRepository.findAll(pageable);
        return productPage.getContent();
    }


    // Create a new product
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    // Get product by Id
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    // Update product by id
    public Product updateProduct(Long id, Product product) {
        Product existingProduct = productRepository.findById(id).orElse(null);
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setCategory(product.getCategory());
            existingProduct.setPrice(product.getPrice());
            return productRepository.save(existingProduct);
        }
        return null;
    }

    // Delete product by id
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

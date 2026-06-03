package com.ecommerce.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.entity.Product;
import com.ecommerce.ecommerce.exception.ResourceNotFoundException;
import com.ecommerce.ecommerce.repository.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository repository;
	
	public ProductService(ProductRepository repository) {
		this.repository=repository;
	}
	
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	
	 public List<Product> getAllProducts() {
	        return repository.findAll();
	    }

	    public Product getProductById(Long id) {
	    	return repository.findById(id)
	    	        .orElseThrow(() ->
	    	                new ResourceNotFoundException(
	    	                        "Product not found with id: " + id));
	    }

	    public Product updateProduct(Long id, Product product) {
	        Product existingProduct = repository.findById(id).orElse(null);

	        if (existingProduct != null) {
	            existingProduct.setName(product.getName());
	            existingProduct.setCategory(product.getCategory());
	            existingProduct.setPrice(product.getPrice());
	            existingProduct.setQuantity(product.getQuantity());

	            return repository.save(existingProduct);
	        }

	        return null;
	    }

	    public void deleteProduct(Long id) {
	        repository.deleteById(id);
	    }
	    public List<Product> getProductsByName(String name) {
	        return repository.findByName(name);
	    }

	    public List<Product> getProductsByCategory(String category) {
	        return repository.findByCategory(category);
	    }
	  /*  public List<Product> getProductsByCategory(String category) {
	        return repository.findByCategory(category);
	    } */

	   /*c public Product getProductByName(String name) {
	        return repository.findByName(name);
	    } */
}

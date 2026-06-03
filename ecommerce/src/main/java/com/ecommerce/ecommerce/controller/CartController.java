package com.ecommerce.ecommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.entity.Cart;
import com.ecommerce.ecommerce.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	  private final CartService service;

	    public CartController(CartService service) {
	        this.service = service;
	    }

	    @PostMapping
	    public Cart addToCart(@RequestBody Cart cart) {
	        return service.saveCart(cart);
	    }

	    @GetMapping
	    public List<Cart> getAllCartItems() {
	        return service.getAllCartItems();
	    }

	    @GetMapping("/{id}")
	    public Cart getCartById(@PathVariable Long id) {
	        return service.getCartById(id);
	    }

	    @PutMapping("/{id}")
	    public Cart updateCart(@PathVariable Long id,
	                           @RequestBody Cart cart) {

	        return service.updateCart(id, cart);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteCart(@PathVariable Long id) {
	        service.deleteCart(id);
	    }
}

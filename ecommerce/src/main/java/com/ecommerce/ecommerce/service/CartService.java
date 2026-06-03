package com.ecommerce.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.entity.Cart;
import com.ecommerce.ecommerce.repository.CartRepository;

@Service
public class CartService {

	private final CartRepository repository;

    public CartService(CartRepository repository) {
        this.repository = repository;
    }

    public Cart saveCart(Cart cart) {
        return repository.save(cart);
    }

    public List<Cart> getAllCartItems() {
        return repository.findAll();
    }

    public Cart getCartById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Cart updateCart(Long id, Cart cart) {

        Cart existingCart = repository.findById(id).orElse(null);

        if (existingCart != null) {

            existingCart.setUserId(cart.getUserId());
            existingCart.setProductId(cart.getProductId());
            existingCart.setQuantity(cart.getQuantity());

            return repository.save(existingCart);
        }

        return null;
    }

    public void deleteCart(Long id) {
        repository.deleteById(id);
    }
}

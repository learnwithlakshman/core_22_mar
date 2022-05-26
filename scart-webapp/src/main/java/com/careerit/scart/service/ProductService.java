package com.careerit.scart.service;

import java.util.List;

import com.careerit.scart.domain.Product;

public interface ProductService {
	Long addProduct(Product product);
	List<Product> getProducts();
	List<Product> searchProducts(String str);
	boolean removeProduct(Long pid);
	Product getProduct(Long pid);
	Long updateProduct(Product product);
}

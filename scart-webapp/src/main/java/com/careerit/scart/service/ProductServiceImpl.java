package com.careerit.scart.service;

import java.util.List;

import com.careerit.scart.domain.Product;

public class ProductServiceImpl implements ProductService {

	// Create dao object
	@Override
	public Long addProduct(Product product) {
		// Validation product name,price,quantity
		// if validation are ok then persist product otherwise throw exception
		return null;
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchProducts(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeProduct(Long pid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProduct(Long pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}

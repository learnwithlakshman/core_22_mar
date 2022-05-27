package com.careerit.scart.service;

import java.util.List;

import com.careerit.scart.dao.ProductDao;
import com.careerit.scart.dao.ProductDaoImpl;
import com.careerit.scart.domain.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao = new ProductDaoImpl();
	@Override
	public Long addProduct(Product product) {
		// Validation product name,price,quantity
		// if validation are ok then persist product otherwise throw exception
		return null;
	}

	@Override
	public List<Product> getProducts() {
		return productDao.selectProducts();
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

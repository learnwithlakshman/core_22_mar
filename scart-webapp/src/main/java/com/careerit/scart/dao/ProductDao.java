package com.careerit.scart.dao;

import java.util.List;

import com.careerit.scart.domain.Product;

public interface ProductDao {

		Long insertProduct(Product product);
		List<Product> selectProducts();
		List<Product> searchProducts(String str);
		boolean deleteProduct(Long pid);
		Product selectProduct(Long pid);
		Long updateProduct(Product product);
}

package com.careerit.scart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.careerit.scart.dao.util.DbUtil;
import com.careerit.scart.domain.Product;

public class ProductDaoImpl implements ProductDao {

	private static final String ADD_PRODUCT_QUERY="insert into product(name,description,price,discount,quantity) values(?,?,?,?,?);";
	DbUtil dbUtil = DbUtil.obj;
	private static final String GET_PRODUCTS = "select pid,name,description,price,discount,quantity from product";
	@Override
	public Long insertProduct(Product product) {
		Connection con = null;
		PreparedStatement pst = null;
		Long pid = -1L;
		try {
			con = dbUtil.getConnection();
			pst = con.prepareStatement(ADD_PRODUCT_QUERY);
			//Set all values
			// Execute query
			// Generated id and assign to pid; 
		}catch (SQLException e) {
			System.out.println("While adding product :"+e);
		}finally {
			dbUtil.close(pst, con);
		}
		return pid;
	}

	@Override
	public List<Product> selectProducts() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<Product> productList = new ArrayList<>();
		try {
			con = dbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(GET_PRODUCTS);
			while(rs.next()) {
				Long pid = rs.getLong("pid");
				String name = rs.getString("name");
				String description = rs.getString("description");
				double price = rs.getDouble("price");
				double discount = rs.getDouble("discount");
				Long quantity = rs.getLong("quantity");
				Product product = getProduct(pid,name,description,price,discount,quantity);
				productList.add(product);
			}
		}catch (SQLException e) {
			System.out.println("While getting products :"+e);
		}finally {
			dbUtil.close(st, con);
		}
		return productList;
	}

	private Product getProduct(Long pid, String name, String description, double price, double discount, Long quantity) {
		Product product = 
				Product.builder()
				       .pid(pid)
				       .name(name)
				       .price(price)
				       .description(description)
				       .discount(discount)
				       .quantity(quantity)
				       .build();
		return product;
				       
	}

	@Override
	public List<Product> searchProducts(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProduct(Long pid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product selectProduct(Long pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}

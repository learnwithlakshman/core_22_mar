package com.careerit.scart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.careerit.scart.dao.util.DbUtil;
import com.careerit.scart.domain.Product;

public class ProductDaoImpl implements ProductDao {

	private static final String ADD_PRODUCT_QUERY="insert into product(name,description,price,discount,quantity) values(?,?,?,?,?);";
	DbUtil dbUtil = DbUtil.obj;
	
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
		// TODO Auto-generated method stub
		return null;
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

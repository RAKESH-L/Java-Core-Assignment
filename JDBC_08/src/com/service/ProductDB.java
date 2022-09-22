package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Product;

public class ProductDB {
	Connection con;
	public void dbConnect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproductassigment_80631"
					, "root", "Password123");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(Product product) {
		// TODO Auto-generated method stub
		dbConnect();
		String sql="insert into product(name,price,description) values (?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, product.getName());
			pstmt.setDouble(2, product.getPrice());
			pstmt.setString(3, product.getDescription());
			
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbClose();
	}
	
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		dbConnect();
		String sql="delete from product where id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbClose();
	}
	public List<Product> fetchEmployees() {
		// TODO Auto-generated method stub
		dbConnect();
		String sql="select * from product";
		
		List<Product> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rst = pstmt.executeQuery();
			while(rst.next()) {
				Product p = new Product(); 
				int id = rst.getInt("id"); 
				String name = rst.getString("name"); 
				double price = rst.getDouble("price");
				String description = rst.getString("description");
				p.setId(id);
				p.setName(name);
				p.setPrice(price);
				p.setDescription(description);
				list.add(p);
			}
		} catch (SQLException p) {
			 
			p.printStackTrace();
		}
		dbClose();
		return list;
	}
	public void dbClose() {
		try {
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

	

}

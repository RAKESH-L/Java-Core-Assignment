package com.service;

import java.util.List;

import com.beans.Product;

public class ProductService {
	ProductDB productDB = new ProductDB();
	 
    
    public void insert(final Product product) {
        productDB.insert(product);
    }


	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		productDB.deleteProduct(id);
	}


	public List<Product> fetchEmployees() {
		
		return productDB.fetchEmployees();
	}
}
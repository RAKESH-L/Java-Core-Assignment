package com.main;

import java.util.List;
import java.util.Scanner;

import com.beans.Product;
import com.service.ProductService;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService productService = new ProductService();
		
		System.out.println("1. Insert product");
	    System.out.println("2. Delete product by ID");
	    System.out.println("3. Display all product");
		System.out.println("0. Exit");
	    int input = sc.nextInt();
	    
	    switch(input) {
	    case 1:  
	    	System.out.println("Enter product Details");
	    	System.out.println("Product Name: ");
	    	String name = sc.next(); 
	    	System.out.println("Prouct Price: ");
            double price = sc.nextDouble();
            System.out.println("Product Description: ");
            String description = sc.next();
            
            Product product = new Product();
            product.setName(name);
            product.setPrice(price);
            product.setDescription(description);
            
            productService.insert(product);
            System.out.println("Product Record Inserted.. ");
            
	    case 2:
	    	System.out.println("######## Delete Product #########");
			System.out.println("Enter the ID of Product to delete");
			int id = sc.nextInt();
			productService.deleteProduct(id);
			System.out.println("Product record deleted...");
			break;
		
	    case 3:
	    	System.out.println("######### Display all employees ########");
			List<Product> list = productService.fetchEmployees();
			for(Product p : list) {
				System.out.println(p);
			}
			break;
	    case 0:
	    	System.out.println("Invalid Entery");
	    	break;
	    }  
	}
}

package com.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		map.put("rakesh", "lokesh");
		map.put("shiva", "09051996");
		map.put("bharathi", "basavaraj");
		map.put("lokesh", "1999");
		map.put("yashas", "braj");
		
		System.out.println("-----------Login-----------");
		/* take username from the user and verify if its present in the map.  */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username: ");
		String username = sc.next();
		
		if(!map.containsKey(username)) {
			System.out.println("Invalid Username");
			sc.close();
			return; 
		}
		
		System.out.println("Enter the password: ");
		String password=sc.next();
		
		String passMap = map.get(username);
		
		if(!password.equals(passMap)) {
			System.out.println("Invalid password");
			sc.close();
			return;
		}
		
		System.out.println("Login Success, Welcome " + username);
		sc.close();
	}
}

package com.product.dao;

import java.util.Map;
import java.util.Scanner;

import com.product.bean.Product;
import com.product.util.CollectionUtil;


public class ProductDAO {
	
	Scanner sc=new Scanner(System.in);
	
	CollectionUtil cu=new CollectionUtil();
	
	Product p;
	
	public int getProductDetails(int product_code,int product_quantity) {
		
		Map<Integer,Product> products=CollectionUtil.HashMap();
		
		p=products.get(product_code);
		if(p==null)
		{
			throw new CodeNotFoundException("Invalid product code...");
		}
		else
		{
			System.out.println("Name of the product: "+p.getProduct_name());
			System.out.println("Name of the category: "+p.getProduct_category());
			
			System.out.println("Price of the single quantity: "+p.getProduct_price());
			
			int t=(product_quantity*p.getProduct_price());
			
			System.out.println("List total: "+t);

		}
				
		return product_code;
		
	}
	
}



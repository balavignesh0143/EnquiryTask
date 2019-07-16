package com.product.util;

import java.util.HashMap;

import com.product.bean.Product;


public class CollectionUtil {
	static Product p=new Product();;
	
	private static HashMap<Integer,Product> products=new HashMap<Integer,Product>();
	
	static
	{
		products.put(1001,new Product(1001,"iPhone","Electronics",35000));
		products.put(1002,new Product(1002,"LEDTV","Electronics",45000));	
		products.put(1003,new Product(1003,"Teddy","Toys",800));	
		products.put(1004,new Product(1004,"Telescope","Toys",5000));
	}


	public static HashMap<Integer, Product> HashMap() {
		return products;
	}

}

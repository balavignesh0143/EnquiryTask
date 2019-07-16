package com.product.service;

import java.util.Scanner;

import com.product.dao.ProductDAO;

public class ProductService implements IProductService{
	Scanner sc=new Scanner(System.in);
	ProductDAO pd=new ProductDAO();

	public int getProductDetails(int product_id,int product_quantity) {
		return pd.getProductDetails(product_id,product_quantity);
	}

	public int validationProductID(int product_id)
	{
		while(true)
		{
			if(String.valueOf(product_id).length()==4)
			{
				System.out.println(product_id);
				return product_id;
			}
			else
			{
				System.out.println("Enter the valid product id: ");
				product_id=sc.nextInt();
			}
		}
	}
	
	public int quantityCheck(int product_quantity)
	{
		while(true)
		{
			if(product_quantity<=0)
			{
				System.out.println("Quantity exists...");
				System.out.println("Enter again: ");
				product_quantity=sc.nextInt();
			}
			else
			{
				return product_quantity;
			}
		}
	}
}

package com.product.ui;

import java.util.Scanner;

import com.product.dao.CodeNotFoundException;
import com.product.service.ProductService;

public class Client {
	public int getOption(Scanner sc)
	{
		try
		{
			int option=sc.nextInt();
			return option;
		}
		catch(Throwable e)
		{
			e.printStackTrace();//checking whether given input is integer or not
			return -1;
		}
	}
	public static void main(String[] args) {
		int option;
		Scanner sc=new Scanner(System.in);
		ProductService ps=new ProductService();//creating a method for service class
		
		
		do//for repeating the statements
		{
			System.out.println("1)Generate Bill by entering Product code and quantity");
			System.out.println("2)Exit");
			System.out.println("Enter your option: ");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				try
				{
					System.out.println("\t\t\t\t1)Enter product details");
					System.out.println("Enter the product code: ");
					int product_code=ps.validationProductID(sc.nextInt());
					System.out.println("Enter the quantity: ");
					int product_quantity=ps.quantityCheck(sc.nextInt());//validating whether the given value is greater than zero or not 
					ps.getProductDetails(product_code,product_quantity);//passing the given values into service class
				}
				catch(CodeNotFoundException e)
				{
					System.out.println("Invalid product code...");
				}
				break;
			case 2:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid number...");
				break;
			}
			
		}while(option!=2);
		sc.close();
		
	}

}

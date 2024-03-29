package com.product.bean;

public class Product {
	private int product_code;
	private String product_name;
	private int product_price;
	private String product_category;
	
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_id(int product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getProduct_category() {
		return product_category;
	}
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	
	/*public Product(int product_code)
	{
		this.product_code=product_code;
	}
	*/
	public Product(int product_code,String product_name, String product_category, int product_price) {
		this.product_code=product_code;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_category = product_category;
	}
	
	
	public Product() {

	}
	@Override
	public String toString() {
		return "Product [product_code=" + product_code + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_category=" + product_category + "]";
	}
	public void put(int i, Product product) {
		
	}

}

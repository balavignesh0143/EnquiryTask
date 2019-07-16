package com.product.dao;

@SuppressWarnings("serial")
public class CodeNotFoundException extends RuntimeException{
	public CodeNotFoundException(String msg)
	{
		super(msg);
	}
	public CodeNotFoundException(String msg,Throwable ex)
	{
		super(msg,ex);
	}

}

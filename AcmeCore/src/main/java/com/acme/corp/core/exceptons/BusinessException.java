package com.acme.corp.core.exceptons;

public class BusinessException extends Exception{

	private static final long serialVersionUID = -2244661453216146827L;

	public BusinessException(){
		super();
	}
	
	public BusinessException(String mensagem){
		super(mensagem);
	}
}
package com.acme.corp.core.exceptons;

public class PersistenceException extends Exception{

	private static final long serialVersionUID = -2244661453216146827L;

	public PersistenceException(){
		super();
	}
	
	public PersistenceException(String mensagem){
		super(mensagem);
	}
}

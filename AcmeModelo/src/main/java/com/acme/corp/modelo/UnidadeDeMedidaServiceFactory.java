package com.acme.corp.modelo;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

public class UnidadeDeMedidaServiceFactory {

	
	@Produces 
	@RequestScoped
	public UnidadeDeMedidaService criarUnidadeDeMedidaService(){
		return new UnidadeDeMedidaService();
	}
}

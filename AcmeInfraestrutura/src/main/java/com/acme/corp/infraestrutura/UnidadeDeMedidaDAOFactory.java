package com.acme.corp.infraestrutura;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

import com.acme.corp.modelo.UnidadeDeMedidaRepository;

public class UnidadeDeMedidaDAOFactory {

	@Produces
	@RequestScoped
	public UnidadeDeMedidaRepository criarUnidadeDeMedidaDAOFactory(){
		return new UnidadeDeMedidaMemoryDAO();
	}
}

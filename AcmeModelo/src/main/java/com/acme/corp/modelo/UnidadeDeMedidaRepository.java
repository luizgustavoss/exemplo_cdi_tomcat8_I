package com.acme.corp.modelo;

import java.util.List;

import com.acme.corp.core.exceptons.PersistenceException;

public interface UnidadeDeMedidaRepository {

	
	public List<UnidadeDeMedida> recuperarTodasUnidadesDeMedida() throws PersistenceException;
	
	public boolean inserir(UnidadeDeMedida unidadeDeMedida) throws PersistenceException;
	
	public boolean alterar(UnidadeDeMedida unidadeDeMedida) throws PersistenceException;
	
	public boolean excluir(String codigo) throws PersistenceException;
	
	public UnidadeDeMedida recuperarPorCodigo(String codigo) throws PersistenceException;
	
}

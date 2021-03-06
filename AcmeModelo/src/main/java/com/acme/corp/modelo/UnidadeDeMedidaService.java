package com.acme.corp.modelo;

import java.util.List;

import javax.inject.Inject;

import com.acme.corp.core.exceptons.BusinessException;
import com.acme.corp.core.exceptons.PersistenceException;

public class UnidadeDeMedidaService {

	@Inject UnidadeDeMedidaRepository repository;
	
	/**
	 * 
	 * @param repository
	 * @return
	 */
	public List<UnidadeDeMedida> recuperarTodasUnidadesDeMedida() throws BusinessException{
		
		try {
			return repository.recuperarTodasUnidadesDeMedida();
		} catch (PersistenceException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
	}
	
	
	
	/**
	 * 
	 * @param repository
	 * @return
	 */
	public boolean inserir(UnidadeDeMedida unidadeDeMedida) throws BusinessException{
		
		try {
			return repository.inserir(unidadeDeMedida);
		} catch (PersistenceException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
	}
	
	
	
	/**
	 * 
	 * @param repository
	 * @return
	 */
	public boolean alterar(UnidadeDeMedida unidadeDeMedida) throws BusinessException{
		
		try {
			return repository.alterar(unidadeDeMedida);
		} catch (PersistenceException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
	}
	
	
	/**
	 * 
	 * @param repository
	 * @return
	 */
	public boolean excluir(String codigo) throws BusinessException{
		
		try {
			return repository.excluir(codigo);
		} catch (PersistenceException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
	}
	
	
	/**
	 * 
	 * @param repository
	 * @return
	 */
	public UnidadeDeMedida recuperarPorCodigo(String codigo) throws BusinessException{
		
		try {
			return repository.recuperarPorCodigo(codigo);
		} catch (PersistenceException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
	}
}

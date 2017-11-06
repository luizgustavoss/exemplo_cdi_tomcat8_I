package com.acme.corp.infraestrutura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.acme.corp.core.exceptons.PersistenceException;
import com.acme.corp.modelo.UnidadeDeMedida;
import com.acme.corp.modelo.UnidadeDeMedidaRepository;

public class UnidadeDeMedidaMemoryDAO implements UnidadeDeMedidaRepository{

	private static Map<String, UnidadeDeMedida> unidadesDeMedida = new HashMap<String, UnidadeDeMedida>();
	
	public List<UnidadeDeMedida> recuperarTodasUnidadesDeMedida()
			throws PersistenceException {
		List<UnidadeDeMedida> unidades = new ArrayList<UnidadeDeMedida>();
		unidades.addAll(unidadesDeMedida.values());
		return unidades;
	}

	public boolean inserir(UnidadeDeMedida unidadeDeMedida)
			throws PersistenceException {
		unidadesDeMedida.put(unidadeDeMedida.getCodigo(), unidadeDeMedida);
		return true;
	}

	public boolean alterar(UnidadeDeMedida unidadeDeMedida)
			throws PersistenceException {
		unidadesDeMedida.put(unidadeDeMedida.getCodigo(), unidadeDeMedida);
		return true;
	}

	public boolean excluir(String codigo) throws PersistenceException {
		unidadesDeMedida.remove(codigo);
		return true;
	}

	public UnidadeDeMedida recuperarPorCodigo(String codigo)
			throws PersistenceException {
		return unidadesDeMedida.get(codigo);
	}

}

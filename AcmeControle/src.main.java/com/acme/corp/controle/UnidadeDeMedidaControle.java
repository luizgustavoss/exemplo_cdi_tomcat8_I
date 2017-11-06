package com.acme.corp.controle;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.acme.corp.core.exceptons.BusinessException;
import com.acme.corp.modelo.UnidadeDeMedida;
import com.acme.corp.modelo.UnidadeDeMedidaService;

@Path("/unidadeDeMedida")
public class UnidadeDeMedidaControle {

	
	@Inject UnidadeDeMedidaService service;
	
	@POST
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response inserir(@Context HttpServletRequest request, UnidadeDeMedida unidadeDeMedida) {

        try {
        	boolean retorno = service.inserir(unidadeDeMedida);
            return Response.status(Response.Status.OK).entity(retorno).build();
        } catch (BusinessException t) {
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(t.getLocalizedMessage()).build();
        }
    }
	
	@PUT
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response alterar(@Context HttpServletRequest request, UnidadeDeMedida unidadeDeMedida) {

        try {
        	boolean retorno = service.inserir(unidadeDeMedida);
            return Response.status(Response.Status.OK).entity(retorno).build();
        } catch (BusinessException t) {
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(t.getLocalizedMessage()).build();
        }
    }
	
	
	@DELETE
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{codigo}")
    public Response excluir(@Context HttpServletRequest request, @PathParam("codigo") String codigo) {

        try {
        	boolean retorno = service.excluir(codigo);
            return Response.status(Response.Status.OK).entity(retorno).build();
        } catch (BusinessException t) {
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(t.getLocalizedMessage()).build();
        }
    }
	
	
	@GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{codigo}")
    public Response recuperarPorCodigo(@Context HttpServletRequest request, @PathParam("codigo") String codigo) {

        try {
        	UnidadeDeMedida retorno = service.recuperarPorCodigo(codigo);
            return Response.status(Response.Status.OK).entity(retorno).build();
        } catch (BusinessException t) {
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(t.getLocalizedMessage()).build();
        }
    }
	
	
	@GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response recuperarTodos(@Context HttpServletRequest request) {

        try {
        	List<UnidadeDeMedida> retorno = service.recuperarTodasUnidadesDeMedida();
            return Response.status(Response.Status.OK).entity(retorno).build();
        } catch (BusinessException t) {
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(t.getLocalizedMessage()).build();
        }
    }
}

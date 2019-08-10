/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import manga.domain.dao.ICategoriaDAO;
import manga.domain.dao.list.CategoriaDAOImpl;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import manga.domain.entidades.Categoria;



@Path("/categoria")
public class CategoriaController {
    private ICategoriaDAO
            banco= new CategoriaDAOImpl();
    @GET
    @Path("/")
    public String index(){
        return "teste";
    }
    
    @GET
    @Path("/select/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Categoria select(@PathParam("id") int pk){
      System.out.println("Parametro:"+pk);
        for(Categoria cat : banco.consultar()){
            if(cat.getId()== pk){
                return cat;
            }
        }
        return null;
    }
    
    
    @GET
    
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/cadastrar/{nome}")
    public String cadastrar(@PathParam ("nome") String nome){
        Categoria nova = new Categoria();
        nova.setNome(nome);
        banco.inserir(nova);
        String ret = "{\"status\":1}";
        return ret;
    }
    
    
}

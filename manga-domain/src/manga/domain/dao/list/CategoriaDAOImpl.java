/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manga.domain.dao.list;

import java.util.ArrayList;
import java.util.List;
import manga.domain.dao.ICategoriaDAO;
import manga.domain.entidades.Categoria;

/**
 *
 * @author aluno
 */
public class CategoriaDAOImpl implements ICategoriaDAO{

    private static List<Categoria> categorias = new ArrayList<>();
    private static int lastId=1;
    public void inserir(Categoria ent) {
       if(ent == null){
           throw new NullPointerException();
       }
       if(categorias.contains(ent)){
           throw new RuntimeException("Valor repetido");
       }
       ent.setId(lastId);
       lastId++;
       categorias.add(ent);
    }

    public void atualizar(Categoria ent) {
        for (int i = 0; i < categorias.size(); i++) {
            Categoria get=categorias.get(i);
            if (ent.getId()==get.getId()){
                if(!categorias.contains(ent)){
                    categorias.set(i,ent);
                }
            }
        }
    }


    public void remover(int id) {
        for (int i = 0; i < categorias.size(); i++) {
            Categoria get = categorias.get(i);
            if(get.getId() == id){
                categorias.remove(i);
            }
        }
    }


    public List<Categoria> consultar() {
        return categorias;
    }
    
}

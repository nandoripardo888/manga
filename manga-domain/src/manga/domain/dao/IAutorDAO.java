/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manga.domain.dao;

import java.util.List;
import manga.domain.entidades.Autor;

/**
 *
 * @author aluno
 */
public interface IAutorDAO {
    public void inserir(Autor ent);
    public void atualizar(Autor ent);
    public void remover(int id);
    public List<Autor> cosultar();
}

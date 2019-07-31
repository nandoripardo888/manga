/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manga.domain.dao;

import java.util.List;
import manga.domain.entidades.Capitulo;

/**
 *
 * @author aluno
 */
public interface ICapituloDAO {
    public void inserir(Capitulo ent);
    public void atualizar(Capitulo ent);
    public void remover(int id);
    public List<Capitulo> cosultar();
}

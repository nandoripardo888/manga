/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manga.domain.dao;

import java.util.List;
import manga.domain.entidades.Editora;

/**
 *
 * @author aluno
 */
public interface IEditoraDAO {
    public void inserir(Editora ent);
    public void atualizar(Editora ent);
    public void remover(int id);
    public List<Editora> cosultar();
}

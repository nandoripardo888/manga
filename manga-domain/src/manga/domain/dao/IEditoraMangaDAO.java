/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manga.domain.dao;

import java.util.List;
import manga.domain.entidades.EditoraManga;

/**
 *
 * @author aluno
 */
public interface IEditoraMangaDAO {
    public void inserir(EditoraManga ent);
    public void atualizar(EditoraManga ent);
    public void remover(int id);
    public List<EditoraManga> cosultar();
}

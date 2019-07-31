/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manga.domain.dao;

import java.util.List;
import manga.domain.entidades.AutorManga;

/**
 *
 * @author aluno
 */
public interface IAutorMangaDAO {
    public void inserir(AutorManga ent);
    public void atualizar(AutorManga ent);
    public void remover(int id);
    public List<AutorManga> cosultar();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manga.domain.dao;

import java.util.List;
import manga.domain.entidades.Manga;

/**
 *
 * @author aluno
 */
public interface IMangaDAO {
    public void inserir(Manga ent);
    public void atualizar(Manga ent);
    public void remover(int id);
    public List<Manga> cosultar();
}

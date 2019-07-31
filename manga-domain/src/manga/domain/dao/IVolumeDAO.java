/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manga.domain.dao;

import java.util.List;
import manga.domain.entidades.Volume;

/**
 *
 * @author aluno
 */
public interface IVolumeDAO {
    public void inserir(Volume ent);
    public void atualizar(Volume ent);
    public void remover(int id);
    public List<Volume> cosultar();
}

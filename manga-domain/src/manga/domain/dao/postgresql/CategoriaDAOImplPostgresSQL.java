package manga.domain.dao.postgresql;

import java.util.ArrayList;
import java.util.List;
import manga.domain.dao.ICategoriaDAO;
import manga.domain.entidades.Categoria;

public class CategoriaDAOImplPostgresSQL implements ICategoriaDAO{

    @Override
    public void inserir(Categoria ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Categoria ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> consultar() {
        try{
            List<Categoria> lista = new ArrayList<>();
            return lista;
        }catch(Exception erro){
            erro.printStackTrace();
        }
        return null;
    }
    
}

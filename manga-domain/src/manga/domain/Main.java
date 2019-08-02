/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manga.domain;

import java.util.Scanner;
import manga.domain.dao.ICategoriaDAO;
import manga.domain.dao.list.CategoriaDAOImpl;
import manga.domain.entidades.Categoria;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ICategoriaDAO banco = new CategoriaDAOImpl();
        Scanner t = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Remover");
            System.out.println("4 - Consultar");
            System.out.println("5 - Sair");
            opcao = t.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Cadastrando......");
                    Categoria nova = new Categoria();
                    System.out.println("Digite o nome:");
                    nova.setNome(t.next());
                    try{
                    banco.inserir(nova);
                    System.out.println("Inserido com sucesso!");
                    }catch(Exception erro){
                        System.out.println(erro.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Atualizando...");
                    System.out.println("Digite o ID:");
                    Categoria c = new Categoria();
                    c.setId(t.nextInt());
                    System.out.println("Digite o nome:");
                    c.setNome(t.next());
                    banco.atualizar(c);
                    System.out.println("1Atualizado com sucesso!");
                case 3:
                    System.out.println("Removendo...");
                    System.out.println("Digite o ID:");
                    banco.remover(t.nextInt());
                    System.out.println("Removido com sucesso");
                    break;
                case 4:
                    System.out.println("Listando...");
                    for (Categoria ent : banco.consultar()) {
                        System.out.println(ent.getId() + "-" +ent.getNome());
                        
                    }
                    break;
                case 5:
                    break;
                    
                default:
                    System.out.println("Opção Invalida");
                    
            }
        } while (opcao != 5);
    }
}

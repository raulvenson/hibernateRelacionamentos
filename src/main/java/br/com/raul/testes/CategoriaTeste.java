/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.raul.testes;

import br.com.raul.model.domain.Categoria;
import br.com.raul.model.dao.CategoriaDAO;

/**
 *
 * @author VRauuul
 */
public class CategoriaTeste {

    public static void main(String[] args) {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        Categoria categoria = new Categoria();
        
        /*Incluindo nova Categoria*/
        categoria.setDescricao("Bebida");
        categoriaDAO.save(categoria);
        
        /*Alterando uma Categoria*/
//        categoria.setId(2);
//        categoria.setDescricao("Bebida 2");
//        categoriaDAO.save(categoria);

        /*Buscando uma Categoria pelo ID*/
//        categoria = categoriaDAO.findById(1);
//        System.out.println("ID: " + categoria.getId());
//        System.out.println("Descrição: " + categoria.getDescricao());
        
        /*Buscando todas as Categorias*/
//        for (Categoria categoria : categoriaDAO.findAll()) {
//            System.out.println("ID: " + categoria.getId());
//            System.out.println("Descrição: " + categoria.getDescricao());
//            System.out.println("--------------------");
//        }

        /*Removendo uma Categoria pelo ID*/
//        categoriaDAO.remove(4);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.raul.testes;

import br.com.raul.model.domain.Produto;
import br.com.raul.model.control.CategoriaControl;
import br.com.raul.model.dao.ProdutoDAO;

/**
 *
 * @author VRauuul
 */
public class ProdutoTeste {

    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto = new Produto();
        CategoriaControl categoriaControl = new CategoriaControl();
        

//        Categoria categoria = new Categoria();
//        categoria.setId(2);

        /*Inclusão de um novo Produto*/
//        produto.setDescricao("Suco");
//        produto.setQuantidade(5);
//        produto.setValor(2.5);
//        produto.setCategoria(categoriaControl.find(2));
//        produtoDAO.save(produto);

        produto = produtoDAO.findById(1);

        System.out.println("ID: " + produto.getId());
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Categoria: " + produto.getCategoria().getDescricao());
        
        /*Alteração de Produto com ID*/
//        produto.setId(2);
//        produto.setDescricao("Refrigerante");
//        produto.setQuantidade(5);
//        produto.setValor(2.5);
//        produto.setCategoria(categoria);
//        produtoDAO.save(produto);

        /*Buscando produto pelo ID*/
//        produto = produtoDAO.findById(1);
//        System.out.println("ID: " + produto.getId());
//        System.out.println("Descrição: " + produto.getDescricao());
//        System.out.println("Quantidade: " + produto.getQuantidade());
//        System.out.println("Valor: " + produto.getValor());
//        System.out.println("Categoria: " + produto.getCategoria().getDescricao());

        /*Buscando todas os Produtos*/
//        for (Produto produto : produtoDAO.findAll()) {;
//            System.out.println("ID: " + produto.getId());
//            System.out.println("Descrição: " + produto.getDescricao());
//            System.out.println("Quantidade: " + produto.getQuantidade());
//            System.out.println("Valor: " + produto.getValor());
//            System.out.println("Categoria: " + produto.getCategoria().getDescricao());
//            System.out.println("---------------------------");
//        }

        /*Removendo um Produto pelo ID*/
//        produtoDAO.remove(2);
    }

}

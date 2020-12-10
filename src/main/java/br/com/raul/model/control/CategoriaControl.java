/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.raul.model.control;

import br.com.raul.model.domain.Categoria;
import br.com.raul.model.dao.CategoriaDAO;

/**
 *
 * @author raul.venson
 */
public class CategoriaControl {

    public CategoriaControl() {
    }
    
    public Categoria findById(Integer id){
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        return categoriaDAO.findById(id);
    }
    
}

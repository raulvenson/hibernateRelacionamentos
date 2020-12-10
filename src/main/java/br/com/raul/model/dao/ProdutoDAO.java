/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.raul.model.dao;

import br.com.raul.connection.ConnectionFactory;
import br.com.raul.model.bean.Produto;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author VRauuul
 */
public class ProdutoDAO {

    public void save(Produto produto) {
        EntityManager em = new ConnectionFactory().getConnection();
        try {
            em.getTransaction().begin();
            if (produto.getId() == null) {
                em.persist(produto);
            } else {
                em.merge(produto);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public Produto findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Produto produto = null;
        try {
            produto = em.find(Produto.class, id);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return produto;
    }

    public List<Produto> findAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Produto> lProdutos = null;
        try {
            lProdutos = em.createQuery("from Produto p").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return lProdutos;
    }
    
    public void remove(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Produto produto = null;
        try{
            em.getTransaction().begin();
            produto = em.find(Produto.class, id);
            em.remove(produto);
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }

}

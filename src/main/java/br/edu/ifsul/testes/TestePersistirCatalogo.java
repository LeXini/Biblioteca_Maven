/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Catalogo;
import br.edu.ifsul.modelo.Livraria;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author marco
 */
public class TestePersistirCatalogo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca-Maven");
        EntityManager em = emf.createEntityManager();
        Catalogo c = new Catalogo();
        c.setNome("Romance");
        c.setDescricao("Catalogo de romances");
        c.setLivraria(em.find(Livraria.class,1));
   
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Livraria;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author marco
 */
public class TestePersistirLivraria {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca-Maven");
        EntityManager em = emf.createEntityManager();
        Livraria l = new Livraria();
        l.setNome("Municipal");
        l.setSite("www.bibliotecamunicipal.com.br");
   
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}

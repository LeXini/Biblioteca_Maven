/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Autor;
import br.edu.ifsul.modelo.LivroBasico;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author marco
 */
public class TestePersistirLivrosBasicos {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca-Maven");
        EntityManager em = emf.createEntityManager();
        Autor a1 = em.find(Autor.class, "Machado de Assis");
        LivroBasico lb1 = em.find(LivroBasico.class, 1);
        a1.getLivrosBasicos().add(lb1);
        
        em.getTransaction().begin();
        em.persist(lb1);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}

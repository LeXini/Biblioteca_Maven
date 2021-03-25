/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.LivroBasico;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author marco
 */
public class TestePersistirLivroBasico {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca-Maven");
        EntityManager em = emf.createEntityManager();
        LivroBasico lb = new LivroBasico();
        lb.setISBN("1");
        lb.setTitulo("Memórias Póstumas de Brás Cubas"); 
        lb.setResumo("Memórias de uma pessoa...");
        lb.setEditora("Brasil Livros");
        lb.setDataPublicacao(Calendar.getInstance());
        
        em.getTransaction().begin();
        em.persist(lb);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Formato;
import br.edu.ifsul.modelo.Idioma;
import br.edu.ifsul.modelo.Livro;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author marco
 */
public class TestePersistirLivro {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca-Maven");
        EntityManager em = emf.createEntityManager();
        Livro li = new Livro();
        li.setISBN("1");
        li.setTitulo("O magico de OS");
        li.setResumo("Livro com um monte de coisas");
        li.setEditora("Abril");
        li.setDataPublicacao(new GregorianCalendar(1900, Calendar.DECEMBER, 02));
        li.setCodigoBarras("1234567890");
        li.setNumeroPaginas(2);
        li.setAtivo(true);
        li.setDataCadastro(new GregorianCalendar(1903, Calendar.SEPTEMBER, 25));
        li.setIdioma(em.find(Idioma.class, 1));
        li.setFormato(em.find(Formato.class, 1));
   
        em.getTransaction().begin();
        em.persist(li);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}

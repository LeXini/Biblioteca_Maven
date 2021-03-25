
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Catalogo;
import br.edu.ifsul.modelo.Livraria;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorgebavaresco@ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
public class TestePersistirListaCatalogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca-Maven");
        EntityManager em = emf.createEntityManager();
        Livraria lv = em.find(Livraria.class, 1);
        Catalogo c = em.find(Catalogo.class, 3);
        lv.adicionarCatalogo(c);     
        em.getTransaction().begin();
        em.persist(lv);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}

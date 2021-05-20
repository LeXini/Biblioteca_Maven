/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.utilrelatorios;

import br.edu.ifsul.modelo.Livraria;
import br.edu.ifsul.modelo.Livro;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author marco
 */
public class FabricaObjetos {
    public static List<Livraria> carregaLivrarias(){
        List<Livraria> lista = new ArrayList<>();
        Livraria livraria = new Livraria();
        livraria.setId(1);
        livraria.setNome("Biblioteca");
        livraria.setSite("biblio.com");
//        Livro livro = new Livro();
//        livro.setISBN("1");
//        livro.setTitulo("a bela e a fera");
//        livro.setResumo("ficcao");
//        livro.setEditora("moderda");
//        livro.setDataPublicacao(new GregorianCalendar(1903, Calendar.SEPTEMBER, 25));
//        livro.setCodigoBarras("111");
//        livro.setNumeroPaginas(2);
//        livro.setAtivo(true);
//        livro.setDataCadastro(new GregorianCalendar(1998, Calendar.SEPTEMBER, 05));
//        livro.setValor(10.0);
        lista.add(livraria);
        return lista;
    }
}

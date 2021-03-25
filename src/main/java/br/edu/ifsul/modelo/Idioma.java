/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @author marco
 */
@Entity
@Table(name = "idioma")
public class Idioma implements Serializable {
    
    @Id
    @SequenceGenerator(name = "seq_time", sequenceName = "seq_time_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_time", strategy = GenerationType.SEQUENCE)    
    private Integer id;
    
    @NotBlank(message = "O nome não pode ser em branco")
    @Length(max = 50, message = "O nome não pode ter mais que {max} caracteres")
    @Column(name = "nome", nullable = false, length = 50) 
    private String nome;
    
    @NotBlank(message = "A sigla não pode ser em branco")
    @Length(max = 10, message = "A sigla não pode ter mais que {max} caracteres")
    @Column(name = "sigla", nullable = false, length = 10)
    private String sigla;

    public Idioma() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc.objetos;

/**
 *
 * @author SATC
 */
public class Grupo  {
    private int id;
    private String nome;
    private String descricao;

    public Grupo(String nome, String descricao) {
        this.id = 0;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + '}';
    }
     
    
    }
    
  


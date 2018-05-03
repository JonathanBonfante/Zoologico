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
public abstract class Animal {
    
   private int id;
   private Grupo grupo;
   private String descricao;
   private char status;

    public Animal( Grupo grupo, String descricao, char status) {
        this.id = 0;
        this.grupo = grupo;
        this.descricao = descricao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", grupo=" + grupo + ", descricao=" + descricao + ", status=" + status + '}';
    }

  

   
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc.objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class Zoologico {
    private  int id;
    ArrayList<Animal>animais = new ArrayList<>();

    public Zoologico() {
        this.id = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

  

    @Override
    public String toString() {
        String listaDeAnimais = "";
        for (Animal animal: animais) {
        listaDeAnimais += animal.getDescricao()+ "\n";
        }
        return "Zoologico{" + "id=" + id + ", animais=" + animais + '}';
    }

   
    
    
   
   
   
    
    

   
   
    
    
}

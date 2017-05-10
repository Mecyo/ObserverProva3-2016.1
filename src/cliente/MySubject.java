/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.util.Observable;

/**
 *
 * @author emersant
 */
public class MySubject extends Observable{
    
    private String nome;

    public MySubject(String nome) {
        this.nome = nome;
    }
    
    public void changeState(String arg) {
        setChanged();
        notifyObservers(arg);
    }

    @Override
    public String toString() {
        return nome;
    }
    
}

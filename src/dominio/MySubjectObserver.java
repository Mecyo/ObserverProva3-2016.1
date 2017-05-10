package dominio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author emersant
 */
public class MySubjectObserver extends Observable implements Observer{
    
    private String nome;

    public MySubjectObserver(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void update(java.util.Observable o, Object arg) {
        System.out.println(o.toString() + " mudou estado para " + arg + ", estou mudando o meu também para " + arg + " pelo objeto " + this.toString());
        setChanged();
        notifyObservers(arg);
    }

    @Override
    public String toString() {
        return nome;
    }

}

package cliente;

import java.util.Observer;

/**
 *
 * @author Mecyo Santos
 */
public class App {

    /**
     * @param args the command line arguments
     * 
     * 
     * Questão 1) (6,0) Implemente o padrão Observer de modo a suportar cadeias de observers em modo
push. Para isso um objeto deve poder atuar ao mesmo tempo tanto como subject quanto como observer.
Realize a implementação utilizando as classes Observer e Observable do Java de modo que o código
abaixo funcione:
MySubject s1 = new MySubject();
Object so1 = new MySubjectObserver()
Object so2 = new MySubjectObserver()
s1.attach((Observer) so1);
((Subject) so1).attach((Observer) so2);
s1.changeState(); // Deve imprimir:
“s1 mudou estado para X, estou mudando o meu também para X” pelo objeto so1
“so1 mudou estado para X, estou mudando o meu também para X” pelo objeto so2
OBS: X deve ser uma String e pode assumir qualquer valor.
     * 
     * 
     * 
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        MySubject s1 = new MySubject("s1");
        Object so1 = new MySubjectObserver("so1");
        Object so2 = new MySubjectObserver("so2");
        s1.addObserver((Observer) so1);
        ((MySubjectObserver) so1).addObserver((Observer) so2);
        s1.changeState("TESTE");
    }
    
}

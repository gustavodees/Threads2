package principal;

import model.Contador;


public class Threads {

    public static void main(String[] args) throws InterruptedException {
        
        Contador c1 = new Contador(1,50);
        Contador c2 = new Contador(51,100);
        Contador c3 = new Contador(101,150);
        
        c1.start();
        c2.start();
        c3.start();
        
        c1.join();
        c2.join();
        c3.join();
        
        
        int totaldePrimos = c1.getContagem() + c2.getContagem() + c3.getContagem();
        
        System.out.println("Total de números primos é: " + totaldePrimos);
        
        
    }
}

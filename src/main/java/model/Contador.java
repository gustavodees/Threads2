package model;

/**
 *
 * @author 10724238393
 */
public class Contador extends Thread {

    
    private int inicio, fim;
    private int contagem = 0;
    
    public Contador(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }
    
    
    @Override
    public void run(){
        System.out.println(this.getName() + " encontrou uma thread");
        for(int i = inicio; i<= fim; i++)
            if(primo(i)){
                contagem++;
                System.out.println(i + " ");
            }
    }
    
    public int getContagem(){
        return contagem;
    }
    
   
    
    public static boolean primo(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return true;
    }

   
        
        
        
    
    
}

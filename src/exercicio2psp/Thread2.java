package exercicio2psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ylagorebollar
 */
public class Thread2 extends Thread{
    public Thread2(String name) {
        super(name);
    }
    
    public void run(){
        for(int i=0;i<5;i++){   
        try {
            System.out.println("Numero de iteracion: "+i +" Nome: "+getName());           
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}


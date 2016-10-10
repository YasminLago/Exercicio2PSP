/*
 Programa que crea 4 hilos, los ejecuta y espera a 
que estos terminen. Los hilos escriben 5 veces el 
número de iteración del bucle y su nombre. En cada iteración, 
después de escribir su nombre, se bloquean durante un segundo y 
vuelven a estar disponibles para su ejecución. 
 */
package exercicio2psp;

/**
 *
 * @author ylagorebollar
 */
public class Exercicio2PSP {
    public static void main(String[] args) {
       new Thread2("Hilo1").start();
       new Thread2("Hilo2").start();
       new Thread2("Hilo3").start();
       new Thread2("Hilo4").start();
    }
    
}

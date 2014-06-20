/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.capitulo4.tredsillos;

/**
 *
 * @author Jonny
 * Podemos bautizar el thread con un nombre 
 * o si no java les asigna uno por defecto vamos aver cual es y su modificacion
 */
public class Intermedia implements Runnable{
    public static void main(String args[]){
        //paso 1 crear el Thread
        Runnable r = new Intermedia();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        //paso 2 inicializarlo
        t1.start();
        t2.start();
        t3.start();
        
        t1.setName("imprecion");
        t2.setName("conexion");//desabilitaremos como ejemplo mientras los demas ejecutan el run
        t3.setName("guardar");
        
        
    }
/*
    Crear dos Threads t2 y t3 para que imprima 3 veces el resultado
    */
    @Override
    public void run() {
        //System.out.println("Soy un Thread mediano :)");
        try {//esto se pone cuando este algo que no se puede resolver 
        
         if(Thread.currentThread().getName().equals("conexion"))Thread.sleep(8000);
          System.out.println(Thread.currentThread().getName());
        /*if(Thread.currentThread().getName())Thread.sleep(8000);
          System.out.println(Thread.currentThread().getName());*/

          
        }catch(Exception e){}
    }
    //Tarea hacer que cada thread se imprima cada 2 segundos
    
}

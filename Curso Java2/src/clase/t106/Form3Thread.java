/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.t106;

import java.util.Calendar;

/**
 *
 * @author Jonny
 * Se ocupa para tareas asincronas es decir tareas que se ejecutan continuamente
 * de fondo.
 * ya no usa implments
 */
public class Form3Thread {
    public static void main (String args[]){
        Thread t1= new Thread(new Runnable(){
            public void run(){
                while(true){
                    try {
                        Calendar cal = Calendar.getInstance();
                        int hora = cal.get(Calendar.HOUR);
                        int minuto = cal.get(Calendar.MINUTE);
                        String horac = (hora + ":" + minuto);
                        if (hora == 7 && minuto ==32){
                            System.out.println("Ya Termino la CLase");
                        }
                        Thread.sleep(1000);
                    }catch(Exception e){}
           
                }//While
            }
        }
        
        );
        t1.start();
        
    }
    
}

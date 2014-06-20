/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.t106;

import com.capitulo4.tredsillos.Intermedia;
import java.util.Calendar;

/**
 *
 * @author Jonny
 */
public class SolucionLaHora implements Runnable{
    public static void main(String[] args) {
        Runnable lh = new Intermedia();
        Thread t1 = new Thread(lh);
        t1.start();
    }

    @Override
    public void run() {
       while(true){
           try {
                Calendar cal = Calendar.getInstance();
                int hora = cal.get(Calendar.HOUR);
                int minuto = cal.get(Calendar.MINUTE);
                String horac = (hora + ":" + minuto);
                if (hora == 19 && minuto ==18){
                    System.out.println("Ya Termino la CLase");
                }
                Thread.sleep(1000);
           }catch(Exception e){}
           
       }//While
    }
}

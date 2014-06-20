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
public class NewMain implements Runnable {

    public static void main(String[] args) {
        Runnable c = new Intermedia();
        Thread t1 = new Thread(c);
        t1.start();
    }

    @Override
    public void run() {
        Calendar cal = Calendar.getInstance();
        int hora = cal.get(Calendar.HOUR);
        int minuto = cal.get(Calendar.MINUTE);
        int segundo = cal.get(Calendar.SECOND);
        String horac = (hora + ":" + minuto + ":" + segundo);
        System.out.println("Fecha actual: " + horac);
//String la_hora = hora + “:” + minuto + “:”segundos;
    }
    
}

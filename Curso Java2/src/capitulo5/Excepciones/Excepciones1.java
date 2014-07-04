/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package capitulo5.Excepciones;

/**
 *
 * @author Jonny
 */
public class Excepciones1 {
    public static void main(String args[]){
        int x = 8;
        //int y = 0;//al poner cero se interrumpe la compilacion linea a linea
        float y = 0;//al ser flotante hace un casting directo y sigue compilando 
        System.out.println("Vamos a hacer una divicion erronea");
        System.out.println(x/y);
        System.out.println("Si no ocurre la excepcion si aparece el resultado");
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.capitulo4.tredsillos;

/**
 *
 * @author Jonny
 * 
 *                              Clase de Threads
 * Ahi 3 formas que veremos
 * Ya creamos un packages com.capitulo4.tredsillos
 * y creamos esta clase llamada facil
 * veamos como crear la primera forma
 * La forma #1 Tiene las siguientes caracteristicas:
 * Los threads se crean heredando la clase Thread
 *      Ventajas: Es muy facil
 *      Desventajas: Desgastamos la herencia
 * Extends: significa hereda a...
 * 
 */
public class Facil extends Thread {
    
    public void run(){
        //Encontrar en ejecucion
        System.out.println("Soy un Thread Solitario :(");
    }
    
}

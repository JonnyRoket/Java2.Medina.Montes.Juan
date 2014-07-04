/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package E.T.E;

/**
 *
 * @author Jonny
 */
public class SaldoFueraDeRangoException extends Exception{
    public SaldoFueraDeRangoException(){
        super("Saldo Fuera de Rango [20000 - 25000]");
        System.out.println("Saldo Fuera de Rango [20000 - 25000]");
    }
    
}

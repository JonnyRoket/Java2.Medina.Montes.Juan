/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package E.T.E;

/**
 *
 * @author Jonny
 * 
 *  * 1.- crear una clase con sus getters and setters de el siguiente diagrama.
 *      Nomina
 *          - float saldo;
 *          - int idTrabajador;
 * 2.- Agregar 2 constructores, uno sin argumentos y otro que inicialize sus 
 * atributos 
 * 3.- Crear una clase que se llame TestNomina que contenga el metodo main
 *      En el metodo main crear dos objetos con los siguientes valores
 *          saldo = 20000               saldo = 27496.50
 *          id = 1                      id = 2
 */
public class Nomina {
   private float saldo;
   private int idTrabajador;

   
    public Nomina(float saldo, int idTrabajador) {
        this.saldo = saldo;
        this.idTrabajador = idTrabajador;
    }
    

    public Nomina() {
    }
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) throws SaldoFueraDeRangoException{
        
        if (saldo < 20000 || saldo > 25000) throw new SaldoFueraDeRangoException();
        else this.saldo = saldo;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
   
    
}

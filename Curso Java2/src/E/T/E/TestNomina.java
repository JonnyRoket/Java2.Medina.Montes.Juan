/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package E.T.E;


/**
 *
 * @author Jonny
 * 4.- Crear una exepcion que se llame: 
 *      SaldoFueraDeRangoException
 * cuyo objetivo sea impedir que se introduzca un saldo fuera de este rango
 * [20000 - 25000]
 * 
 * 5.- En el metodo setSaldo agrgar la excepcion anterior
 * 6.- Probar la excepcion en la clase con el main con un SaldoFuera de rango 
 * usando el bloque Try/Cath
 */
public class TestNomina {
     
  
    public static  void main(String args[]){
        Nomina n1 = new Nomina (20000,1);
        Nomina n2 = new Nomina (27496.50f, 2);
        
        try {
            n2.setSaldo(20000);
            System.out.println("El saldo es Correcto");
          
        } catch (SaldoFueraDeRangoException e) { 
            System.out.println(e.getMessage());
        };
        
    }
        
        
}


    


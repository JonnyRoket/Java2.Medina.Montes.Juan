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
public class Cuenta {
    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo)throws SaldoNegativoException{ /* se pueden
        poner varias Excepciones separadas por "," throws Exception1,Exeption2 {
        throws puede lanzarce una es como un aviso de que se pueden usar exceptions
        y trow es lanzar la exception*/
        if(saldo<0) throw new SaldoNegativoException();
//this.saldo = 0;// aqui debe de cumplir la ejecucion si se cumple la condicion
        else this.saldo = saldo;
    }

    
            
    
}

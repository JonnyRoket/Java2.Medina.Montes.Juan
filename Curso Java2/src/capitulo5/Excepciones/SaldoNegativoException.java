/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package capitulo5.Excepciones;

/**
 *
 * @author Jonny
 * Ahora decimos que SaldoNegativoException hereda y se vuelve hija de Exception
 * Exception tiene tiene contructores
 *      Exception();// Aqui solo muestra que ahi un error
 *      Exception(String algo);// en este puede ir el mensaje que quiere 
 * que aparesca en la Exception
 * 
 *Todos los atributos y metodos que tiene Exception se heredan excepto 
 * los contrusctores 
 */

public class SaldoNegativoException extends Exception{
    public SaldoNegativoException(){
        super("Saldo Insuficiente");/* aqui ponemos la version que queremos de la clase heredada
        usamos Exception(string algo)*/
        System.out.println("Saldo insuficiente");
    }
  
    
}

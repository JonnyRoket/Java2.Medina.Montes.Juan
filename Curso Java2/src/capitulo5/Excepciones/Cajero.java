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
public class Cajero {

    /**
     * @param args the command line arguments
     * Esto ahi que hacerlo en un formulario
     */
    public static void main(String[] args) {
        try {
            Cuenta c = new Cuenta ();
            c.setSaldo(-200);
        } catch (SaldoNegativoException e) { 
            //EtiquetaX.setText(e.getMessage());
        }
    }
    
}

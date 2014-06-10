/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursos.capitulo2.tipos;

/**
 *
 * @author Jonny
 */
public class Tipos {
    static int algo; //las variables sin constructor se inicializan aqui

    public static void main(String...x){
        //declaramos un arreglo de enteros:
        //int []arreglo1 = new int[3]; forma 1 de inicializar los arreglos
        int []arreglo1 = {-20,7,8};
        //System.out.println(arreglo1[0]);//siempre inicia con el indice que es 0
        
        //System.out.println(algo);
        
       /* for(int i=0;i< arreglo1.length ;i++){//length(longitud) verifica cual es el tamaño del arreglo y se ajusta al tamaño
            System.out.println(arreglo1[i]);
        
        }*/
       /*
        El tipo de dato sobre el que se va iterar se relacionan al tipo de dato del arreglo
        */ 
        for(int i : arreglo1){
            System.out.println(i);
        }
        
    }
    
    
}

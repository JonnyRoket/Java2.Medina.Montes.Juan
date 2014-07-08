/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Coleccciones;

import java.util.ArrayList;

/**
 * @author Jonny
 */
public class Colecciones {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.setId(1);
        u1.setEmail("jonny@live.com.mx");
        u1.setNombre("Juan Jose");
        u1.setPaterno("Medina");
        u1.setSueldo(70000);
        Usuario u2 = new Usuario(2, "Jhovana", "Bernal", "jhovana@live.com.mx", 100000);
        Usuario u3 =  new Usuario(3, "Estefania", "Martinez", "estefania@live.com", 200000);
        //creamos un arraylist de tipo Usuario importando arraylist
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        for(Usuario u:usuarios){
            System.out.println(u);
        }
        //System.out.println("Ya se guardo el objeto:" + u1);
        
    }
    
}

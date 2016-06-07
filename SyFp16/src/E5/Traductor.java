/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jjlui
 */
public class Traductor {
    
    
   List <String> palabra;
   List<String> traduccion;
   String text1;
   String t;
   String t1;
    
    public String traducir(String text1){
      
      int i;
       i = palabra.indexOf(text1);
       if (i== -1){
            return text1;
       }
       else return traduccion.get(i);
    }
    
    public void agregar(String traduccion1, String palabra1){
        palabra.add(palabra1);
        traduccion.add(traduccion1);
        
    }
    
    public  Traductor(){
        palabra = new ArrayList<>();
        traduccion =new ArrayList<>();
    }
    
    public static void main(String[] args) {
        Traductor tradujo= new Traductor();
        tradujo.agregar("hola", "hello");
        List<Traductor> lista;
        lista = new ArrayList<>();
        
        
    }
    
    
}

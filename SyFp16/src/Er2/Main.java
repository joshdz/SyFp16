/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Er2;

/**
 *
 * @author jjlui
 */
public class Main {
    public static void main(String[] args) {
        Atexto at = new Atexto();
        Abinario ab = new Abinario();
        Aimagen ai = new Aimagen();
        
        at.abrirArchivo("archivo1", "archivo2");
        at.cerrarArchivo();
        at.desplegarArchivo();
        
        ab.abrirArchivo("archivo1", "Archivo2");
        ab.cerrarArchivo();
        ab.desplegarArchivo();
        
        ai.abrirArchivo("A1", "a2");
        ai.cerrarArchivo();
        ai.desplegarArchivo();
    }
           
}

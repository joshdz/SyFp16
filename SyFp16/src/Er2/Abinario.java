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
public class Abinario extends Archivo {

    
    public int abrirArchivo(String nombreArchivo, String tipoArchivo) {
        return 1;
    }

  
    public int cerrarArchivo() {
        return 0;
    }

    
    public void desplegarArchivo() {
        System.out.println("Se ha abierto");
    }
    
}

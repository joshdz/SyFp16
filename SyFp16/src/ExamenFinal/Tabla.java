/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

/**
 *
 * @author jjlui
 */
public class Tabla {
    String arrStr[];
    String m[][];
    String AMEX;
    String CASH;
    String CHEC;
    String MAST;
    String OTHE;
    String VISA;
    String nombreArchivo;
    int i = 0;
    

    public Tabla(String a) {
        nombreArchivo= a;
        m = new String [6][3];
        m[0][0]= "1";
        m[0][1]= "AMEX";
        m[0][3]= "";
        
         m[0][0]= "2";
        m[0][1]= "AMEX";
        m[0][3]= "";
        
         m[0][0]= "3";
        m[0][1]= "CHEC";
        m[0][3]= "";
        
         m[0][0]= "4";
        m[0][1]= "MAST";
        m[0][3]= "";
        
         m[0][0]= "5";
        m[0][1]= "OTHE";
        m[0][3]= "";
        
         m[0][0]= "6";
        m[0][1]= "VISA";
        m[0][3]= "";
        
    }
    
}

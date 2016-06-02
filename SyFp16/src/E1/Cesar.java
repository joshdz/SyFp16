/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

/**
 *
 * @author jjlui
 */
public class Cesar {
   public String cifrar(String m, int c){
       
       String resultado;
       resultado = "";
       
       
       for(int i = 0; i < m.length();  i++){
           
           if ((int)m.charAt(i)==10){
               resultado = resultado +m.charAt(i);
           }
           else {
               resultado= resultado+(char)(m.charAt(i)+c);
           }
           
       }
        
       return resultado;
   }
    
    public static void main(String[] args) {
        Cesar cc= new Cesar();
        String s1 = cc.cifrar("hola",5);
        System.out.println(cc.cifrar("hola",5));
        cc.descifrar(s1, 5);
        System.out.println(cc.descifrar(s1,5));
       }
    public String descifrar(String s, int c){
        
        String resultado1;
        resultado1=("");
                
        for(int i = 0; i < s.length();  i++){
         
           resultado1= resultado1+(char)(s.charAt(i)-c);
           
       }
    return resultado1;
}
    
    
}

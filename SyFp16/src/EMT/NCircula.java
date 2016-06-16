/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EMT;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jjlui
 */
public   class NCircula implements Inocircula {
     public String dia;
     public String digitos;
     public String color;
     public String hoy;
    
   
    @Override
    public String getHoyNoCircula(){
        
        return ("Hoy no circulan los vehículos con engomado color Verde y terminación 1 y 2");
    }
    @Override
    public String getByPlaca(String dia){
        
        if(digitos == "5" || digitos == "6" ){
         return dia = "Lunes";
        }
        
        if(digitos == "7" || digitos == "8" ){
         return dia = "Martes";
        }
        if(digitos == "3" || digitos == "4" ){
         return dia = "Miercoles";
        }
        if(digitos == "1" || digitos == "2" ){
         return dia = "Jueves";
        }
        if(digitos == "9" || digitos == "0" ){
         return dia = "Viernes";
        }
        
        
        else  return ("");
    }
    @Override
    public String getTerminacionPlaca(String digitos){
        return ("");
    }
    @Override
    public String getColor(String color){
        return ("");
    }

    
    
    
    
   
}

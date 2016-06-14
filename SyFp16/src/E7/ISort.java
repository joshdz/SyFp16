/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jjlui
 */
public class ISort implements Iordenar  {

    @Override
    public int[] ordenar(int[] array) {
         int i[];//variable de int[]
         System.out.println("Estoy en la clase Isort y en el metodo ordenar array");
         return array;
    }

    @Override
    public List<Integer> ordenar(List<Integer> array) {
       ArrayList a = new ArrayList<>();//instancia ArrayList
       Integer i1 = new Integer("8");
       Integer i2 = new Integer("7");
       Integer i3 = new Integer("6");
       Integer i4 = new Integer("5");
       Integer i5 = new Integer("4"); // instancias de integer
      
       a.add(i1);
       a.add(i2);
       a.add(i3);
       a.add(i4);
       a.add(i5);
       
       return a;
    }
    
}

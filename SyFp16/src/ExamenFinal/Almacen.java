/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ExamenFinal;

import java.util.ArrayList;

/**
 *
 * @author jjlui
 */
public class Almacen implements iAlmacen {
    
    ArrayList<Productos> p1;
    
    public Almacen() {
        p1 = new ArrayList();
        
    }
    
    @Override
    public void Comprar(Productos p) {
        p1.add(p);
    }
    
    @Override
    public Productos BuscarProducto(String s) {
        for (int i = 0; i < p1.size() ; i++) {
            if(p1.get(i).getNombre().equals(i)){
                return p1.get(i);
            }
        }
        return null;
    }
    
    @Override
    public void MostrarProductos() {
        System.out.println(p1);
    }
    
    @Override
    public int ContarProductos() {
        int i1 = 0;
        for (int i = 0; i < p1.size(); i++) {
            i1 = i +p1.size();
        }
        return i1;
    }
    
    @Override
    public int ContarTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

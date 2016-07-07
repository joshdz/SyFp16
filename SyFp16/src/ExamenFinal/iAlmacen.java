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
public interface iAlmacen {

    public void Comprar(Productos p);

    public Productos BuscarProducto(String s);

    public void MostrarProductos();

    public int ContarProductos();

    public int ContarTipo();

}

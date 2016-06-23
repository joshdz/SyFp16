/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Banco;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jjlui
 */
public class Banco {
    
    List<Cuenta> ListaCuenta;
    List<Cliente> ListaClientes;
    
    public Banco() {
        ListaClientes = new ArrayList<>();
        ListaCuenta = new ArrayList<>();
    }
    
    public void agregarCliente(Cliente c) {
        ListaClientes.add(c);
    }
    
    public void agregarCuenta(Cuenta c1) {
        ListaCuenta.add(c1);
    }
    
    public void guardarCliente() {
        try (FileWriter fw = new FileWriter("clientes.txt", true)) {
            for (Cliente cl : ListaClientes) {// recorre cada cliente dentro de la lista
                fw.write(cl.getIdCuenta() + "," + cl.getNombre() + "," + cl.getEdad() + "," + cl.getNumCuenta() + "\n");
            }
            
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
        
    }
    
    public void guardarCuenta() {
        try (FileWriter fw = new FileWriter("Cuenta.txt", true)) {
            for (Cuenta cl : ListaCuenta) {// recorre cada cliente dentro de la lista
                fw.write(cl.getNumCliente() + "," + cl.getNumCuenta() + "\n");
            }
            
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
        
    }
    
    public static void main(String[] args) {
        Banco b = new Banco();
        Cliente c = new Cliente("Jose Luis", 21, 1, 1);
        Cliente c1 = new Cliente("Lee", 19, 2, 2);
        Cliente c2 = new Cliente("Dan", 18, 3, 3);
        Cliente c3 = new Cliente("Arturo", 22, 4, 4);
        Cliente c4 = new Cliente("But", 24, 5, 5);
        
        b.agregarCliente(c); b.agregarCliente(c1); b.agregarCliente(c2); b.agregarCliente(c3);
        b.agregarCliente(c4);
        b.guardarCliente();
        
        Cuenta cu = new Cuenta(1,1);
        Cuenta cu1 = new Cuenta(2,2);
        Cuenta cu2 = new Cuenta(2,2);
        Cuenta cu3 = new Cuenta(3,3);
        Cuenta cu4 = new Cuenta(4,4);
        
        b.agregarCuenta(cu);
        b.agregarCuenta(cu1);
        b.agregarCuenta(cu2);
        b.agregarCuenta(cu3);
        b.agregarCuenta(cu4);
        b.guardarCuenta();
        
    }
}

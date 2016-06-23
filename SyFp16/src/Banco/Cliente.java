/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author jjlui
 */
public class Cliente {

    String nombre;
    int edad;
    int idCuenta;
    int numCuenta;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public Cliente(String nombre, int edad, int idCuenta, int numCuenta) {
        this.nombre = nombre;
        this.edad = edad;
        this.idCuenta = idCuenta;
        this.numCuenta = numCuenta;
    }

}

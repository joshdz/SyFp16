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
public class Productos {

    String nombre;
    String tipo;

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Productos(String tipo) {
        this.tipo = tipo;
    }

    public void Imprimir() {
        System.out.println(nombre);
        System.out.println(tipo);
    }

    public static void main(String[] args) {

    }
}

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
public class ExceptionCuenta extends Exception {

    public ExceptionCuenta(String message) {
        super(message);
    }

    public ExceptionCuenta(String message, Throwable cause) {
        super(message, cause);
    }

}

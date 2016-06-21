/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jjlui
 */
public class Cuenta {
    
    
    double saldo=0.0;
    
    
    public double checkSaldo( ){
        return saldo;
    }
    
    public void deposito(double d)throws ExceptionCuenta{
        if(d <= 0.00){
            throw new ExceptionCuenta("WRONG AMOUNT EXCEPTION ");
            
        } 
        else {
            saldo = saldo + d;
            System.out.println(saldo);
            
        }
    }
    
    public void retiro(double s) throws SaldoInsuficienteException{
        if(saldo <= 0.0 ){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        if(saldo<= s){
            throw new SaldoInsuficienteException("Saldo insuficiente");
            
        }
        else {
           saldo = saldo - s;
            
        }
    }
    
    public static void main(String[] args) {
         Cuenta c = new Cuenta();
         try {
             
             c.deposito(800.0);
             
             
           
             
         }
         catch (ExceptionCuenta ex) {
             System.out.println("WRONG AMOUNT EXCEPTION");
             
         }
        try {
            c.deposito(200.0);
            c.retiro(900.0);
        } catch (ExceptionCuenta ex) {
            Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SaldoInsuficienteException ex) {
            Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
           c.checkSaldo();
    }
    
    
}

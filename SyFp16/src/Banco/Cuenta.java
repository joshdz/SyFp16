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
public class Cuenta {

    int numCliente;

    private Cuenta() {
       
    }

    public int getNumCliente() {
        return numCliente;
    }

    public int getNumCuenta() {
        return numCuenta;
    }
    int numCuenta;
    double saldo = 0.0;

    public double checkSaldo() {

        return saldo;

    }

    public void deposito(double d) throws ExceptionCuenta {
        if (d <= 0.00) {
            throw new ExceptionCuenta("WRONG AMOUNT EXCEPTION ");

        } else {
            saldo = saldo + d;
            System.out.println(saldo);

        }
    }

    public void retiro(double s) throws SaldoInsuficienteException {
        if (saldo <= 0.0) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        if (saldo < s) {
            throw new SaldoInsuficienteException("Saldo insuficiente");

        } else {
            saldo = saldo - s;
            System.out.println(saldo);

        }
    }

    public static void main(String[] args) {
        Cuenta c = new Cuenta();
        try {

            try {

                c.deposito(.0);

            } catch (ExceptionCuenta ex) {
                System.out.println("WRONG AMOUNT EXCEPTION");

            }

            c.retiro(9000);

        } catch (SaldoInsuficienteException ex) {
            System.out.println("SALDO INSUFICIENTE");

        }

        c.checkSaldo();
    }

    public Cuenta(int numCliente, int numCuenta) {
        this.numCliente = numCliente;
        this.numCuenta = numCuenta;
    }

}

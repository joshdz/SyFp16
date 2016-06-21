/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E9;

/**
 *
 * @author jjlui
 */
public class TestMyException {
    
    public void test(String s) throws MyException{
        if(s == null){
            throw new MyException("Mi excepcion lanzada");
        }
        else {
            System.out.println("Mi exepcion no es lanzada");
        }
    }
    
    public static void main(String[] args) {
        try {
            TestMyException t = new TestMyException();
            t.test(null);
        } 
        catch (MyException ex) {
            System.out.println(":(");
        }
    }
}

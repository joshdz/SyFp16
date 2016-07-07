/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E6;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jjlui
 */
public class Convertidor {

    Map<String, Double> mapa = new HashMap();

    public double convertir(String s, double d, String s1) {
        if (mapa.containsKey(s)) {
            double cm = mapa.get(s);
            cm = cm * d;
            double inch = mapa.get(s1);
            return cm / inch;
        }
        return 0.00;
    }

    public Convertidor() {
        mapa.put("centimetros", 0.01);
        mapa.put("metros", 1.00);
        mapa.put("kilometros", 1000.00);
        mapa.put("pulgadas", 0.0254);
        mapa.put("pies", 0.305);
        mapa.put("yardas", 0.919);
        mapa.put("millas", 1613.00);

    }

    public static void main(String[] args) {
        Convertidor c = new Convertidor();
        double d1 = c.convertir("centimetros", 30.00, "pulgadas");
        System.out.println(d1);
    }

}

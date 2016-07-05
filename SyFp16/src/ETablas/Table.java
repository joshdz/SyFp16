/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package ETablas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jjlui
 */
public class Table extends AbstractTableModel {

    String m[][]; //matriz row & column
    int i = 0;
    String nombreArchivo;
    String col[];

    Table() {
        //constructor vacio que pide GraphTable
    }

    public int numRenglones() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            i = 0;

            String linea;
            linea = br.readLine();
            while (linea != null) {
                i = i + 1;
                linea = br.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");

        } catch (IOException ex) {

        }
        return i;

    }

    public int numColumnas() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            linea = br.readLine();
            i = 0;

            col = linea.split(",");
            i = col.length;
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        } catch (IOException ex) {

        }
        return i;
    }

    @Override
    public int getRowCount() {// metodo abstracto de table model
        return numRenglones();
    }

    @Override
    public int getColumnCount() {// metodo abstracto de table model
        return numColumnas();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {// metodo abstracto de table model
        return m[rowIndex][columnIndex];
    }

    public Table(String s1) throws FileNotFoundException, IOException {
        nombreArchivo = s1;
        m = new String[numRenglones()][numColumnas()];
        String row[];
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        linea = br.readLine();
        i = 0;
        while (linea != null) {
            row = linea.split(",");

            m[i] = row;
            i = i + 1;
            linea = br.readLine();

        }
    }

}

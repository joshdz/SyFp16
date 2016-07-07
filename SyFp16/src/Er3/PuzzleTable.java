/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package Er3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jjlui
 */
public class PuzzleTable extends AbstractTableModel {

    String arrStr[];
    String m[][];
    String frame;
    String glue;
    String puzzle;
    String storage;
    String nombreArchivo;

    int i = 0;
    String row[];

    public PuzzleTable(String a) {

        int b = contarFrame();
        int c = contarGlue();
        int d = contarPuzzle();
        int e = contarStorage();

        nombreArchivo = a;
        m = new String[4][3];
        m[0][0] = "1";
        m[0][1] = "FRAME";
        m[0][2] = "" + b;

        m[1][0] = "2";
        m[1][1] = "GLUE";
        m[1][2] = "" + c;

        m[2][0] = "3";
        m[2][1] = "PUZZLE";
        m[2][2] = "" + d;

        m[3][0] = "4";
        m[3][1] = "STORAGE";
        m[3][2] = "" + e;

    }

    public int contarFrame() {
        try {

            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            i = 0;
            String linea;
            linea = br.readLine();
            while (linea != null) {
                row = linea.split(";");

                if (row[4].equals("FRAME")) {
                    i = i + 1;
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUNF");

        } catch (IOException ex) {
            System.out.println("IO EXCEPPTION");

        }
        return i;
    }

    public int contarGlue() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            i = 0;
            String linea;
            linea = br.readLine();
            while (linea != null) {
                row = linea.split(";");

                if (row[4].equals("GLUE")) {
                    i = i + 1;
                }
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
        return i;
    }

    public int contarPuzzle() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            i = 0;
            String linea;
            linea = br.readLine();
            while (linea != null) {
                row = linea.split(";");

                if (row[4].equals("PUZZLE")) {
                    i = i + 1;
                }
            }

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }

        return i;

    }

    public int contarStorage() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            i = 0;
            String linea;
            linea = br.readLine();
            while (linea != null) {
                row = linea.split(";");

                if (row[4].equals("Storage")) {
                    i = i + 1;
                }
            }

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }

        return i;

    }

    @Override
    public int getRowCount() {
        return 4;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return m[rowIndex][columnIndex];
    }

}

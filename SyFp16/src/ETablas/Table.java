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

    String m[][];
    int i = 0;

    Table() {
        
    }

    @Override
    public int getRowCount() {
        return 100;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return m[rowIndex][columnIndex];
    }

    public Table(String s1) throws FileNotFoundException, IOException {
        m = new String[101][7];
        String row[];
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("employees.csv"));
        String linea;
        linea = br.readLine();
        while (linea != null) {
            row = linea.split(",");
            m[i]=row;
            i=i+1;
            linea= br.readLine();

        }
    }

}

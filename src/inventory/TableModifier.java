/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author REFİK
 */
public class TableModifier {

    public static JTable setTable(ResultSet rs, JTable table) throws SQLException {

        int i = 0;
        while (rs.next() && i < table.getRowCount()) {
            String urunAdi = rs.getString("URUNADI");
            String modelNo = rs.getString("MODELNO");
            String durum = rs.getString("DURUM");
            String urunCesidi = rs.getString("URUNCESIDI");

            table.getModel().setValueAt(urunAdi, i, 0);
            table.getModel().setValueAt(urunCesidi, i, 1);
            table.getModel().setValueAt(modelNo, i, 2);
            table.getModel().setValueAt(durum, i, 3);

            i++;

        }

        return table;
    }

    public static JTable clearTable(JTable table) {
        int i = 0;
        while (i < table.getRowCount()) {
            table.getModel().setValueAt("", i, 0);
            table.getModel().setValueAt("", i, 1);
            table.getModel().setValueAt("", i, 2);
            table.getModel().setValueAt("", i, 3);
            i++;
        }

        return table;

    }

}

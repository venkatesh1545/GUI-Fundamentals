package GUI_JAVA;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Creation Example");
        frame.setSize(400, 400);

        Object[][] data = { { "Naruto", 19, "Tokyo" }, { "sasuke", 20, "Japan" },
                { "Itachi Uchiha", 26, "Tokyo" } };

        String[] columnNames = { "Name", "Age", "City" };
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

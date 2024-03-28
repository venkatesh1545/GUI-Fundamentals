package GUI_JAVA;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class TextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text area Example Frame");
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLayout(null);

        JScrollPane pane = new JScrollPane();
        pane.setBounds(50, 50, 400, 400);


        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.BOLD, 20));
        
        textArea.setText("Example of text area\n");
        pane.setViewportView(textArea);
        frame.add(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
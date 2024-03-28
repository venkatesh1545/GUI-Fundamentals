import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ComboBox {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Combo Box Example");
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setLayout(null);
        ImageIcon img = new ImageIcon("C:/Users/Venkatesh/OneDrive/Desktop/instagram.jpg");
        frame.setIconImage(img.getImage());

        //Combo Box -> create an object of class JCombo box
        String[] boxItems = {"Apple","Banana","Mosambi","Grapes"};
        String[] associations = {"Fruit Name: Apple\nColor: Red",
                                 "Fruit Name: Banana\nColor: Yellow",
                                 "Fruit Name: Mosambi\nColor: Green",
                                 "Fruit Name: Grapes\nColor: purple"};
        

        Color[] colors = {Color.red, Color.yellow, Color.green, Color.black};
        JComboBox box = new JComboBox(boxItems);
        box.setFont(new Font("calibri",Font.BOLD,15));
        box.setSelectedItem(null);
        box.setForeground(Color.black);
        box.setBackground(Color.WHITE);

        box.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int ind = box.getSelectedIndex();
                JOptionPane.showMessageDialog(null, associations[ind]);
                //JOptionPane.showMessageDialog(box, associations[ind]);   //window appear on top of the box component.
                //System.out.println(box.getSelectedItem());
                //System.out.println(box.getSelectedIndex());
            }
        });

        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBounds(100,160,150,150);
        label.setBackground(Color.white);
        /*box.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                if(box.getSelectedItem() == "Apple"){
                    label.setBackground(Color.red);
                }
                else if(box.getSelectedItem() == "Banana"){
                    label.setBackground(Color.yellow);
                }
                else if(box.getSelectedItem() == "Mosambi"){
                    label.setBackground(Color.GREEN);
                }
                else if(box.getSelectedItem() == "Grapes"){
                    label.setBackground(Color.blue);
                }
            }
        });
        */
        box.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                label.setBackground(colors[box.getSelectedIndex()]);
            }
        });
        box.setBounds(100,100,150,50);;
        box.setBounds(100,100,150,50);
        frame.add(box);
        frame.add(label);

        //To close the back end code for ever when i closed the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

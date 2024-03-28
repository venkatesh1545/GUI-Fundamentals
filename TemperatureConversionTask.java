package GUI_JAVA;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConversionTask{

    public static void main(String[] args) {
        createTemperatureConverter();
    }

    public static void createTemperatureConverter() {
        JFrame frame = new JFrame("Temperature Converter");
        frame.setLayout(null);
        frame.setSize(350, 300);

        Font font = new Font("calibri", Font.BOLD, 20);

        JLabel conversionDirectionLabel = new JLabel();
        conversionDirectionLabel.setText("Celsius To Fahrenheit");
        conversionDirectionLabel.setForeground(Color.BLACK);
        conversionDirectionLabel.setBounds(30, 0, 400, 60);
        conversionDirectionLabel.setFont(font);

        JLabel inputLabel = new JLabel();
        inputLabel.setText("Input : ");
        inputLabel.setBounds(30, 55, 150, 60);
        inputLabel.setFont(font);

        JLabel outputLabel = new JLabel();
        outputLabel.setText("Output : ");
        outputLabel.setBounds(30, 142, 150, 60);
        outputLabel.setFont(font);

        JTextField inputTextField = new JTextField();
        inputTextField.setFont(font);
        inputTextField.setBounds(30, 100, 100, 50);

        JTextField outputTextField = new JTextField();
        outputTextField.setFont(font);
        outputTextField.setBounds(30, 180, 100, 50);
        outputTextField.setEditable(false);

        JCheckBox switchCheckBox = new JCheckBox("Switch the Convertor", false);
        switchCheckBox.setBounds(30, 45, 300, 20);

        JButton convertButton = new JButton();
        convertButton.setText("Convert");
        convertButton.setBounds(200, 95, 102, 20);

        JButton clearButton = new JButton();
        clearButton.setText("Clear");
        clearButton.setBounds(200, 125, 102, 20);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                try {
                    double inputValue = Double.parseDouble(inputTextField.getText());
                    double outputValue;

                    if (switchCheckBox.isSelected()) {
                        outputValue = (inputValue - 32) * 5.0 / 9.0;
                    } else {
                        outputValue = (inputValue * 9.0 / 5.0) + 32;
                    }
                    outputTextField.setText(String.format("%.2f", outputValue));
                } catch (Exception e) {
                    String inputType = switchCheckBox.isSelected() ? "Fahrenheit" : "Celsius";
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number for " + inputType, "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                inputTextField.setText("");
                outputTextField.setText("");
            }
        });

        switchCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if (switchCheckBox.isSelected()) {
                    conversionDirectionLabel.setText("Fahrenheit to Celsius");
                } else {
                    conversionDirectionLabel.setText("Celsius to Fahrenheit");
                }
            }
        });

        frame.add(conversionDirectionLabel);
        frame.add(inputLabel);
        frame.add(outputLabel);
        frame.add(inputTextField);
        frame.add(outputTextField);
        frame.add(switchCheckBox);
        frame.add(convertButton);
        frame.add(clearButton);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


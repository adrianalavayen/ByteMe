import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VistaCalculadora {
    private JFrame frame;
    private JPanel panel;
    private JTextField inputField1;
    private JTextField inputField2;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JLabel resultLabel;

    public VistaCalculadora() {
        frame = new JFrame("Calculadora");
        panel = new JPanel();
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        resultLabel = new JLabel("Resultado: ");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("+");
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("-");
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("*");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("/");
            }
        });

        panel.add(inputField1);
        panel.add(inputField2);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void performOperation(String operation) {
        double num1 = Double.parseDouble(inputField1.getText());
        double num2 = Double.parseDouble(inputField2.getText());
        double result = 0;

        switch (operation) {
            case "+":
                result = new Calculadora().sumar(num1, num2);
                break;
            case "-":
                result = new Calculadora().restar(num1, num2);
                break;
            case "*":
                result = new Calculadora().multiplicar(num1, num2);
                break;
            case "/":
                try {
                    result = new Calculadora().dividir(num1, num2);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
        }

        resultLabel.setText("Resultado: " + result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculadoraUI::new);
    }
}

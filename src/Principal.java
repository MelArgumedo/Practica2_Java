import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {
    private JTextField textField1;
    private JTextField textField2;
    private JButton btnSuma;
    private JButton btnRestar;
    private JButton btnMultiplicacion;
    private JButton btnDivision;

    public Principal() {
        int num1 = Integer.parseInt(textField1.getText());
        int num2= Integer.parseInt(textField2.getText());

//sumar
        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resultado = num1+num2;
JOptionPane.showMessageDialog(null, "El resultado de la suma es es: " + resultado);
            }
        });

        //restar
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resultado = num1-num2;
JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
            }
        });
        //multiplicacion
        btnMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
int resultado = num1*num2;
JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
            }
        });


        //division
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
int resultado = num1/num2;
JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
            }
        });
    }
}

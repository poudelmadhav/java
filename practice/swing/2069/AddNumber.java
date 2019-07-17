import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AddNumber {
  AddNumber() {
    JFrame f = new JFrame("Add Numbers");
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    JLabel lblnum1 = new JLabel("Enter Number 1");
    JLabel lblnum2 = new JLabel("Enter Number 2");
    JLabel lblResult = new JLabel("Result");

    JTextField num1 = new JTextField();
    JTextField num2 = new JTextField();
    JTextField result = new JTextField();
    result.setEditable(false);

    JButton btnAdd = new JButton("Add");

    lblnum1.setBounds(10, 10, 150, 30);
    lblnum2.setBounds(10, 50, 150, 30);
    lblResult.setBounds(10, 100, 150, 30);
    num1.setBounds(160, 10, 150, 30);
    num2.setBounds(160, 50, 150, 30);
    result.setBounds(160, 100, 150, 30);
    btnAdd.setBounds(160, 150, 80, 30);

    f.add(lblnum1);
    f.add(lblnum2);
    f.add(lblResult);
    f.add(num1);
    f.add(num2);
    f.add(result);
    f.add(btnAdd);

    btnAdd.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        int number1 = Integer.parseInt(num1.getText());
        int number2 = Integer.parseInt(num2.getText());

        result.setText(String.valueOf(number1 + number2));
      }
    });

    f.setLayout(null);
    f.setSize(380, 250);
    f.setVisible(true);
  }

  public static void main(String[] args) {
    new AddNumber();
  }
}
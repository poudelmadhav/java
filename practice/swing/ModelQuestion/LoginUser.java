import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class LoginUser {
  LoginUser() {
    JFrame f = new JFrame("Login Form");
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    JLabel lblUsername = new JLabel("Enter Username: ");
    lblUsername.setBounds(10, 10, 200, 30);

    JTextField txtUsername = new JTextField();
    txtUsername.setBounds(210, 10, 200, 30);

    JLabel lblPassword = new JLabel("Enter Password: ");
    lblPassword.setBounds(10, 50, 200, 30);

    JPasswordField txtPassword = new JPasswordField();
    txtPassword.setBounds(210, 50, 200, 30);

    JButton btnLogin = new JButton("Login");
    btnLogin.setBounds(10, 400, 80, 30);

    JButton btnCancel = new JButton("Cancel");
    btnCancel.setBounds(90, 400, 80, 30);

    JLabel result = new JLabel("Cool");
    result.setBounds(10, 200, 300, 30);

    JComboBox userType = new JComboBox<>();
    userType.setModel(new DefaultComboBoxModel<>(new String[] {"admin", "normal"}));
    userType.setBounds(10, 100, 200, 30);

    f.add(lblUsername);
    f.add(txtUsername);
    f.add(lblPassword);
    f.add(txtPassword);
    f.add(btnLogin);
    f.add(result);
    f.add(btnCancel);
    f.add(userType);

    btnLogin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          String url = "jdbc:mysql://localhost:3306/students?useSSL=false";
          String user = "madhav";
          String password = "password";
          String query = "SELECT * from students;";
          
          Connection con = DriverManager.getConnection(url, user, password);
          // Class.forName("mysql.jdbc.driver.Class");
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(query);
          int flag = 0;

          while(rs.next()) {
            if((rs.getString("name").equals(txtUsername.getText())) && txtPassword.getText().equals("madhav")) {
              flag = 1;
              break;
            }         
          }

          if(flag == 1) {
            JOptionPane.showMessageDialog(f, "You are successfully logged in.");
          } else {
            JOptionPane.showMessageDialog(f, "Incorrect Username or password.");
          }
        } catch (SQLException ev) {
          System.out.println("Error Connecting Database.");
        }
      }
    });

    btnCancel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent et) {
        System.exit(1);
      }
    });

    f.setLayout(null);
    f.setSize(420, 500);
    f.setVisible(true);
  }

  public static void main(String[] args) {
    new LoginUser();
  }
}
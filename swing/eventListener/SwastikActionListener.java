import javax.swing.*;
import java.awt.*;  
import java.awt.event.*; 

class SwastikActionListener {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame("Hello Swastik");
        JButton btn = new JButton("Help");

        btn.setBounds(260,180,80,40);

        myWindow.add(btn);
        myWindow.setSize(600,500);
        myWindow.setLayout(null);
        myWindow.setVisible(true);

        myWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btn.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent event) {  
                JFrame helpWindow = new JFrame("Swastik Help");
                JLabel btn = new JLabel();
                btn.setText("You are here at Swastik Help.");

                btn.setBounds(150,150,300,40);

                helpWindow.add(btn);
                helpWindow.setSize(500,400);
                helpWindow.setLayout(null);
                helpWindow.setVisible(true);

                JButton backBtn = new JButton("Back");
                backBtn.setBounds(10,10, 100, 40);
                helpWindow.add(backBtn);

                backBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        helpWindow.dispose();
                    }
                });
            }
        });
    }
}
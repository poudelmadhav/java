import javax.swing.*;
import java.awt.*;  
import java.awt.event.*; 

class SwastikBorderLayout extends JFrame {
    SwastikBorderLayout() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton btn1 = new JButton("NORTH");
        JButton btn2 = new JButton("SOUTH");
        JButton btn3 = new JButton("EAST");
        JButton btn4 = new JButton("WEST");
        JButton btnClose = new JButton("CENTER CLOSE");

        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);
        add(btn3, BorderLayout.EAST);
        add(btn4, BorderLayout.WEST);
        add(btnClose, BorderLayout.CENTER);

        setSize(300, 300);
        setVisible(true);
    }
}

class BorderLayoutDemo1 {
    public static void main(String[] args) {
        new SwastikBorderLayout();
    }
}
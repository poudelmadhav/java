import javax.swing.*;
import java.awt.*;  
import java.awt.event.*; 

class SwastikBorderLayout {
    JFrame frame;
    JButton btnClose;

    SwastikBorderLayout() {
        frame = new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton btn1 = new JButton("NORTH");
        JButton btn2 = new JButton("SOUTH");
        JButton btn3 = new JButton("EAST");
        JButton btn4 = new JButton("WEST");
        JButton btnClose = new JButton("CENTER CLOSE");

        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.SOUTH);
        frame.add(btn3, BorderLayout.EAST);
        frame.add(btn4, BorderLayout.WEST);
        frame.add(btnClose, BorderLayout.CENTER);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

class BorderLayoutDemo {
    public static void main(String[] args) {
        new SwastikBorderLayout();
    }
}
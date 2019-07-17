import javax.swing.*;
import java.awt.*;

class SwastikFrame {
  SwastikFrame() {
    JFrame frame = new JFrame("Swastik College");
    JButton btn = new JButton("Click Me");
    // btn.setBounds(50, 200, 200, 30);
    frame.add(btn, BorderLayout.SOUTH);
    // frame.setLayout(null);
    frame.setSize(400, 400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new SwastikFrame();
  }
}
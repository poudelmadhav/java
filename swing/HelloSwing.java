import javax.swing.*;

class HelloSwing {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame("HelloSwing");
        JButton btn = new JButton("Click Me");
        btn.setBounds(20,20,200,50);

        myWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myWindow.add(btn);
        myWindow.setSize(400,400);
        myWindow.setLayout(null);
        myWindow.setVisible(true);
    }
}
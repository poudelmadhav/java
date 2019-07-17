import java.awt.*;
import javax.swing.*;

class MyJavaMenuBar {
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;

    MyJavaMenuBar() {
        JFrame f = new JFrame("Menu Bar Test");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar mb = new JMenuBar();

        menu = new JMenu("File");
        // menu.setMnemonic(KeyEvent.VK_F);
        // menu.setMnemonic(KeyEvent.VK_F);
        // menu.setMnemonic('F')
        submenu = new JMenu("Recent Files");

        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Save");
        i3 = new JMenuItem("Close");

        i4 = new JMenuItem("File 1");
        i5 = new JMenuItem("File 2");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        submenu.add(i4);
        submenu.addSeparator();
        submenu.add(i5);

        menu.addSeparator();
        menu.add(submenu);

        mb.add(menu);

        f.setJMenuBar(mb);

        f.setSize(400, 400);

        f.setLayout(null);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MyJavaMenuBar();
    }
}
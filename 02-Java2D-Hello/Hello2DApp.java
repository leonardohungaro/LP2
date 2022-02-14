import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
   }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(350, 350);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.blue);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.black);
		g2d.drawRect(150,150, 50,50);
        g2d.drawRect(125,125, 100,100);
        g2d.drawRect(100,100, 150,150);
		g2d.drawOval(100, 100, 150, 150);
		g2d.drawOval(150,150, 50,50);
        g2d.drawOval(125,125, 100,100);
    }
}

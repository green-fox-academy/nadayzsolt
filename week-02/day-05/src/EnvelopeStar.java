import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {
    // Create a function that draws a single line and takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a 50 long horizontal line from that point.
    // Draw at least 3 lines with that function using a loop.

//Canvas divided by 4 after LinePlay tast & changed positioning.
    int divisor = 2;
    int lineAmount = 16;
    int x1 = 0;
    int y1 = 0;
    int x2 = WIDTH / divisor;
    int y2 = 0;
    for (int j = 0; j < divisor; j++) {

    }
    for (int i = 0; i < lineAmount-1; i++) {
      x1 = x1 + WIDTH / divisor / lineAmount;
      y2 = y2 + HEIGHT / divisor / lineAmount;
      linePlayForm(graphics, x1, x2, y1, y2, divisor);
    }
  }

  public static void linePlayForm(Graphics graphics, int x1, int x2, int y1, int y2, int divisor) {

//    Upper-right quarter
    graphics.setColor(Color.GREEN);
    graphics.drawLine(x1, y1 + HEIGHT/divisor, x2, y2+ HEIGHT/divisor);
//    Lower-left quarter
//    graphics.setColor(Color.BLACK);
    graphics.drawLine(y1 + WIDTH/divisor, x1, y2 + WIDTH/divisor, x2);




    //    Upper-left quarter * innen folyt köv...
//    graphics.setColor(Color.GREEN);
    graphics.drawLine(x1, HEIGHT/divisor, HEIGHT / divisor , HEIGHT / divisor - y2);
// right bottom
//    graphics.setColor(Color.RED);
    graphics.drawLine(y1+ WIDTH / divisor, y2 + HEIGHT/divisor, 2* WIDTH / divisor - x1 , HEIGHT/divisor);

  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}

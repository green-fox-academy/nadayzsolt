import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {
    // Create a function that draws a single line and takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a 50 long horizontal line from that point.
    // Draw at least 3 lines with that function using a loop.

    int lineAmount = 15;
    int x1 = (WIDTH / lineAmount) / 5; // kb. 5
    int y1 = (HEIGHT / lineAmount) / 5; //5
    int x2 = WIDTH - ((WIDTH / lineAmount) / 5); // 315
    int y2 = (HEIGHT / lineAmount) / 5; // 5

    for (int i = 0; i < lineAmount - 1; i++) {
      x1 = x1 + WIDTH / lineAmount;
      y2 = y2 + HEIGHT / lineAmount;
      linePlayForm(graphics, x1, x2, y1, y2);
    }
  }

  public static void linePlayForm(Graphics graphics, int x1, int x2, int y1, int y2) {

    graphics.setColor(Color.MAGENTA);
    graphics.drawLine(x1, y1, x2, y2);
//    and the green is just the mirror of it:
//    only have to move the coordinates to each other's places:
    graphics.setColor(Color.GREEN);
    graphics.drawLine(y1, x1, y2, x2);
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

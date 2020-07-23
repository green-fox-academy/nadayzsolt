import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineInTheMiddle {
  public static void mainDraw(Graphics graphics) {
    // draw a red horizontal line to the canvas' middle.
    // draw a green vertical line to the canvas' middle.
// 1. solution, but that doesn't really the dynamic one
//    graphics.setColor(Color.RED);
//    graphics.drawLine(0,160,320,160);
//
//    graphics.setColor(Color.GREEN);
//    graphics.drawLine(160,0,160,320);

// 2. solution, more like durring the lecture:
    int halfWidth = WIDTH / 2;
    int halfHeight = HEIGHT / 2;
    graphics.setColor(Color.RED);
    graphics.drawLine((WIDTH - WIDTH), halfHeight, WIDTH, halfHeight);

    graphics.setColor(Color.GREEN);
    graphics.drawLine(halfWidth, (HEIGHT - HEIGHT), halfWidth, (HEIGHT));

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
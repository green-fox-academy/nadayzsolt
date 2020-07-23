import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.
        int x = 10;
        int y = 10;
        int rectAmount = 4;
        for (int i = 1; i < rectAmount+1; i++) {
            x = i*20 + x;
            y = i*20 + y;
            WIDTH = WIDTH - 10 * i;
            HEIGHT = HEIGHT - 10 * i;
            drawRectangles(graphics, x, y);
        }


    }

    public static void drawRectangles(Graphics graphics, int x, int y) {
        graphics.setColor(getRandomColor());
        graphics.drawRect(x, y, WIDTH, HEIGHT);
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static Color getRandomColor() {
        Random random = new Random();
        int limit = 256;
        return new Color(random.nextInt(limit), random.nextInt(limit), random.nextInt(limit));
    }

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

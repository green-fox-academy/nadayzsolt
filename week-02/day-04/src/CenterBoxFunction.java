import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics) {
        // create a function that draws one square and takes 2 parameters:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.
        int squareSize = 100;
        int triangles = 4;
        for (int i = 1; i < triangles; i++) {
            squareSize = squareSize / i + 1;
            drawSquare(graphics, squareSize);
        }
    }

    public static void drawSquare(Graphics graphics, int squareSize) {

        graphics.setColor(getRandomColor());
        graphics.fillRect(WIDTH / 2 - (squareSize / 2), HEIGHT / 2 - (squareSize / 2), squareSize, squareSize);
    }

    public static Color getRandomColor() {
        Random random = new Random();
        int limit = 256;
        return new Color(random.nextInt(limit), random.nextInt(limit), random.nextInt(limit));
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

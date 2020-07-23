import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.

        int[] xCoordinates = {100, 143, 300};
        int[] yCoordinates = {300, 280, 100};
        graphics.setColor(Color.BLACK);
        graphics.drawPolygon(xCoordinates, yCoordinates, 3);

        int[] xCoordinates2 = {100, 280, 145};
        int[] yCoordinates2 = {100, 143, 300};
        graphics.setColor(Color.BLUE);
        graphics.drawPolygon(xCoordinates2, yCoordinates2, 3);


        int[] xCoordinates3 = {12, 28, 145};
        int[] yCoordinates3 = {210, 13, 167};
        graphics.setColor(Color.GREEN);
        graphics.drawPolygon(xCoordinates3, yCoordinates3, 3);

        int[] xCoordinates4 = {123, 128, 15};
        int[] yCoordinates4 = {10, 213, 310};
        graphics.setColor(Color.MAGENTA);
        graphics.drawPolygon(xCoordinates3, yCoordinates3, 3);
//        graphics.setColor(Color.GREEN);
//        graphics.setColor(Color.MAGENTA);

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

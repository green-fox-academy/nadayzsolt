import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.awt.Color.RED;
import static java.awt.Color.orange;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        ArrayList <Color> rainbowColors = new ArrayList<Color>();
        rainbowColors.add(RED);
//        innen tovább...
        "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "INDIGO", "VIOLET"};
        int squareSize = 10;
        for (int i = 0; i < rainbowColors.length; i++) {
            squareSize = squareSize + i*10;

//            rainbowColors[i] = rainbowColors[i].toUpperCase();
         theVeryFunction(graphics, rainbowColors[i], squareSize);
        }

    }

    public static void theVeryFunction(Graphics graphics, String rainbowColor, int squareSize){
        graphics.setColor(Color.rainbowColor);
        graphics.fillRect(WIDTH/2-(squareSize/2), HEIGHT/2-(squareSize/2), squareSize, squareSize)
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

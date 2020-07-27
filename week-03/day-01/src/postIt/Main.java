package postIt;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        PostIt postIt1 = new PostIt(Color.GREEN, "Idea1", Color.BLACK);
        System.out.println(postIt1.getText());
    }
}


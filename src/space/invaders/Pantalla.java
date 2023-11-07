package space.invaders;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @version 2.0
 * @author Andre & Ary
 */
public final class Pantalla extends JFrame {
    JPanel panel;

    // Set the height and width of the screen
    public static final int width = 1000;
    public static final int height = 730;

    // Create a public matrix of booleans initialized in false
    // named "alienPositions" with 10 rows and 10 columns
    public static boolean[][] alienPositions = new boolean[10][10];

    // Create a function that receives a matrix of 10x10 booleans
    // and changes the value of the first five rows to true except by the first
    // and the last column
    public static void setAlienPositions(boolean[][] alienPositions) {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 9; j++) {
                alienPositions[i][j] = true;
            }
        }
    }

    // Create a function that receives a row, a column, a height and a width
    // and returns the position of the alien in the screen
    public static int[] getAlienPosition(int row, int column, int height, int width) {
        int[] position = new int[2];
        position[0] = (width / 10) * column;
        position[1] = (height / 10) * row;
        return position;
    }
    // Create a function named chargeImage that receives a path to an image
    // and returns a BufferedImage
    public static BufferedImage chargeImage(String path) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

    // Create a void named drawAliens
    // that receives a Graphics named g
    public static void drawAliens(Graphics g) {
        // Buffered all the images
        BufferedImage[] alienImages = new BufferedImage[10];
        alienImages[0] = chargeImage("src/space/invaders/images/rojo.png");
        alienImages[1] = chargeImage("src/space/invaders/images/azul.png");
        alienImages[2] = chargeImage("src/space/invaders/images/amarillo.png");
        alienImages[3] = chargeImage("src/space/invaders/images/naranja.png");
        alienImages[4] = chargeImage("src/space/invaders/images/rosado.png");
        alienImages[5] = chargeImage("src/space/invaders/images/verde.png");
        alienImages[6] = chargeImage("src/space/invaders/images/morado.png");
        alienImages[7] = chargeImage("src/space/invaders/images/rojo.png");
        alienImages[8] = chargeImage("src/space/invaders/images/azul.png");
        alienImages[9] = chargeImage("src/space/invaders/images/amarillo.png");
    
        // Create a for that iterates through the rows
        for (int i = 0; i < 10; i++) {
            // Create a for that iterates through the columns
            for (int j = 0; j < 10; j++) {
                // Create a if that checks if the position is true
                if (alienPositions[i][j]) {
                    // Create a int array named position
                    int[] position = getAlienPosition(i, j, height, width);
                    // Draw the alien in the position
                    g.drawImage(alienImages[i], position[0], position[1], null);
                }
            }
        }
    }

    // When press the run show the window
    public Pantalla() {
        initUI();
    }

    // initUI method
    public void initUI() {
        // Create a new instance of Board
        panel = new JPanel();
        // Add the panel to the window
        add(panel);
        // Set the title of the window
        setTitle("Space Invaders");
        // Set the size of the window
        setSize(width, height);
        // Set the window to be visible
        setVisible(true);
        // Set the window to be resizable
        setResizable(false);
        // Set alienPositions to true
        setAlienPositions(alienPositions);
        // Draw the aliens
                // Set the window to close when the user clicks the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Draw the aliens
        drawAliens(panel.getGraphics());

    }

    // New board
    public static void main(String[] args) {
        new Pantalla();
    }
}
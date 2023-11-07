package space.invaders;


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
        for (int i = 0; i < 5; i++) {
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

    // Create a function named colorAlien that receives a row, a column
    // and returns a path to the image of the alien
    public static String colorAlien(int row, int column) {
        if (row == 0 || row == 1) {
            return "src/space/invaders/images/alien1.png";
        } else if (row == 2 || row == 3) {
            return "src/space/invaders/images/alien2.png";
        } else {
            return "src/space/invaders/images/alien3.png";
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
        // Set the window to close when the user clicks the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // New board
    public static void main(String[] args) {
        new Pantalla();
    }
}
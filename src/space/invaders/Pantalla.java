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
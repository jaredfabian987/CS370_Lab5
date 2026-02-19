import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Random;

public class Main extends JFrame {

    public Main () {

        // set the title of the window
        setTitle ("Lab 5: Card Shuffler");

        // set the close behavior
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // user border layout so that we can our object in the middle
        setLayout(new BorderLayout());

        // create a shuffle button

        JButton shuffleButton = new JButton ("Shuffle");

        // When the user clicks the button, call redraw() on our drawing panel
        shuffleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // where we will call the shuffle function
            }
        });
        add(shuffleButton, BorderLayout.SOUTH);

        setSize (1400, 700);

        setLocationRelativeTo(null);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
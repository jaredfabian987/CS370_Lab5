
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// references:
// https://zetcode.com/java/displayimage/
// https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html
// https://stackoverflow.com/questions/15182329/how-to-set-icon-to-a-jlabel-from-an-image-from-a-folder
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

        CardPanel cp = new CardPanel();
        add (cp, BorderLayout.CENTER);

        // When the user clicks the button, call redraw() on our drawing panel
        shuffleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // where we will call the shuffle function
                cp.shuffle();
            }
        });
        // place the shuffle button at the bottom of the screen
        add(shuffleButton, BorderLayout.SOUTH);

        // set the size of the window
        setSize (1300, 700);

        // location and visibility
        setLocationRelativeTo(null);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

// references : https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html
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

        // When the user clicks the button, call redraw() on our drawing panel
        shuffleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // where we will call the shuffle function
            }
        });
        // place the shuffle button at the bottom of the screen
        add(shuffleButton, BorderLayout.SOUTH);

        // set the size of the window
        setSize (1400, 700);

        // location and visibility
        setLocationRelativeTo(null);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

// this is our card panel class and will be in charge of
// displaying the cards and also shuffling them
class CardPanel extends JPanel {

    // this array of type string will store the names of all of the cards
    private ArrayList<String> deck = new ArrayList<>();
    // we will use a hashMap/lookup table to easier find the cards by name\
    // it will store the name of the card as well as it's corresponding image
    private java.util.HashMap<String, ImageIcon> icons = new java.util.HashMap<>();

    public CardPanel () {
        // may need to change if this green is too bright
        setBackground(Color.GREEN);

        // create a string array for the different ranks
        String[] ranks = {"ace","2", "3","4","5","6","7","8", "9", "10", "jack", "queen", "king"};

        // create a string array for the different suits
        String[] suits = {"clubs","diamonds", "hearts", "spades"};

        // we will use this double for look to make sure that we add every combination of suits
        for (String rank : ranks){
            for (String suit: suits){
                deck.add(rank + "_of_" + suit);
            } // end of string loop
        } // end of rank loop

        // next step is to extract the images form the folder
        // i put up some references near the top that help me do this
        for (String card : deck) {
        }

    }
}
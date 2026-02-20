import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CardPanel extends JPanel{


    // this array of type string will store the names of all of the cards
    private ArrayList<String> deck = new ArrayList<>();
    // we will use a hashMap/lookup table to easier find the cards by name\
    // it will store the name of the card as well as it's corresponding image
    private HashMap<String, ImageIcon> images = new java.util.HashMap<>();

    private static final int cardWidth = 70;

    private static final int cardHeight = 110;

    // create a string array for the different ranks
    private static final String[] ranks = {"ace","2", "3","4","5","6","7","8", "9", "10", "jack", "queen", "king"};

    // create a string array for the different suits
    private static final String[] suits = {"clubs","diamonds", "hearts", "spades"};


    public CardPanel () {
        // may need to change if this green is too bright
        // og was Color.GREEN
        setBackground(new Color(0,100,0));

        // we will use this double for look to make sure that we add every combination of cards
        // into the deck list
        // change 1/19 11:44pm change the order of these loops, was adding to the deck in by ranks first
        // when in reality we wanted by suits first
        for (String s: suits){
            for (String r : ranks){
                deck.add(r + "_of_" + s);
            } // end of string loop
        } // end of rank loop

        for (String card : deck) {
            String path = "PNG-cards-1/" + card + ".png";
            ImageIcon icon = new ImageIcon(path);
            Image fixedImage = icon.getImage().getScaledInstance(80, 120, Image.SCALE_SMOOTH);
            ImageIcon fixedIcon = new ImageIcon(fixedImage);
            images.put(card, fixedIcon);
        } // end of loop

    } // end of cardPanel constructor

    public void shuffle () {
        // use the java collections shuffle function
        Collections.shuffle(deck);
        // use the java JPanel repaint method which redraws the board for us
        repaint();
    } // end of shuffle function

    // need to implement the override the paint component function
    @Override
    public void paintComponent (Graphics gfx){
        // always clear the screen before redrawing
        super.paintComponent(gfx);

        int cols = 13, gapX = 27, gapY = 40;

        // this will be the starting position for our first card
        int startX = 20, startY = 35;

        for (int i = 0; i < deck.size(); i++){
            // find out which col and row the card is going to be going to

            // figure out which column and row we are on
            int col = i % cols;
            int row = i / cols;

            // we need to find where we are going to place the cards on the panel
            int x = startX + col * (cardWidth + gapX);
            int y = startY + row * (cardHeight + gapY);

            // loop up the card in the hashmap and place it
            ImageIcon icon = images.get(deck.get(i));
            icon.paintIcon(this,gfx, x, y);

        } // end of deck loop


    } // end of paintComponent
} // end of CardPanel class

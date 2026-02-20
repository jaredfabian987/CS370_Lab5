package cardShuffle;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.*;

public class Deck {
    List<Card> deckArr;
    int size;

    //Card hi = new Card(Suit.CLUBS,Rank.ACE);
    public Deck() {
        deckArr = new ArrayList<>();
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) deckArr.add(new Card(s, r));
        }
    }
    public void shuffle(){
        Collections.shuffle(deckArr);
    }

    public void displayDeck(){
        for (int i = 0; i < deckArr.size(); i++) {
            //String message = deckArr.get(i).getRank() + " " + deckArr.get(i).getSuit();

            String message = deckArr.get(i).getRankStr() + " " + deckArr.get(i).getSuitStr();
            System.out.println(message);
        }
    }

}

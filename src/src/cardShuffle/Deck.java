package cardShuffle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.function.BiConsumer;

import javax.swing.*;

public class Deck {
    JList<String> deckArr;
    int size;

    public Deck() {
        deckArr = new JList<String>();
        File file;
        //file = new File("src/cardShuffle/PNG-cards-1.3");
        //File[] files = file.listFiles();
        size = 52;
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src/cardShuffle/PNG-cards-1.3"));
        br.close();
        } catch (Exception ex) {
            return;
        }


        if (files != null){
            for (int i = 0; i < size; i++){
                files[i].getName();
                String hi = files[i].getPath();
                deckArr.add(hi,i);
            }
        }


    }

    public shuffle



}

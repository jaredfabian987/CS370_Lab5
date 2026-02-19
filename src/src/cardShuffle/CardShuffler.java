package cardShuffle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CardShuffler extends JFrame{
    private JButton shuffle;
    private JPanel table;
    private JTable grid;

    public CardShuffler(){
        table = new JPanel();

        shuffle = new JButton();
        shuffle.setText("Shuffle");


        setTitle("CardShuffler");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(16*50,9*50);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4,13));

        add(table);
        shuffle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(shuffle);



        add(grid);
        setVisible(true);
    }
}

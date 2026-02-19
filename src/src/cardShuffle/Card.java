package cardShuffle;

public class Card {
    Suit type;
    Rank num;

    public Card(Suit a, Rank b ){
        type = a;
        num = b;
    }

    public String getSuit(){
        return type.getSuitType();
    }

    public String getRank(){
        return num.getRankNum();
    }
}

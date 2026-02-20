package cardShuffle;

public class Card {
    private final Suit type;
    private final Rank num;

    public Card(Suit type, Rank num ){
        this.type = type;
        this.num = num;
    };

    public Suit getSuit(){
        return type;
    }

    public String getSuitStr(){
        return type.getSuitTypeStr();
    }

    public Rank getRank(){
        return num;
    }

    public String getRankStr(){
        return num.getRankNumStr();
    }
}

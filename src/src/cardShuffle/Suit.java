package cardShuffle;

public enum Suit {
    SPADES("spades"),
    HEARTS("hearts"),
    CLUBS("clubs"),
    DIAMONDS("diamonds");

    private String type;

    private Suit(String type){
        this.type = type;
    }

    public Suit getSuitType(){
        return this;
    }

    public String getSuitTypeStr(){
        return this.type;
    }
}

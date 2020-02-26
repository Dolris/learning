package com.codespace.task2;

public class Card {
    private Suit suit;
    private Rank rank;
    public Card (Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
    @Override
    public String toString() {
        return this.rank.name().toLowerCase() + " of " + this.suit.name().toLowerCase() + "s";
    }
}

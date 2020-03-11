package com.codespace.task2;

public class Runner {
    public void run() {
        Card[] cards = new Card[52];
        int i = 0;
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                cards[i] = new Card(s, r);
                i++;
            }
        }
        for (i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }
}

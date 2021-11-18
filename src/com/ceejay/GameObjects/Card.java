package com.ceejay.GameObjects;

public class Card {

    private Suit suit;

    private CardValue cardType;

    private int cardValue;

    public Card(Suit suit, CardValue cardType) {
        this.suit = suit;
        this.cardType = cardType;
        this.cardValue = cardType.value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", cardType=" + cardType +
                ", cardValue=" + cardValue +
                '}';
    }
}

package com.ceejay.GameObjects;

import java.util.*;

public class Deck {

    public static void createCards(){
        List<Card> mixedCards = new ArrayList<>();

        Map<Suit, List<Card>> clubsMap = new HashMap<>();
        Map<Suit, List<Card>> heartsMap = new HashMap<>();
        Map<Suit, List<Card>> diamondsMap = new HashMap<>();
        Map<Suit, List<Card>> spadesMap = new HashMap<>();

        List<Card> clubs = new ArrayList<>();
        List<Card> diamonds = new ArrayList<>();
        List<Card> spades = new ArrayList<>();
        List<Card> hearts = new ArrayList<>();

        List<Map<Suit, List<Card>>> listOf52DeckOfCards = List.of(clubsMap, diamondsMap, heartsMap, spadesMap);

        CardValue[] cardvalues = CardValue.values();

        Suit[] suits = Suit.values();

        for (Suit suit: suits) {
            for (CardValue cv: cardvalues) {
                mixedCards.add(new Card(suit, cv));
            }
        }

        mixedCards.stream().forEach(card -> {
            if (card.getSuit() == Suit.CLUBS){
                clubs.add(card);
                clubsMap.put(card.getSuit(), clubs);
            //    listOf52DeckOfCards.add(clubsMap);
            } else if(card.getSuit() == Suit.HEARTS) {
                hearts.add(card);
                heartsMap.put(card.getSuit(), hearts);
            //    listOf52DeckOfCards.add(heartsMap);
            }else if(card.getSuit() == Suit.DIAMONDS) {
                diamonds.add(card);
                diamondsMap.put(card.getSuit(), diamonds);
            //   listOf52DeckOfCards.add(diamondsMap);
            } else {
                spades.add(card);
                spadesMap.put(card.getSuit(), spades);
            //    listOf52DeckOfCards.add(clubsMap);
            }
        });

        System.out.println(listOf52DeckOfCards);

    }

    public static void getADeck52PlayingCards(){

    }
}

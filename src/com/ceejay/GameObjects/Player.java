package com.ceejay.GameObjects;

import com.ceejay.Exceptions.MaxPlayersReached;

import java.util.HashSet;
import java.util.Set;

public class Player {

    private Stage stage = Stage.HIT;

    private Set<Card> selectedCards = new HashSet<>();

    public static int TOTAL_PLAYERS = 0;

    public Player(){
        TOTAL_PLAYERS += 1;
    }

    public static void checkTotalNumberOfPlayers() throws MaxPlayersReached {
        if (TOTAL_PLAYERS > 6)
            throw new MaxPlayersReached("Players cannot exceed 6");
    }

    public void addSelectedCard(Card card){
        if(!this.hasPlayerExceedMaxValueOf21()) {

        }
    }

    public boolean hasPlayerExceedMaxValueOf21(){
         if (this.selectedCards.stream()
                 .map(card -> card.getCardValue())
                 .reduce(0,(subtotal, element) -> subtotal + element) > 21){
             this.stage = Stage.GOT_BUST;
             return true;
         }

        return false;

    }
}

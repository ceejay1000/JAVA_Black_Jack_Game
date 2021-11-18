package com.ceejay;

import com.ceejay.GameObjects.Card;
import com.ceejay.GameObjects.CardValue;
import com.ceejay.GameObjects.Suit;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(new Card(Suit.HEARTS, CardValue.KING));
    }
}

package com.example.marc.cardstackapp;

/**
 * Created by Marc on 10/2/2017.
 */

public class Card
{
    private int cardNum;
    private CardSuit cardSuit;

    public Card(int cardNum, CardSuit cardSuit)
    {
        this.cardNum = cardNum;
        this.cardSuit = cardSuit;
    }

    public int getCardNum()
    {
        return cardNum;
    }

    public CardSuit getCardSuit()
    {
        return cardSuit;
    }
}

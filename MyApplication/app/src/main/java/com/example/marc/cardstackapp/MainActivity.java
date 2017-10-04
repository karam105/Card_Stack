package com.example.marc.cardstackapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.*;

public class MainActivity extends AppCompatActivity
{

    private TextView upperNumTV;
    private TextView lowerNumTV;
    private ImageView upperSuitIV;
    private ImageView centerSuitIV;
    private ImageView lowerSuitIV;
    private Stack<Card> cardStack;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative);

        this.upperNumTV = (TextView) findViewById(R.id.TopNum);
        this.lowerNumTV = (TextView) findViewById(R.id.bottomNum);
        this.upperSuitIV = (ImageView) findViewById(R.id.TopSuit);
        this.centerSuitIV = (ImageView) findViewById(R.id.middleSuit);
        this.lowerSuitIV = (ImageView) findViewById(R.id.bottomSuit);


        this.cardStack = new Stack<>();

        for (int i = 1; i < 14; ++i)
        {
            for (int j = 1; j < 5; ++j)
            {
                this.cardStack.push(new Card(i,toCardSuit(j)));
            }
        }

        Collections.shuffle(this.cardStack);
        showCard(cardStack.pop());
    }

    public void showCard(Card card)
    {
        displayCardNumber(card.getCardNum());
        displayCardSuit(card.getCardSuit());
    }

    public void displayCardNumber(int num)
    {
        if ((num > 1)&&(num < 11))
        {
            upperNumTV.setText(String.valueOf(num));
            lowerNumTV.setText(String.valueOf(num));
        }
        else if (num == 1)
        {
            upperNumTV.setText(R.string.A);
            lowerNumTV.setText(R.string.A);
        }

        else if (num == 11)
        {
            upperNumTV.setText(R.string.J);
            lowerNumTV.setText(R.string.J);
        }
        else if (num == 12)
        {
            upperNumTV.setText(R.string.Q);
            lowerNumTV.setText(R.string.Q);

        }
        else
        {
            upperNumTV.setText(R.string.K);
            lowerNumTV.setText(R.string.K);
        }
    }

    public void displayCardSuit(CardSuit cardSuit)
    {
        if (cardSuit == CardSuit.HEARTS)
        {
            upperSuitIV.setImageResource(R.drawable.heart_image);
            centerSuitIV.setImageResource(R.drawable.heart_image);
            lowerSuitIV.setImageResource(R.drawable.heart_image);
            upperNumTV.setTextColor(Color.parseColor("#e60000"));
            lowerNumTV.setTextColor(Color.parseColor("#e60000"));
        }
        else if (cardSuit == CardSuit.DIAMONDS)
        {
            upperSuitIV.setImageResource(R.drawable.diamond_image);
            centerSuitIV.setImageResource(R.drawable.diamond_image);
            lowerSuitIV.setImageResource(R.drawable.diamond_image);
            upperNumTV.setTextColor(Color.parseColor("#e60000"));
            lowerNumTV.setTextColor(Color.parseColor("#e60000"));
        }
        else if (cardSuit == CardSuit.SPADES)
        {
            upperSuitIV.setImageResource(R.drawable.spade_image);
            centerSuitIV.setImageResource(R.drawable.spade_image);
            lowerSuitIV.setImageResource(R.drawable.spade_image);
            upperNumTV.setTextColor(Color.parseColor("#000000"));
            lowerNumTV.setTextColor(Color.parseColor("#000000"));
        }
        else
        {
            upperSuitIV.setImageResource(R.drawable.club_image);
            centerSuitIV.setImageResource(R.drawable.club_image);
            lowerSuitIV.setImageResource(R.drawable.club_image);
            upperNumTV.setTextColor(Color.parseColor("#000000"));
            lowerNumTV.setTextColor(Color.parseColor("#000000"));
        }
    }

    public void onScreenClick(View view)
    {
        if (!cardStack.isEmpty())
        {
            showCard(cardStack.pop());
        }

        else
        {
            finish();
        }
    }

    public CardSuit toCardSuit(int n)
    {
        switch (n)
        {
            case 1:
                return CardSuit.HEARTS;
            case 2:
                return CardSuit.DIAMONDS;
            case 3:
                return CardSuit.SPADES;
            default:
                return CardSuit.CLUBS;
        }

    }
}
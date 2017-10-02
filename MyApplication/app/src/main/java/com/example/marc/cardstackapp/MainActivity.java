package com.example.marc.cardstackapp;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv_top_A, tv_bottom_A;
    LinearLayout main;
    ImageView top_image, middle_image, bottom_image;
    ArrayList<Integer> cards;
    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear);

        main = (LinearLayout) findViewById(R.id.mainScreen);
        tv_top_A = (TextView) findViewById(R.id.tv_top_A);
        tv_bottom_A = (TextView) findViewById(R.id.tv_bottom_A);
        top_image = (ImageView) findViewById(R.id.IV_top_heart);
        middle_image = (ImageView) findViewById(R.id.IV_mid_heart);
        bottom_image = (ImageView) findViewById(R.id.IV_bottom_heart);


        cards = new ArrayList<>();

        //hearts section
        cards.add(101);
        cards.add(102);
        cards.add(103);
        cards.add(104);
        cards.add(105);
        cards.add(106);
        cards.add(107);
        cards.add(108);
        cards.add(109);
        cards.add(110);
        cards.add(111);
        cards.add(112);
        cards.add(113);

        //spades section
        cards.add(201);
        cards.add(202);
        cards.add(203);
        cards.add(204);
        cards.add(205);
        cards.add(206);
        cards.add(207);
        cards.add(208);
        cards.add(209);
        cards.add(210);
        cards.add(211);
        cards.add(212);
        cards.add(213);

        //clubs section
        cards.add(301);
        cards.add(302);
        cards.add(303);
        cards.add(304);
        cards.add(305);
        cards.add(306);
        cards.add(307);
        cards.add(308);
        cards.add(309);
        cards.add(310);
        cards.add(311);
        cards.add(312);
        cards.add(313);

        //diamonds section
        cards.add(401);
        cards.add(402);
        cards.add(403);
        cards.add(404);
        cards.add(405);
        cards.add(406);
        cards.add(407);
        cards.add(408);
        cards.add(409);
        cards.add(410);
        cards.add(411);
        cards.add(412);
        cards.add(413);


        main.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                clickCount++;
                Collections.shuffle(cards);

                assignCard(cards.get(0), top_image, middle_image, bottom_image);
                if(clickCount == 52)
                {
                    finish();
                }
            }
        });
    }

    public void assignCard(int card, ImageView top_image, ImageView middle_image, ImageView bottom_image)
    {
        switch (card)
        {
            //hearts section
            case 101:
                tv_top_A.setText("1");
                tv_bottom_A.setText("1");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.drawable.ace_heart_24dp);
                middle_image.setImageResource(R.drawable.ace_heart_24dp);
                bottom_image.setImageResource(R.drawable.ace_heart_24dp);
                break;
            case 102:
                tv_top_A.setText("2");
                tv_bottom_A.setText("2");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.drawable.ace_heart_24dp);
                middle_image.setImageResource(R.drawable.ace_heart_24dp);
                bottom_image.setImageResource(R.drawable.ace_heart_24dp);
                break;
            case 103:
                tv_top_A.setText("3");
                tv_bottom_A.setText("3");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.drawable.ace_heart_24dp);
                middle_image.setImageResource(R.drawable.ace_heart_24dp);
                bottom_image.setImageResource(R.drawable.ace_heart_24dp);
                break;
            case 104:
                tv_top_A.setText("4");
                tv_bottom_A.setText("4");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.drawable.ace_heart_24dp);
                middle_image.setImageResource(R.drawable.ace_heart_24dp);
                bottom_image.setImageResource(R.drawable.ace_heart_24dp);
                break;
            case 105:
                tv_top_A.setText("5");
                tv_bottom_A.setText("5");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.drawable.ace_heart_24dp);
                middle_image.setImageResource(R.drawable.ace_heart_24dp);
                bottom_image.setImageResource(R.drawable.ace_heart_24dp);
                break;
            case 106:
                tv_top_A.setText("6");
                tv_bottom_A.setText("6");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.drawable.ace_heart_24dp);
                middle_image.setImageResource(R.drawable.ace_heart_24dp);
                bottom_image.setImageResource(R.drawable.ace_heart_24dp);
                break;
            case 107:
                tv_top_A.setText("7");
                tv_bottom_A.setText("7");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.drawable.ace_heart_24dp);
                middle_image.setImageResource(R.drawable.ace_heart_24dp);
                bottom_image.setImageResource(R.drawable.ace_heart_24dp);
                break;
            case 108:
                tv_top_A.setText("8");
                tv_bottom_A.setText("8");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.drawable.ace_heart_24dp);
                middle_image.setImageResource(R.drawable.ace_heart_24dp);
                bottom_image.setImageResource(R.drawable.ace_heart_24dp);
                break;
            case 109:
                tv_top_A.setText("9");
                tv_bottom_A.setText("9");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.drawable.ace_heart_24dp);
                middle_image.setImageResource(R.drawable.ace_heart_24dp);
                bottom_image.setImageResource(R.drawable.ace_heart_24dp);
                break;
            case 110:
                tv_top_A.setText("10");
                tv_bottom_A.setText("10");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.drawable.ace_heart_24dp);
                middle_image.setImageResource(R.drawable.ace_heart_24dp);
                bottom_image.setImageResource(R.drawable.ace_heart_24dp);
                break;
            case 111:
                tv_top_A.setText("J");
                tv_bottom_A.setText("J");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.drawable.ace_heart_24dp);
                middle_image.setImageResource(R.drawable.ace_heart_24dp);
                bottom_image.setImageResource(R.drawable.ace_heart_24dp);
                break;
            case 112:
                tv_top_A.setText("Q");
                tv_bottom_A.setText("Q");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.drawable.ace_heart_24dp);
                middle_image.setImageResource(R.drawable.ace_heart_24dp);
                bottom_image.setImageResource(R.drawable.ace_heart_24dp);
                break;
            case 113:
                tv_top_A.setText("K");
                tv_bottom_A.setText("K");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.drawable.ace_heart_24dp);
                middle_image.setImageResource(R.drawable.ace_heart_24dp);
                bottom_image.setImageResource(R.drawable.ace_heart_24dp);
                break;

            //spades section
            case 201:
                tv_top_A.setText("1");
                tv_bottom_A.setText("1");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.spades);
                middle_image.setImageResource(R.mipmap.spades);
                bottom_image.setImageResource(R.mipmap.spades);
                break;
            case 202:
                tv_top_A.setText("2");
                tv_bottom_A.setText("2");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.spades);
                middle_image.setImageResource(R.mipmap.spades);
                bottom_image.setImageResource(R.mipmap.spades);
                break;
            case 203:
                tv_top_A.setText("3");
                tv_bottom_A.setText("3");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.spades);
                middle_image.setImageResource(R.mipmap.spades);
                bottom_image.setImageResource(R.mipmap.spades);
                break;
            case 204:
                tv_top_A.setText("4");
                tv_bottom_A.setText("4");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.spades);
                middle_image.setImageResource(R.mipmap.spades);
                bottom_image.setImageResource(R.mipmap.spades);
                break;
            case 205:
                tv_top_A.setText("5");
                tv_bottom_A.setText("5");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.spades);
                middle_image.setImageResource(R.mipmap.spades);
                bottom_image.setImageResource(R.mipmap.spades);
                break;
            case 206:
                tv_top_A.setText("6");
                tv_bottom_A.setText("6");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.spades);
                middle_image.setImageResource(R.mipmap.spades);
                bottom_image.setImageResource(R.mipmap.spades);
                break;
            case 207:
                tv_top_A.setText("7");
                tv_bottom_A.setText("7");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.spades);
                middle_image.setImageResource(R.mipmap.spades);
                bottom_image.setImageResource(R.mipmap.spades);
                break;
            case 208:
                tv_top_A.setText("8");
                tv_bottom_A.setText("8");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.spades);
                middle_image.setImageResource(R.mipmap.spades);
                bottom_image.setImageResource(R.mipmap.spades);
                break;
            case 209:
                tv_top_A.setText("9");
                tv_bottom_A.setText("9");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.spades);
                middle_image.setImageResource(R.mipmap.spades);
                bottom_image.setImageResource(R.mipmap.spades);
                break;
            case 210:
                tv_top_A.setText("10");
                tv_bottom_A.setText("10");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.spades);
                middle_image.setImageResource(R.mipmap.spades);
                bottom_image.setImageResource(R.mipmap.spades);
                break;
            case 211:
                tv_top_A.setText("J");
                tv_bottom_A.setText("J");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.spades);
                middle_image.setImageResource(R.mipmap.spades);
                bottom_image.setImageResource(R.mipmap.spades);
                break;
            case 212:
                tv_top_A.setText("Q");
                tv_bottom_A.setText("Q");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.spades);
                middle_image.setImageResource(R.mipmap.spades);
                bottom_image.setImageResource(R.mipmap.spades);
                break;
            case 213:
                tv_top_A.setText("K");
                tv_bottom_A.setText("K");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.spades);
                middle_image.setImageResource(R.mipmap.spades);
                bottom_image.setImageResource(R.mipmap.spades);
                break;

            //clubs section
            case 301:
                tv_top_A.setText("1");
                tv_bottom_A.setText("1");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.clubs);
                middle_image.setImageResource(R.mipmap.clubs);
                bottom_image.setImageResource(R.mipmap.clubs);
                break;
            case 302:
                tv_top_A.setText("2");
                tv_bottom_A.setText("2");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.clubs);
                middle_image.setImageResource(R.mipmap.clubs);
                bottom_image.setImageResource(R.mipmap.clubs);
                break;
            case 303:
                tv_top_A.setText("3");
                tv_bottom_A.setText("3");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.clubs);
                middle_image.setImageResource(R.mipmap.clubs);
                bottom_image.setImageResource(R.mipmap.clubs);
                break;
            case 304:
                tv_top_A.setText("4");
                tv_bottom_A.setText("4");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.clubs);
                middle_image.setImageResource(R.mipmap.clubs);
                bottom_image.setImageResource(R.mipmap.clubs);
                break;
            case 305:
                tv_top_A.setText("5");
                tv_bottom_A.setText("5");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.clubs);
                middle_image.setImageResource(R.mipmap.clubs);
                bottom_image.setImageResource(R.mipmap.clubs);
                break;
            case 306:
                tv_top_A.setText("6");
                tv_bottom_A.setText("6");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.clubs);
                middle_image.setImageResource(R.mipmap.clubs);
                bottom_image.setImageResource(R.mipmap.clubs);
                break;
            case 307:
                tv_top_A.setText("7");
                tv_bottom_A.setText("7");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.clubs);
                middle_image.setImageResource(R.mipmap.clubs);
                bottom_image.setImageResource(R.mipmap.clubs);
                break;
            case 308:
                tv_top_A.setText("8");
                tv_bottom_A.setText("8");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.clubs);
                middle_image.setImageResource(R.mipmap.clubs);
                bottom_image.setImageResource(R.mipmap.clubs);
                break;
            case 309:
                tv_top_A.setText("9");
                tv_bottom_A.setText("9");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.clubs);
                middle_image.setImageResource(R.mipmap.clubs);
                bottom_image.setImageResource(R.mipmap.clubs);
                break;
            case 310:
                tv_top_A.setText("10");
                tv_bottom_A.setText("10");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.clubs);
                middle_image.setImageResource(R.mipmap.clubs);
                bottom_image.setImageResource(R.mipmap.clubs);
                break;
            case 311:
                tv_top_A.setText("J");
                tv_bottom_A.setText("J");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.clubs);
                middle_image.setImageResource(R.mipmap.clubs);
                bottom_image.setImageResource(R.mipmap.clubs);
                break;
            case 312:
                tv_top_A.setText("Q");
                tv_bottom_A.setText("Q");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.clubs);
                middle_image.setImageResource(R.mipmap.clubs);
                bottom_image.setImageResource(R.mipmap.clubs);
                break;
            case 313:
                tv_top_A.setText("K");
                tv_bottom_A.setText("K");
                tv_top_A.setTextColor(Color.BLACK);
                tv_bottom_A.setTextColor(Color.BLACK);
                top_image.setImageResource(R.mipmap.clubs);
                middle_image.setImageResource(R.mipmap.clubs);
                bottom_image.setImageResource(R.mipmap.clubs);
                break;

            //diamonds section
            case 401:
                tv_top_A.setText("1");
                tv_bottom_A.setText("1");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.mipmap.diamonds);
                middle_image.setImageResource(R.mipmap.diamonds);
                bottom_image.setImageResource(R.mipmap.diamonds);
                break;
            case 402:
                tv_top_A.setText("2");
                tv_bottom_A.setText("2");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.mipmap.diamonds);
                middle_image.setImageResource(R.mipmap.diamonds);
                bottom_image.setImageResource(R.mipmap.diamonds);
                break;
            case 403:
                tv_top_A.setText("3");
                tv_bottom_A.setText("3");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.mipmap.diamonds);
                middle_image.setImageResource(R.mipmap.diamonds);
                bottom_image.setImageResource(R.mipmap.diamonds);
                break;
            case 404:
                tv_top_A.setText("4");
                tv_bottom_A.setText("4");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.mipmap.diamonds);
                middle_image.setImageResource(R.mipmap.diamonds);
                bottom_image.setImageResource(R.mipmap.diamonds);
                break;
            case 405:
                tv_top_A.setText("5");
                tv_bottom_A.setText("5");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.mipmap.diamonds);
                middle_image.setImageResource(R.mipmap.diamonds);
                bottom_image.setImageResource(R.mipmap.diamonds);
                break;
            case 406:
                tv_top_A.setText("6");
                tv_bottom_A.setText("6");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.mipmap.diamonds);
                middle_image.setImageResource(R.mipmap.diamonds);
                bottom_image.setImageResource(R.mipmap.diamonds);
                break;
            case 407:
                tv_top_A.setText("7");
                tv_bottom_A.setText("7");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.mipmap.diamonds);
                middle_image.setImageResource(R.mipmap.diamonds);
                bottom_image.setImageResource(R.mipmap.diamonds);
                break;
            case 408:
                tv_top_A.setText("8");
                tv_bottom_A.setText("8");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.mipmap.diamonds);
                middle_image.setImageResource(R.mipmap.diamonds);
                bottom_image.setImageResource(R.mipmap.diamonds);
                break;
            case 409:
                tv_top_A.setText("9");
                tv_bottom_A.setText("9");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.mipmap.diamonds);
                middle_image.setImageResource(R.mipmap.diamonds);
                bottom_image.setImageResource(R.mipmap.diamonds);
                break;
            case 410:
                tv_top_A.setText("10");
                tv_bottom_A.setText("10");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.mipmap.diamonds);
                middle_image.setImageResource(R.mipmap.diamonds);
                bottom_image.setImageResource(R.mipmap.diamonds);
                break;
            case 411:
                tv_top_A.setText("J");
                tv_bottom_A.setText("J");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.mipmap.diamonds);
                middle_image.setImageResource(R.mipmap.diamonds);
                bottom_image.setImageResource(R.mipmap.diamonds);
                break;
            case 412:
                tv_top_A.setText("Q");
                tv_bottom_A.setText("Q");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.mipmap.diamonds);
                middle_image.setImageResource(R.mipmap.diamonds);
                bottom_image.setImageResource(R.mipmap.diamonds);
                break;
            case 413:
                tv_top_A.setText("K");
                tv_bottom_A.setText("K");
                tv_top_A.setTextColor(Color.RED);
                tv_bottom_A.setTextColor(Color.RED);
                top_image.setImageResource(R.mipmap.diamonds);
                middle_image.setImageResource(R.mipmap.diamonds);
                bottom_image.setImageResource(R.mipmap.diamonds);
                break;
        }
    }
}

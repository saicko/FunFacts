package com.example.saicko.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Sasa on 19.2.2015..
 */
public class ColorWheel {



    public String mColors[] = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9848b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#e56500", // orange
            "#009900", // green1
            "#0064c8", // blue
            "#ec1db5"  // pink




    };



    public int getColor() {



        String color = "";
        //random fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;


    }
}



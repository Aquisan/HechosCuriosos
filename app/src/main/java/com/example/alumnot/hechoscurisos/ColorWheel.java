package com.example.alumnot.hechoscurisos;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import java.util.Random;

public class ColorWheel

{
    public static int getRandomColor(Context context)
    {
        Resources res = context.getResources();

        TypedArray colors = res.obtainTypedArray(R.array.colors);
        Random random = new Random();
        return colors.getColor(random.nextInt(colors.length()),0);
    }


}

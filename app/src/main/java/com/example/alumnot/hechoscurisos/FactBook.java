package com.example.alumnot.hechoscurisos;

import android.content.Context;
import android.content.res.Resources;
import java.util.Random;

public class FactBook
{
    public static String getRandomFact(Context context)
    {
        Resources res = context.getResources();
        String[] aFacts = res.getStringArray(R.array.facts_array);
        Random random = new Random();
        return aFacts[random.nextInt(aFacts.length)];
    }

}



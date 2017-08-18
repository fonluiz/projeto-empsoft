package com.example.melhoridade.melhoridade.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static android.content.ContentValues.TAG;

public class SharedPreferencesUtils {

    private static final String interestsFile = "ARQUIVO_DE_INTERESSES";
    private static final String interestsKey = "INTERESTS_KEY";

    public static void saveInterests(Context context, String[] interests) {
        Set<String> mySet = new HashSet<String>(Arrays.asList(interests));

        SharedPreferences sharedPref = context.getSharedPreferences(interestsFile, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putStringSet(interestsKey, mySet);
        editor.commit();
    }

    public static String[] retrieveInterests(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(interestsFile, Context.MODE_PRIVATE);
        Set<String> defaultValue = new HashSet<>();
        Set<String> interests = sharedPref.getStringSet(interestsKey, defaultValue);
        String[] array = interests.toArray(new String[interests.size()]);
        return  array;
    }
}

package com.example.user.wordcountjava;

/**
 * Created by user on 04/07/2017.
 */


public class WordCount{

    public int count(String stringToCount){
        String[] arrayOfWords = stringToCount.split(" ");
        int numberOfWords = arrayOfWords.length;
        return numberOfWords;

    }


}

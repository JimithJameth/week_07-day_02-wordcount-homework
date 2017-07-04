package com.example.user.wordcountjava;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 04/07/2017.
 */

public class WordCountTest{

    WordCount wordcount;

    @Before

    public void before(){

        wordcount = new WordCount();
    }

    @Test
    public void haswordCount(){
        assertEquals(4,wordcount.count("This is a string"));
    }
 }


package com.example.user.wordcountjava;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 04/07/2017.
 */

public class WordCounterTest{

    WordCounter wordcounter;

    @Before

    public void before(){

        wordcounter = new WordCounter();
    }

    @Test
    public void haswordCount(){
        assertEquals(4,wordcounter.count("This is a string"));
    }
 }


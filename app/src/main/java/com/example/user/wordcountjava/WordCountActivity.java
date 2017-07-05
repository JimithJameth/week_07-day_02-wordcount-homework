package com.example.user.wordcountjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.user.wordcountjava.R.id.button;


public class WordCountActivity extends AppCompatActivity {

    EditText word_textEditText;
    TextView answerText;
    Button wordCountButton;
    WordCounter wordCounter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        Log.d(getClass().toString(), "onCreate called");

        word_textEditText = (EditText) findViewById(R.id.word_text);
        answerText = (TextView) findViewById(R.id.answer_text);
        wordCountButton = (Button) findViewById(button);
    }

    public void WordCountButtonClicked(View button) {
        wordCounter = new WordCounter();
        String question = word_textEditText.getText().toString();
        int answer = wordCounter.count(question);
        answerText.setText(Integer.toString(answer));

    }
}



package com.example.vasu.assignment4part2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ValuesScreen = findViewById(R.id.submit_value);
        ValuesScreen.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent goToEV = new Intent(getApplicationContext(), EnterValue.class);
                startActivity(goToEV);
            }

        });

        Button viewScreen = findViewById(R.id.submit_synonym);
        viewScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FindSynonym.class);
                EditText EnterValue = findViewById(R.id.word_input);
                intent.putExtra("EnterValue", EnterValue.getText().toString());
                startActivity(intent);
            }

        });

    }
}

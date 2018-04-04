package com.example.vasu.assignment4part2;


import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class EnterValue extends AppCompatActivity {
    private ApplicationDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_value);
        final ApplicationDatabase database = ApplicationDatabase.fetch(getApplicationContext());
        final Contact contact = new Contact();
        Button submitButton = findViewById(R.id.button6);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText TFWord = findViewById(R.id.TFWord);
                String word = TFWord.getText().toString();
                contact.setWord(word);

                EditText TFSynonym = findViewById(R.id.TFSynonym);
                String anWord = TFSynonym.getText().toString();
                contact.setSyn(anWord);

                new AsyncTask<Void, Void, Void>() {

                    @Override
                    protected Void doInBackground(Void... voids) {
                        database.contactModel().insertUser(contact);
                        return null;
                    }

                    @Override
                    protected void onPostExecute(Void aVoid) {
                        Intent goToValueAct = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(goToValueAct);
                    }

                }.execute();

            }

        });
    }


}
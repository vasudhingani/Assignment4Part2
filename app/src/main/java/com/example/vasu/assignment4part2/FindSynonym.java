package com.example.vasu.assignment4part2;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class FindSynonym extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_synonym);

        final String mainText = getIntent().getExtras().getString("EnterValue");
        final String invalidSearch = "Could not find the Word";
        final TextView answer = findViewById(R.id.result);

        new AsyncTask<Context,Void,Void>(){

            @Override
            protected Void doInBackground(Context... contexts) {
                Contact synonym = ApplicationDatabase.fetch(contexts[0]).contactModel().findByName(mainText);
                if(synonym != null){
                    answer.setText(synonym.getSyn());
                } else {
                    answer.setText(invalidSearch);
                }
                return null;
            }
        }.execute(this);

}
}





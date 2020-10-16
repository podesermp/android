package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoComplete extends AppCompatActivity {

    private  static final String [] VideoGames = new String[]{
            "Xbox","PS2","PS3","Xbox One","Xbox 360","PS4"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        AutoCompleteTextView editText = findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, VideoGames);
        editText.setAdapter(adp);
    }
}
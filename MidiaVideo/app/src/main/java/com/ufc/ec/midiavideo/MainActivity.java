package com.ufc.ec.midiavideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonExecutar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonExecutar = findViewById(R.id.buttonExecutar);
    }


    public void abrirVideo(View view){
        startActivity( new Intent(this,PlayerActivity.class));
    }
}

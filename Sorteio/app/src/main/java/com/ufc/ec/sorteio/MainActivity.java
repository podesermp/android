package com.ufc.ec.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sorteio(View view){
        TextView newtexto = findViewById(R.id.texto);

        int numeroSorteado = new Random().nextInt(11);

        newtexto.setText("Número sortedo foi: " + numeroSorteado);
    }

}

package com.ufc.ec.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Primeiro parametro do 'intent' é o contexto da activity e o segundo é qual tela vai abrir no 'startActivity()'
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //Instanciar objeto
                Usuario usuario = new Usuario("Marcos Paulo", "soueump12@gmail.com");


                //passar dados de uma activity para outra
                //o valor 'name' é como eu acho/chamo na outra activity, o valor 'value' é o que realmente é o valor;
                intent.putExtra("nome", "Marcos Paulo");
                intent.putExtra("idade", 20);
                intent.putExtra("objeto", usuario);

                startActivity(intent);
            }
        });
    }
}

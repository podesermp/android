package com.ufc.ec.minhasanotaes;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AnotacaoPreferencia preferencias;
    private EditText editAnotacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAnotacao = findViewById(R.id.editAnotacao);
        preferencias = new AnotacaoPreferencia( getApplicationContext() );

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Validação dos dados
                String textoRecuperado = editAnotacao.getText().toString();
                if( textoRecuperado.equals("") ){
                    //Snackbar.make(view, "Preencha a anotação!", Snackbar.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), "Preencha a anotação!", Toast.LENGTH_LONG).show();

                }else{
                    preferencias.salvarAnotacao( textoRecuperado );
                    //Snackbar.make(view, "Anotação salva com sucesso", Snackbar.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), "Anotação salva com sucesso", Toast.LENGTH_LONG).show();
                }



            }
        });

        //Recuperar anotação
        String anotacao =  preferencias.recuperarAnotacao();
        if( !anotacao.equals("") ){
            editAnotacao.setText( anotacao );
        }

    }

}

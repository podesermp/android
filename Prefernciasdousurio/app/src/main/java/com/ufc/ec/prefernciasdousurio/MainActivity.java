package com.ufc.ec.prefernciasdousurio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private Button buttonSalvar;
    private TextInputEditText editNome;
    private TextView textResultado;
    private static final String ARQUIVO_PREFERENCIA = "ArquivoPreferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSalvar = findViewById(R.id.buttonSalvar);
        editNome = findViewById(R.id.editNome);
        textResultado = findViewById(R.id.textResultado);

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mode 0 : so o nosso aplicativo vai conseguir salvar e ler o arquivo.
                SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
                SharedPreferences.Editor editor =  preferences.edit();

                if(editNome.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Preencha o nome", Toast.LENGTH_SHORT).show();
                }else{
                    String nome = editNome.getText().toString();
                    editor.putString("nome", nome);
                    editor.commit();
                    textResultado.setText("Olá, " + nome);
                }

            }
        });

        //Recuperar dados salvos
        SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);

        //Validar se tem o nome em preferencias
        if(preferences.contains("nome")){
            String nome = preferences.getString("nome", "usuário não definido");
            textResultado.setText("Olá, " + nome);
        }else{
            textResultado.setText("Ola, usuário não definido");
        }
    }
}

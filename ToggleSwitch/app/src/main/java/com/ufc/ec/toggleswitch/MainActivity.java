package com.ufc.ec.toggleswitch;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch switchSenha;
    private ToggleButton toggleSenha;
    private TextView textResultado;
    private CheckBox checkSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchSenha = findViewById(R.id.switchLembrarSenha);
        toggleSenha = findViewById(R.id.toggleSenha);
        textResultado = findViewById(R.id.Textresultado);
        checkSenha = findViewById(R.id.checkSenha);
        adicionarListener();
    }

    public void adicionarListener(){

        checkSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    textResultado.setText("Ligado");
                }else{
                    textResultado.setText("Desligado");
                }
            }
        });

    }

    public void enviar(View view){
        if(checkSenha.isChecked()){
            textResultado.setText("Check Ligado");
        }else{
            textResultado.setText("Check Desligado");
        }
    }
}

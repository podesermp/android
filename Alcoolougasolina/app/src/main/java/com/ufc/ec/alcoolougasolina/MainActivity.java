package com.ufc.ec.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText alcool;
    private TextInputEditText gasolina;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.alcool = findViewById(R.id.editAlcool);
        this.gasolina = findViewById(R.id.editGasolina);
        this.resultado = findViewById(R.id.textResultado);

    }


    public void melhorCombustivel(View view){
        //recuperar valores digitados

        String precoAlcool = alcool.getText().toString();
        String precoGasolina = gasolina.getText().toString();

        //Validar dados
        if(validacaoDeCampos(precoAlcool,precoGasolina)){

        double valorAlcool = Double.parseDouble(precoAlcool);
        double valorGasolina = Double.parseDouble(precoGasolina);

        if(valorAlcool / valorGasolina >= 0.7){
            resultado.setText("Melhor usar gasolina");
        }else{
            resultado.setText("Melhor usar Alcool");
        }

        }else{
            resultado.setText("Responda os campos primeiro");
        }

    }

    public boolean validacaoDeCampos(String pAlccol, String pGasolina){

        boolean camposValidados = true;

        if(pAlccol.equals("") || pAlccol == null){
            camposValidados = false;
        }else if(pGasolina.equals("") || pGasolina == null){
            camposValidados = false;
        }
        return  camposValidados;
    }

}

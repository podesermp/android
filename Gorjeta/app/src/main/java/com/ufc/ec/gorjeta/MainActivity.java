package com.ufc.ec.gorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextView textPorcentagem, textTotal, textGorjeta;
    private SeekBar seekPorcentagem;
    private TextInputEditText inputValor;

    private double porcentagem = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textPorcentagem = findViewById(R.id.textPorcentagem);
        textGorjeta = findViewById(R.id.textGorjeta);
        textTotal = findViewById(R.id.textTotal);
        seekPorcentagem = findViewById(R.id.seekPorcentagem);
        inputValor = findViewById(R.id.inputValor);

        seekPorcentagem.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textPorcentagem.setText(progress + " %");
                porcentagem = progress;
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void calcular(){

        String valorRecuperado = inputValor.getText().toString();

        if(valorRecuperado == null || valorRecuperado.equals("")){
            Toast.makeText(
                    getApplicationContext(),
                    "insira o valor primeiro",
                    Toast.LENGTH_SHORT
            ).show();
        }else{
            double valor = Double.parseDouble(valorRecuperado);
            double gorjeta, total;

            gorjeta = porcentagem/100 * valor;
            textGorjeta.setText("R$ " + gorjeta);
            total = gorjeta + valor;
            textTotal.setText("R$ " + total);

        }


    }

}

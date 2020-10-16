package com.ufc.ec.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String numeroSorteado(){

        String[] opcoes = {
                "pedra",
                "papel",
                "tesoura"
        };

        int numero = new Random().nextInt(3);

        return opcoes[numero];
    }


    public void selecionadoPedra(View view){
        this.disputa("pedra", this.numeroSorteado());
    }

    public void selecionadoPapel(View view){
        this.disputa("papel", this.numeroSorteado());
    }
    public void selecionadoTesoura(View view){
        this.disputa("tesoura", this.numeroSorteado());
    }



    public void disputa(String minhaOpcao, String opcaoMaquina){
        if(minhaOpcao == "pedra" && opcaoMaquina == "papel" || minhaOpcao == "papel" && opcaoMaquina == "tesoura" || minhaOpcao == "tesoura" && opcaoMaquina == "pedra"){

            ImageView imageResult = findViewById(R.id.escolhaMaquina);
            switch (opcaoMaquina){
                case "pedra":
                    imageResult.setImageResource(R.drawable.pedra);
                    break;
                case "papel":
                    imageResult.setImageResource(R.drawable.papel);
                    break;
                case "tesoura":
                    imageResult.setImageResource(R.drawable.tesoura);
                    break;
            }

            TextView result = findViewById(R.id.resultado);
            result.setText("Você perdeu :(");

        }else if(opcaoMaquina == "pedra" && minhaOpcao == "papel" || opcaoMaquina == "papel" && minhaOpcao == "tesoura" || opcaoMaquina == "tesoura" && minhaOpcao == "pedra"){

            ImageView imageResult = findViewById(R.id.escolhaMaquina);
            switch (opcaoMaquina){
                case "pedra":
                    imageResult.setImageResource(R.drawable.pedra);
                    break;
                case "papel":
                    imageResult.setImageResource(R.drawable.papel);
                    break;
                case "tesoura":
                    imageResult.setImageResource(R.drawable.tesoura);
                    break;
            }

            TextView result = findViewById(R.id.resultado);
            result.setText("Você ganhouu - PARABÉNS");

        }else{

            ImageView imageResult = findViewById(R.id.escolhaMaquina);
            switch (opcaoMaquina){
                case "pedra":
                    imageResult.setImageResource(R.drawable.pedra);
                    break;
                case "papel":
                    imageResult.setImageResource(R.drawable.papel);
                    break;
                case "tesoura":
                    imageResult.setImageResource(R.drawable.tesoura);
                    break;
            }

            TextView result = findViewById(R.id.resultado);
            result.setText("EMPATE ¬¬");
        }
    }
}

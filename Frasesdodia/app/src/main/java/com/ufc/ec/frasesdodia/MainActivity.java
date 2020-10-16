package com.ufc.ec.frasesdodia;

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

    public void new_frase(View view){

        String[] frases = {
                "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!\n" +
                        "Rui Barbosa ",
                "É melhor conquistar a si mesmo do que vencer mil batalhas.\n" +
                        "Buda ",
                "Quem ousou conquistar e saiu pra lutar, chega mais longe!\n" +
                        "Charlie Brown Jr ",
                "O importante não é vencer todos os dias, mas lutar sempre.\n" +
                        "Waldemar Valle Martins ",
                "Enquanto houver vontade de lutar haverá esperança de vencer.\n" +
                        "Santo Agostinho ",
                "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.\n" +
                        "Roberto Shinyashiki ",
                "Nunca deixe ninguém te dizer que não pode fazer alguma coisa. Se você tem um sonho tem que correr atrás dele. As pessoas não conseguem vencer e dizem que você também não vai vencer. Se você quer uma coisa corre atrás.\n" +
                        "À Procura da Felicidade ",
                "Desconfie do destino e acredite em você. Gaste mais horas realizando que sonhando, fazendo que planejando, vivendo que esperando porque, embora quem quase morre esteja vivo, quem quase vive já morreu.\n" +
                        "Sarah Westphal ",
                "Perder tempo em aprender coisas que não interessam, priva-nos de descobrir coisas interessantes.\n" +
                        "Carlos Drummond de Andrade ",
                "Pedras no caminho? Eu guardo todas. Um dia vou construir um castelo.\n" +
                        "Nemo Nox "
        };

        TextView novo_texto = findViewById(R.id.texto);
        int numerosorteado = new Random().nextInt(10);
        novo_texto.setText(frases[numerosorteado]);
    }
}

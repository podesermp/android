 package com.ufc.ec.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] locais = {
            "Cruzeiro", "Violete", "Nova Aldeota",
            "Flores", "Jardim", "Julho I", "Julho II", "Centro",
            "Coqueiro", "Area Nobre", "Salgadinho", "Picos", "Novo Horizonte",
            "Boa Vista", "Alto Alegre", "Cacimbas", "COHAB", "Estação", "Ladeira", "Fazendinha",
            "Maranhão", "Madalenas", "Mourão", "São Francisco", "São Sebastião", "Sanharão"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);


        //Criar adaptador para lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1, //Layout da lista
                android.R.id.text1, //id
                locais
        );

        //Adicionar adaptador para lista
        listLocais.setAdapter(adaptador);

        //Adicionar click na lista
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valorSelecionado = listLocais.getItemAtPosition(position).toString();
                Toast.makeText(
                        getApplicationContext(),
                        valorSelecionado,
                        Toast.LENGTH_LONG
                ).show();

            }
        });
    }
}

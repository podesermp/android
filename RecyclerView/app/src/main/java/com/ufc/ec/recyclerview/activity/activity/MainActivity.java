package com.ufc.ec.recyclerview.activity.activity;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.ufc.ec.recyclerview.R;
import com.ufc.ec.recyclerview.activity.RecyclerItemClickListener;
import com.ufc.ec.recyclerview.activity.adapter.Adapter;
import com.ufc.ec.recyclerview.activity.model.Bairro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Bairro> listaBairros = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Criar listagem
        this.criarBairros();


        //Configurar Adapter
        Adapter adapter = new Adapter(listaBairros);


        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(    adapter     );

        //Evento de click
        recyclerView.addOnItemTouchListener(
            new RecyclerItemClickListener(
                    getApplicationContext(),
                    recyclerView,
                    new RecyclerItemClickListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            Bairro bairro = listaBairros.get(position);

                            Toast.makeText(
                                    getApplicationContext(),
                                    "bairro: " + bairro.getNomeBairro(),
                                    Toast.LENGTH_SHORT
                            ).show();
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {
                            Bairro bairro = listaBairros.get(position);
                            Toast.makeText(
                                    getApplicationContext(),
                                      bairro.getNomeBairro() + " tem " + bairro.getPopulacao() + " moradores",
                                    Toast.LENGTH_LONG
                            ).show();
                        }

                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        }
                    }
            )
        );

    }

    public void criarBairros(){
        int contId = 1;

        String id = Integer.toString(contId);
        Bairro bairro = new Bairro("Alto Alegre", id, "2055 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Área Nobre", id, "1575 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Boa Vista", id, "1357 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Cacimbas", id, "4650 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Centro", id, "2120 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Conjunto COHAB", id, "4233 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Coqueiro", id, "2092 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Cruzeiro", id, "6714 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Flores", id, "2748 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;


        id = Integer.toString(contId);
        bairro = new Bairro("Estação", id, "1602 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Fazendinha", id, "1467 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Julho", id, "395 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Ladeira", id, "4751 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Madalenas", id, "1237 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Maranhão", id, "1749 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Mourão", id, "1737 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Nova Aldeota", id, "3540 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Picos", id, "2175 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("São Francisco", id, "2087 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("São Sebastião", id, "1100 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Sanharão", id, "1438 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;

        id = Integer.toString(contId);
        bairro = new Bairro("Violete", id, "5732 pessoas");
        this.listaBairros.add(bairro);
        contId = Integer.parseInt(id);
        contId++;
    }
}

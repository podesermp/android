package com.ufc.ec.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import com.ufc.ec.cardview.R;
import com.ufc.ec.cardview.adapter.PostagemAdapter;
import com.ufc.ec.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> posts = new ArrayList<>();

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);


        //Definir layout
//        LinearLayoutManager layoutManager =  new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayout.VERTICAL);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Definir adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(posts);
        recyclerPostagem.setAdapter( adapter );

    }


    public void prepararPostagens(){
        Postagem p = new Postagem("Marcos Paulo", "Dia Feliz", R.drawable.imagem1);
        this.posts.add(p);

        p = new Postagem("José Paulo", "Deus é amor", R.drawable.imagem2);
        this.posts.add(p);

        p = new Postagem("Sara Rocha", "Felixidadisss", R.drawable.imagem3);
        this.posts.add(p);

        p = new Postagem("Marta Rocha", "Bons tempos ", R.drawable.imagem4);
        this.posts.add(p);
    }
}

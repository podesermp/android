package com.ufc.ec.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentTransitionImpl;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.ufc.ec.fragments.R;
import com.ufc.ec.fragments.fragment.ContatosFragment;
import com.ufc.ec.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversas, buttonContatos;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContatos = findViewById(R.id.buttonContatos);
        buttonConversas = findViewById(R.id.buttonConversas);


        //Remover a sombra da Action Bar
        getSupportActionBar().setElevation(0);



        //Configurar objeto para exibir os fragmentos
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.add(R.id.frameConteudo, conversasFragment);
//        transaction.commit();


        buttonContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatosFragment = new ContatosFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, contatosFragment);
//                Toast.makeText(getApplicationContext(),"Contatos",Toast.LENGTH_SHORT).show();
                transaction.commit();
            }
        });

        buttonConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversasFragment = new ConversasFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, conversasFragment);
                Toast.makeText(getApplicationContext(), "Conversas", Toast.LENGTH_SHORT).show();
                transaction.commit();
            }
        });


    }
}
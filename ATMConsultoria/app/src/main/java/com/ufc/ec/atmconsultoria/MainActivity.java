package com.ufc.ec.atmconsultoria;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarEmail();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_principal, R.id.nav_servicos, R.id.nav_clientes,
                R.id.nav_contato, R.id.nav_sobre)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void enviarEmail(){
        String tel = "tel:88999273765";
        String imagem = "https://imagem.band.com.br/f_474186.jpg";
        String endereco = "https://www.google.com/maps/place/Praia+Da+Baleia/@-3.4796441,-39.5795184,15z/data=!4m5!3m4!1s0x7c0492963b899f1:0xd6f6c38f05eec9de!8m2!3d-3.4850694!4d-39.5747092";
        //Intent intent = new Intent( Intent.ACTION_DIAL, Uri.parse(tel) );
        //Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse(imagem) );
        //Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse(endereco) );


        Intent intent = new Intent( Intent.ACTION_SEND);
        intent.putExtra( Intent.EXTRA_EMAIL, new String[]{"soueump12@gmail.com"} );
        intent.putExtra( Intent.EXTRA_SUBJECT, "Contato pelo app ATM" );
        intent.putExtra( Intent.EXTRA_TEXT, "Mensagem automática" );


        //EMail
        //intent.setType("message/rfc822");

        //Texto padrãó
        //intent.setType("text/plain");

        //intent.setType("image/*");
        intent.setType("application/pdf");


        startActivity( Intent.createChooser(intent, "Compartilhar") );

    }

}

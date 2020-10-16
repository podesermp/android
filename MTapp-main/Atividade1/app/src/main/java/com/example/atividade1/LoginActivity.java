package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN, WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);

        setContentView(R.layout.activity_login);

        Button ButLogin = (Button) findViewById(R.id.btnLogin);
        ButLogin.setOnClickListener(new View.OnClickListener(){

            public void onClick (View args0){
                Intent intent;
                intent = new Intent(LoginActivity.this, MenuActivity.class);
                startActivity(intent);
                LoginActivity.this.finish();
            }
        } );


        TextView cadText = (TextView) findViewById(R.id.TextCadastre);
        cadText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(LoginActivity.this,Cadastro.class);
                startActivity(intent);

            }
        });


    }
}
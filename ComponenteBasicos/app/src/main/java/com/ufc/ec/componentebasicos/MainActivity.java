package com.ufc.ec.componentebasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView resultado;
    //CheckBox
    private CheckBox checkVerde, checkBranco ,checkVermelho;
    //radioButton
    private RadioButton radioButtonM, radioButtonF;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome           = findViewById(R.id.editNome);
        campoEmail          = findViewById(R.id.editEmail);
        resultado           = findViewById(R.id.resultado);

        //CheckBox
        //findViewById associa a variável ao id da aplicação

        checkVerde          = findViewById(R.id.checkVerde);
        checkBranco         = findViewById(R.id.checkBranco);
        checkVermelho       = findViewById(R.id.checkVermelho);

        this.radioButtonM   = findViewById(R.id.radioMasculino);
        this.radioButtonF   = findViewById(R.id.radioFeminino);

        this.opcaoSexo      = findViewById(R.id.radioGrouoSexo);

        radioButton();
    }




    public void radioButton(){

        boolean sexoMasculino = radioButtonM.isChecked();
        boolean sexoFeminino = radioButtonF.isChecked();

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioMasculino){
                    resultado.setText("Masculino");
                }else if(checkedId == R.id.radioFeminino){
                    resultado.setText("Feminino");
                }
            }
        });


        /*
        if(sexoMasculino){
            resultado.setText("Cabra maxo");
//            String sexo = radioButtonM.getText().toString();
//            resultado.setText(sexo);
        }else if(sexoFeminino){
            resultado.setText("Donzela corajosa");
//            String sexo = radioButtonF.getText().toString();
//            resultado.setText(sexo);
        }
         */

    }

    public void enviar(View view){

        //radioButton();

        //chatBox();
        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        resultado.setText(nome + " - " + email);
        */
    }

    public void limpar(View view){
        campoNome.setText("");
        campoEmail.setText("");
        //resultado.setText("");
    }

    public void chatBox(){

        //isChecked() é pra saber se a caixa está marcada, caso esteja retorn TRUE, caso contrário, FALSE;

        boolean resultadoVerde = checkVerde.isChecked();
        boolean resultadoBranco = checkBranco.isChecked();
        boolean resultadoVermelho = checkVermelho.isChecked();

        String texto = "";

        if(resultadoVerde){
            //texto = "Verde selecionado - ";

            String corSelecionada = checkVerde.getText().toString();
            texto = corSelecionada + "  ";
        }
        if(resultadoBranco){
            //texto = texto + "Branco selecionado - ";
            String corSelecionada = checkBranco.getText().toString();
            texto = texto + corSelecionada + "  ";
        }
        if(resultadoVermelho){
            //texto = texto + "Vermelho selecionado";
            String corSelecionada = checkVermelho.getText().toString();
            texto = texto + corSelecionada;

        }

        resultado.setText(texto);

    }

}

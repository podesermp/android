package com.ufc.ec.toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private ProgressBar horizontal, circular;
    private int progresso = 0;
    //private  int escala = 0;
    private TextView textResultado;
    private SeekBar seekEscala;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horizontal = findViewById(R.id.progressHorizontal);
        circular = findViewById(R.id.progressCircular);
        circular.setVisibility(View.GONE);
        textResultado = findViewById(R.id.textResultado);
        seekEscala = findViewById(R.id.seekEscala);

        textResultado.setVisibility(View.GONE);

        seekEscala.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textResultado.setText("Progresso = " + progress + " / " + seekEscala.getMax());
                //escala = progress;
                textResultado.setVisibility(View.VISIBLE);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void abrirToast(View view, String imprimir){
        /*
        //Customizável
        ImageView imagem = new ImageView(getApplicationContext());
        Toast toast = new Toast(getApplicationContext());

        TextView text = new TextView(getApplicationContext());
        text.setText("Olá Toast");
        text.setBackgroundResource(R.color.colorAccent);

        imagem.setImageResource(android.R.drawable.star_big_off);
        toast.setDuration(Toast.LENGTH_LONG);
        //toast.setView(imagem);
        toast.setView(text);
        toast.show();
        */


        Toast.makeText(
            getApplicationContext(),
                "Você apertou o botão " + imprimir, //Mensagem que vai ser exibida.
                Toast.LENGTH_LONG  //Duração que a mensagem passa na tela.
        ).show(); //.show faz com que a mensagem seja exibida.

    }

    public void aletDialog(final View view){

        final String sim = "SIM", nao = "NÃO";

        //Instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //Configurar titulo e mensagem
        dialog.setTitle("Aqui jás o titulo da mensagem");
        dialog.setMessage("Mensagem de gialogo");

        //Configurar cancelamento
        dialog.setCancelable(true);

        //configurar icone
        dialog.setIcon(android.R.drawable.ic_dialog_alert);

        //Configurar ações para sim ou não
        dialog.setPositiveButton(sim, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                abrirToast(view,sim);
            }
        });

        dialog.setNegativeButton(nao, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                abrirToast(view,nao);
            }
        });

        //Criar e exibir AlertDialog
        dialog.create();
        dialog.show();

    }
    public void toast(View view){
        Toast.makeText(
                getApplicationContext(),
                "Oi toast",
                Toast.LENGTH_LONG
        ).show();
    }


    public void carregarProgressBar(View view){

        //Horizontal
        this.progresso = this.progresso + 1;
        horizontal.setProgress(this.progresso);

        //Circular
        circular.setVisibility(View.VISIBLE);
        if(this.progresso == 10){
            circular.setVisibility(View.GONE);
        }
    }

    public void zerar(View view){
        this.progresso = 0;
        horizontal.setProgress(this.progresso);

        circular.setVisibility(View.GONE);

    }

    public void resultado(View view){

        textResultado.setVisibility(View.VISIBLE);
        textResultado.setText("Grau de diversão = " + seekEscala.getProgress());

    }


}

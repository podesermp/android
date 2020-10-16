package com.ufc.ec.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

   // private Button buttonPlay, buttonPause, buttonStop;
    private SeekBar seekVolume;
    private MediaPlayer mediaplayer;
    private AudioManager audioManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaplayer = MediaPlayer.create(getApplicationContext(), R.raw.teste);
        inicializarSeekBar();
    }


    private void inicializarSeekBar(){
        seekVolume = findViewById(R.id.seekVolume);

        // Configura o audio mananger
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        //recupera os valor de máximo e volume atual
        int volumeMaximo = audioManager.getStreamMaxVolume( audioManager.STREAM_MUSIC);
        int volumeAtual = audioManager.getStreamVolume( audioManager.STREAM_MUSIC);

        //Configura o volume máximo da seekBar
        seekVolume.setMax( volumeMaximo );
        seekVolume.setProgress( volumeAtual );

        seekVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume( AudioManager.STREAM_MUSIC, progress, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void executarSom(View view){

        if(mediaplayer != null ){
            mediaplayer.start();
        }

    }

    public void pausarSom(View view){

        if(mediaplayer.isPlaying()){
            mediaplayer.pause();
        }
    }

    public  void pararSom(View view){
        mediaplayer.stop();
        mediaplayer = MediaPlayer.create( getApplicationContext(), R.raw.teste);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if( mediaplayer != null && mediaplayer.isPlaying() ){
            mediaplayer.stop();
            mediaplayer.release();
            mediaplayer = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        if(mediaplayer.isPlaying()){
            mediaplayer.pause();
        }
    }
}

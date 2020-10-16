package com.ufc.ec.midiavideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);

        getSupportActionBar().hide();

        View decorView = getWindow().getDecorView();
        int ioOptions = View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        decorView.setSystemUiVisibility(ioOptions);


        videoView.setMediaController( new MediaController(this));
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video );
        videoView.start();

    }
}

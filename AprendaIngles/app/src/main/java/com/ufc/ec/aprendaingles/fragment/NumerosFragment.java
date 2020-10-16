package com.ufc.ec.aprendaingles.fragment;


import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.ufc.ec.aprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumerosFragment extends Fragment implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private ImageView imageUm, imageDois, imageTres, imageQuatro, imageCinco, imageSeis;

    public NumerosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        imageUm = view.findViewById(R.id.imageUm);
        imageDois = view.findViewById(R.id.imageDois);
        imageTres = view.findViewById(R.id.imageTres);
        imageQuatro = view.findViewById(R.id.imageQuatro);
        imageCinco = view.findViewById(R.id.imageCinco);
        imageSeis = view.findViewById(R.id.imageSeis);

        imageUm.setOnClickListener(this);
        imageDois.setOnClickListener(this);
        imageTres.setOnClickListener(this);
        imageQuatro.setOnClickListener(this);
        imageCinco.setOnClickListener(this);
        imageSeis.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.imageUm:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.one);
                tocarSom();
                break;

            case R.id.imageDois:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.two);
                tocarSom();
                break;

            case R.id.imageTres:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.three);
                tocarSom();
                break;

            case R.id.imageQuatro:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.four);
                tocarSom();
                break;

            case R.id.imageCinco:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.five);
                tocarSom();
                break;

            case R.id.imageSeis:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.six);
                tocarSom();
                break;
        }

    }

    public void tocarSom(){
        if(mediaPlayer != null){
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}

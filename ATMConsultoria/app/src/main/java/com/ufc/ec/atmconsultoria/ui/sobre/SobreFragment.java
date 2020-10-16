package com.ufc.ec.atmconsultoria.ui.sobre;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ufc.ec.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {


    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //return inflater.inflate(R.layout.fragment_sobre, container, false);

        String descricao = "ATM Consultoria tem como missão apoiar organizações que" +
                " desejam alcançar  o sucesso através da excelência em gestão e de busca pela qualidade.";

        Element versao = new Element();
        versao.setTitle( "Versão 1.0" );

        return new AboutPage( getActivity() )
                .setImage(R.drawable.logo)
                .setDescription(descricao)

                .addGroup("Entre em contato")
                .addEmail("soueump12@gmail.com", "Envie um email")
                .addWebsite("www.google.com", "Acesse nosso site")

                .addGroup("Redes sociais")
                .addFacebook("marcospaulo.rocharodrigues", "Facebook")
                .addInstagram("podesermp", "Instagram")
                .addTwitter("podesermp", "Twitter")
                .addGitHub("podesermp", "GitHub")
                .addPlayStore("com.google.android.apps.plus", "Download App")


                .addItem( versao )

                .create();

    }

}

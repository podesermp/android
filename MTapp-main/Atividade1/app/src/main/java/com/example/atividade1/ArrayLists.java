package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLists extends AppCompatActivity {

  Button btn_add;
  EditText editText;
  ListView lv_listofnames;

  List<String>Video_Game = new ArrayList<String>();
  String[] startingList = {"Ps2","Ps3","Xbox","Xbox One"};

  ArrayAdapter tes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        btn_add = findViewById(R.id.btn_add);
        editText = findViewById(R.id.edit_text);
       lv_listofnames = findViewById(R.id.lv_listofnames);

       Video_Game = new ArrayList<String>(Arrays.asList(startingList));
        tes = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 , Video_Game);
        lv_listofnames.setAdapter(tes);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newName = editText.getText().toString();
                Video_Game.add(newName);
                Collections.sort(Video_Game);
                tes.notifyDataSetChanged();
            }
        });

        lv_listofnames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ArrayLists.this, Video_Game.get(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
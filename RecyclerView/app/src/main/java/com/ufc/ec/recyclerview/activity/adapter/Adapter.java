package com.ufc.ec.recyclerview.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ufc.ec.recyclerview.R;
import com.ufc.ec.recyclerview.activity.model.Bairro;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Bairro> listaBairros;

    public Adapter(List<Bairro> lista) {
        this.listaBairros = lista;

    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_list, parent, false);


        return new MyViewHolder(itemLista);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Bairro bairro = listaBairros.get(   position   );

        holder.bairro.setText(bairro.getNomeBairro());
        holder.cod.setText(bairro.getId());
        holder.populacao.setText(bairro.getPopulacao());

    }

    @Override
    public int getItemCount() {
        return listaBairros.size(); //quantidade de elementos da lista que aparecem
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView bairro, cod, populacao;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            bairro = itemView.findViewById(R.id.textBairro);
            cod = itemView.findViewById(R.id.textId);
            populacao = itemView.findViewById(R.id.textPopulacao);

        }
    }
}

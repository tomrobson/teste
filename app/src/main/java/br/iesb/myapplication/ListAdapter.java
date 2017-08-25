package br.iesb.myapplication;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.ListViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder>{

    private Context context;
    private ArrayList<Contato> modelo;

    public ListAdapter (Context context, ArrayList<Contato> modelo){
        this.context = context;
        this.modelo = modelo;
    }

    private ListAdapter (Context context) { this.context = context; }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);

        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        Contato c = modelo.get(position);
        holder.nome.setText(c.getNome());
        holder.descricao.setText(c.getDescricao());
    }

    @Override
    public int getItemCount() {
        return modelo.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        public ImageView avatar;
        public TextView nome;
        public TextView descricao;

        public ListViewHolder(View v){
            super(v);

            avatar = v.findViewById(R.id.imagem);
            nome = v.findViewById(R.id.nome);
            descricao = v.findViewById(R.id.descricao);
        }
    }
}

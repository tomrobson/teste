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

public class ListAdapter extends RecyclerView.Adapter{

    private Context context;

    private ListAdapter (Context context) { this.context = context; }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);

        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        public ImageView avatar;
        public TextView nome;
        public TextView descricao;

        public ListViewHolder(View v){
            super(v);

            avatar = v.findViewById(R.id.image);
            nome = v.findViewById(R.id.nome);
            descricao = v.findViewById(R.id.descricao);
        }
    }
}

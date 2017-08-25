package br.iesb.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private RecyclerView lista;

    private ArrayList<Contato> model = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Contato c1 = new Contato();
        c1.setNome("Joao");
        c1.setDescricao("teste de descricao");
        model.add(c1);

        Contato c2 = new Contato();
        c2.setNome("Maria");
        c2.setDescricao("teste");
        model.add(c2);

        ListAdapter adaptador = new ListAdapter(this, model);

        lista = (RecyclerView) findViewById(R.id.lista);
        lista.setItemAnimator(new DefaultItemAnimator());
        lista.setLayoutManager(new LinearLayoutManager(this));
        lista.setAdapter(adaptador);
    }
}

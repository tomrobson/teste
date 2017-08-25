package br.iesb.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarMensagem(View paramentro) {
        Toast.makeText(this, "Teste de texto Toast!", Toast.LENGTH_LONG).show();
    }

    public void chamarTelaLista(View parametro) {
        Intent it = new Intent(this, ListActivity.class);
        startActivity(it);
    }
}

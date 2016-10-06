package com.example.ifpb.listar_cadastrar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ifpb.listar_cadastrar.asynctask.ListaAsynTask;

import java.util.concurrent.ExecutionException;

/**
 * Created on IFPB by SarahCC.
 */
public class ListaActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        ListView list = (ListView) findViewById(R.id.listalv);
        ListaAsynTask listPessoa = new ListaAsynTask();

        try {

            ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(this, android.R.layout.simple_list_item_1, listPessoa.execute("http://ladoss.info:8773/Convite_SERVICE/convidado/listar").get());
            list.setAdapter(adapter);

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

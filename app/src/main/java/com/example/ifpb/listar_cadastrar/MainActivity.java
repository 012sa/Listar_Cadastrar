package com.example.ifpb.listar_cadastrar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.example.ifpb.listar_cadastrar.listeners.TelaCadastroListener;
import com.example.ifpb.listar_cadastrar.listeners.TelaListaListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cadastrobt = (Button) findViewById(R.id.cadastrobt);
        Button listabt = (Button) findViewById(R.id.listabt);

        cadastrobt.setOnClickListener(new TelaCadastroListener(this));
        listabt.setOnClickListener(new TelaListaListener(this));
    }

}
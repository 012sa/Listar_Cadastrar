package com.example.ifpb.listar_cadastrar.listeners;

import android.content.Intent;
import android.view.View;

import com.example.ifpb.listar_cadastrar.ListaActivity;
import com.example.ifpb.listar_cadastrar.MainActivity;

/**
 * Created on IFPB by SarahCC.
 */
public class TelaListaListener implements View.OnClickListener{
    MainActivity main;

    public TelaListaListener(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this.main,ListaActivity.class);
        this.main.startActivity(intent);
    }
}

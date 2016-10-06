package com.example.ifpb.listar_cadastrar.listeners;

import android.content.Intent;
import android.view.View;

import com.example.ifpb.listar_cadastrar.CadastroActivity;
import com.example.ifpb.listar_cadastrar.MainActivity;

/**
 * Created on IFPB by SarahCC.
 */
public class TelaCadastroListener implements View.OnClickListener {
    MainActivity main;

    public TelaCadastroListener(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this.main,CadastroActivity.class);
        this.main.startActivity(intent);

    }
}

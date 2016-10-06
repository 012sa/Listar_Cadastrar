package com.example.ifpb.listar_cadastrar.listeners;

import android.view.View;
import android.widget.Toast;

import com.example.ifpb.listar_cadastrar.CadastroActivity;
import com.example.ifpb.listar_cadastrar.asynctask.CadastroAsyncTask;

import java.util.concurrent.ExecutionException;

/**
 * Created on IFPB by SarahCC.
 */
public class CadastroListener implements View.OnClickListener{
    private CadastroActivity activity;

    public CadastroListener(CadastroActivity activity){
        this.activity = activity;
    }

    @Override
    public void onClick(View v) {
        CadastroAsyncTask c = new CadastroAsyncTask();

        try {
            String msg = c.execute(activity.getPessoa()).get();
            Toast toast = Toast.makeText(activity, msg, Toast.LENGTH_SHORT);
            activity.limparCampo();

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}


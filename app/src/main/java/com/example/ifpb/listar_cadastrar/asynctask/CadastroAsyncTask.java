package com.example.ifpb.listar_cadastrar.asynctask;


import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.example.ifpb.listar_cadastrar.Pessoa;

/**
 * Created on IFPB by SarahCC.
 */
public class CadastroAsyncTask extends AsyncTask<Pessoa,Void,String> {
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(Pessoa... pessoas) {
        String msg = "";

        try {

            Gson gson = new Gson();
            String pessoa = gson.toJson(pessoas[0]);

            URL url = new URL("http://ladoss.info:8773/Convite_SERVICE/convidado/cadastrar");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setRequestProperty("Content-Type", "application/json");
            urlConnection.connect();

            DataOutputStream data = new DataOutputStream(urlConnection.getOutputStream());

            data.writeBytes(pessoa);
            data.close();

            if(urlConnection.getResponseCode() == 200){
                msg= "Ok";
            }else{
                msg = "Erro! algo está errado";
            }

            urlConnection.disconnect();

        } catch (IOException e) {
            Log.e("Erro: ", e.getMessage());
        } finally {
            return msg;
        }
    }

    @Override
    protected void onPostExecute(String result){
        super.onPostExecute(result);
    }
}

package com.example.ifpb.listar_cadastrar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import com.example.ifpb.listar_cadastrar.listeners.CadastroListener;
/**
 * Created on IFPB by SarahCC.
 */
public class CadastroActivity extends Activity{
    private EditText Nomeet;
    private EditText Endet;
    private EditText Emailet;
    private EditText CPFet ;

    private Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Nomeet = (EditText) findViewById(R.id.Nomeet);
        Endet = (EditText) findViewById(R.id.Endet);
        Emailet = (EditText) findViewById(R.id.Emailet);
        CPFet = (EditText) findViewById(R.id.CPFet);



        Button cadastrar = (Button) findViewById(R.id.cadastrar);
        cadastrar.setOnClickListener(new CadastroListener(this));
    }

    public Pessoa getPessoa(){
        pessoa = new Pessoa(Nomeet.getText().toString(), Emailet.getText().toString(),Endet.getText().toString(),CPFet.getText().toString());
        return this.pessoa;
    }

    public void setPessoa(Pessoa p){
        this.pessoa = p;
    }

    public void limparCampo(){
        this.Nomeet.setText("");
        this.Endet.setText("");
        this.Emailet.setText("");
        this.CPFet.setText("");
    }
}

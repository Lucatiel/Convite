package com.example.ifpb.recuperacaorhavy4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IFPB on 13/04/2016.
 */
public class nomeBusca  extends Activity implements TextWatcher,BuscarPessoaCallBack{

    private EditText nomeBusca;

    List<Pessoa> pessoas;
    PessoasCustomAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nome_busca);

        nomeBusca = (EditText) findViewById(R.id.nomeBuscaText);
        nomeBusca.addTextChangedListener(this);

        ListView nomesListView = (ListView) findViewById(R.id.nomesListView);
        pessoas = new ArrayList<Pessoa>();
        adapter = new PessoasCustomAdapter(this, pessoas);

        // Adapter modificado.
        nomesListView.setAdapter(adapter);


    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

        Log.i("EditTextListener", "beforeTextChanged: " + charSequence);
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int start, int before, int count) {

        Log.i("EditTextListener", "onTextChanged: " + charSequence);
        String nome = charSequence.toString();

        if (nome.length() >= 4) {

            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);

            BuscarNomeGetAsyncTask buscarNomeAsyncTask = new BuscarNomeGetAsyncTask(this);
            buscarNomeAsyncTask.execute(pessoa);
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {

        Log.i("EditTextListener","afterTextChanged: " + editable);
    }

    @Override
    public void backBuscarNome(List<Pessoa> names) {
        this.pessoas.clear();
        this.pessoas.addAll(names);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void errorBuscarNome(String error) {

    }
}

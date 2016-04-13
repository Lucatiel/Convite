package com.example.ifpb.recuperacaorhavy4.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ifpb.recuperacaorhavy4.R;

/**
 * Created by IFPB on 13/04/2016.
 */
public class qrCodeBusca extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr_code_busca);

        TextView conteudo = (TextView) findViewById(R.id.seuNomeText);
        Intent intent = getIntent();
        conteudo.setText(( (String) intent.getSerializableExtra("<---conteudo Lido--->")));

        findViewById(R.id.homeButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(qrCodeBusca.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

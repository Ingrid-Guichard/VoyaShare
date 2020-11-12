package com.example.iguichar.voyashare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class PageAccueil extends AppCompatActivity {
    private Button recherchertrajet;
    private Button proposertrajet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_accueil);

        this.recherchertrajet = (Button)findViewById(R.id.recherchertrajet);
        recherchertrajet.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent RechercherTrajet = new Intent(getApplicationContext(), RechercherTrajet.class);
                startActivity (RechercherTrajet);
                finish();
    });
}
        this.proposertrajet = (Button)findViewById(R.id.proposertrajet);
        proposertrajet.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent ProposerTrajet = new Intent(getApplicationContext(), ProposerTrajet.class);
                startActivity(ProposerTrajet);
                finish();
            });
        }
    }
}
package com.example.iguichar.voyashare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageGarde extends AppCompatActivity {
    private Button inscription;
    private Button connexion;
    private Button recherchetrajet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_garde);
        this.inscription = (Button) findViewById(R.id.inscription);
        inscription.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent Inscription = new Intent(getApplicationContext(), Inscription.class);
                startActivity(Inscription);
                finish();
            }
        });

        this.connexion = (Button) findViewById(R.id.connexion);
        inscription.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent PageConnexion = new Intent(getApplicationContext(), Pageconnexion.class);
                startActivity(PageConnexion);
                finish();
            }

        });
        this.recherchetrajet = (Button) findViewById(R.id.recherchetrajet);
        recherchetrajet.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent PageRechercheTrajet = new Intent(getApplicationContext(), RechercherTrajet.class);
                startActivity(PageRechercheTrajet);
                finish();
            }
        });
    }
}



package com.example.iguichar.voyashare;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class Inscription extends AppCompatActivity {
    private EditText txtPrenom;
    private EditText txtNom;
    private EditText txtAge;
    private EditText txtmdp;
    private Button btnContinuer;
    SQLiteDatabase maBase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        this.txtPrenom = (EditText)findViewById(R.id.txtPrenom);
        this.txtNom = (EditText)findViewById(R.id.txtNom);
        this.txtAge = (EditText)findViewById(R.id.txtAge);
        this.txtmdp = (EditText)findViewById(R.id.txtmdp);

        //rajouter une requete de lecture avec un if qui dit d'inserer les données que si ça existe pas déjà
        maBase.execSQL("INSERT INTO utilisateur (prenom,nom,email,password) VALUES (txtPrnom,txtNom,txtAge, Txtmdp);");

        this.btnContinuer = (Button)findViewById(R.id.btnContinuer);
        btnContinuer.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent PageAccueil = new Intent(getApplicationContext(), PageAccueil.class);
                startActivity (PageAccueil);
                finish();

            }

        });


    }
}



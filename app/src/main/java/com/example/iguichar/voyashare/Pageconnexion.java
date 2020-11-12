package com.example.iguichar.voyashare;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Pageconnexion extends AppCompatActivity {
    SQLiteDatabase maBase;
    private Button connexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageconnexion);

        this.connexion = (Button) findViewById(R.id.connexion);
        connexion.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {


                // on recupere l'email entré
                EditText mail = (EditText) findViewById(R.id.mail);
                String email = mail.getText().toString();
                // on récupère le mot de passe entré
                EditText mdp = (EditText) findViewById(R.id.mdp);
                String password = mdp.getText().toString();



                final ArrayAdapter<String> arrayAdapter;
                final ArrayList<String> results = new ArrayList<String>();
                try {
                    //on consulte la base de données en fonction de l'email et l'utilisateur
                    Cursor c = maBase.rawQuery("SELECT * FROM  utilisateur WHERE email='"+email+"' AND password='"+password+"';", null);
                    if (c.getCount() > 0) {
                        //si il existe au moins une ligne avec ces identifiants alors on accepte l'identification
                        //TextView message = (TextView) findViewById(R.id.message); //affiche message
                        //message.setText("Authentification OK");
                        Intent PageAccueil = new Intent(getApplicationContext(), PageAccueil.class);
                        startActivity (PageAccueil);
                        finish();

                    } else {
                        TextView message = (TextView) findViewById(R.id.message);
                        message.setText("Identifiants erronés");
                    }
                } catch (SQLiteException se) {
                    Log.e("rawQuery", "Could not create or Open the database");
                }


            }
        });

            }

        }



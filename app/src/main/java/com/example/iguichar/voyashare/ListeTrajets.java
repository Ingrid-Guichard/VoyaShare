package com.example.iguichar.voyashare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListeTrajets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_trajets);


        //faire une requete lecture (select) qui chercher dans la BDD tous les trajets correspondant à un ou plusieurs critères et qui sont dispo
        //faire un if select dispo from voyage where dispo = "oui"
    }
}

package com.example.iguichar.voyashare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RechercherTrajet extends AppCompatActivity {

    private TextView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche__trajet);

        this.button= (TextView)  findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ListeTrajets= new Intent(getApplicationContext(), ListeTrajets.class);
                startActivity(ListeTrajets);
                finish();
            }
        });

    }
}



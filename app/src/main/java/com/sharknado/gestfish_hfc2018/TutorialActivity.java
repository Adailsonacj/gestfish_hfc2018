package com.sharknado.gestfish_hfc2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class TutorialActivity extends AppCompatActivity {

    Button buttonIntesivo;
    Button buttonSemi_intensivo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        buttonIntesivo = findViewById(R.id.buttonIntensivo);
        buttonSemi_intensivo = findViewById(R.id.buttonSemi_Intensivo);

        buttonIntesivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TutorialActivity.this,IntesivoTutorialActivity.class);
                startActivity(intent);
            }
        });

        buttonSemi_intensivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TutorialActivity.this,semi_IntensivoTutorial.class);
                startActivity(intent);

            }
        });

    }
}

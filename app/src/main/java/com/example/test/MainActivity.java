package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button envoyer = null;
    Button reset = null;
    EditText taille = null;
    EditText poids = null;
    CheckBox commentaire = null;
    RadioGroup group = null;
    TextView result = null;

    private final String texteInit = "Cliquez sur le bouton « Calculer l'IMC » pour obtenir un résultat.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Composants
        Button envoyer = (Button) findViewById(R.id.calcul);
        Button reset = (Button) findViewById(R.id.reset);
        EditText taille = (EditText) findViewById(R.id.taille);
        EditText poids = (EditText) findViewById(R.id.poids);
        CheckBox commentaire = (CheckBox) findViewById(R.id.commentaire);
        RadioGroup group = (RadioGroup) findViewById(R.id.group);
        TextView result = (TextView) findViewById(R.id.result);
    }
}

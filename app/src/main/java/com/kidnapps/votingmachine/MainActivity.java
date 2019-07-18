package com.kidnapps.votingmachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button votarButton;
    private Button resultadosButton;
    private Button configButton;
    private ImageView logoImage;

    private final static int TOAST_LONGO = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        votarButton = findViewById(R.id.voteButton);
        resultadosButton = findViewById(R.id.resultsButton);
        configButton = findViewById(R.id.settingButton);
        logoImage = findViewById(R.id.logoVoto);

        votarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this , VoteActivity.class));
                //Toast.makeText(getApplicationContext(), "Tela de Voto", Toast.LENGTH_LONG).show();

            }
        });

        resultadosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Não há resultados", Toast.LENGTH_LONG).show();

            }
        });

        configButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Tela de Configuração", Toast.LENGTH_LONG).show();


            }
        });



    }
}

package com.kidnapps.votingmachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VoteActivity extends AppCompatActivity {


    private Button keyOne;
    private Button keyTwo;
    private Button keyThree;
    private Button keyFour;
    private Button keyFive;
    private Button keySix;
    private Button keySeven;
    private Button keyEight;
    private Button keyNine;
    private Button keyZero;
    private Button keyCorr;
    private Button keyConf;
    private Button keyBranco;

    private EditText digi1;
    private EditText digi2;
    private EditText digi3;
    private EditText digi4;
    private EditText digi5;

    private TextView cargo;
    private int roleVal;
    private int cargoIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.candidate_layout);

        keyOne = findViewById(R.id.oneKey);
        keyTwo = findViewById(R.id.twoKey);
        keyThree = findViewById(R.id.threeKey);
        keyFour = findViewById(R.id.fourKey);
        keyFive = findViewById(R.id.fiveKey);
        keySix = findViewById(R.id.sixKey);
        keySeven = findViewById(R.id.sevenKey);
        keyEight = findViewById(R.id.eightKey);
        keyNine = findViewById(R.id.nineKey);
        keyZero = findViewById(R.id.zeroKey);
        keyConf = findViewById(R.id.confirmaKey);
        keyCorr = findViewById(R.id.corrigirKey);
        keyBranco = findViewById(R.id.brancoKey);

        digi1 = findViewById(R.id.viewOne);
        digi2 = findViewById(R.id.viewTwo);
        digi3 = findViewById(R.id.viewThree);
        digi4 = findViewById(R.id.viewFour);
        digi5 = findViewById(R.id.viewFive);

        cargo = findViewById(R.id.cargoTitulo);

        final TextView digitos[] = {digi1,digi2,digi3,digi4,digi5};

        final String valores[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};


        final String[] cargosPol = {
                "PRESIDENTE",
                "GOVERNADOR",
                "SENADOR",
                "DEPUTADO ESTADUAL",
                "DEPUTADO FEDERAL"
        };

        cargo.setText(cargosPol[cargoIndex]);


        switch (cargoIndex){
            case 0:
                roleVal = 2;
                digi1.setVisibility(EditText.VISIBLE);
                digi2.setVisibility(EditText.VISIBLE);
                digi3.setVisibility(EditText.INVISIBLE);
                digi4.setVisibility(EditText.INVISIBLE);
                digi5.setVisibility(EditText.INVISIBLE);
                break;
            case 1:
                roleVal = 2;
                digi1.setVisibility(EditText.VISIBLE);
                digi2.setVisibility(EditText.VISIBLE);
                digi3.setVisibility(EditText.INVISIBLE);
                digi4.setVisibility(EditText.INVISIBLE);
                digi5.setVisibility(EditText.INVISIBLE);
                break;
            case 2:
                roleVal = 3;
                digi1.setVisibility(EditText.VISIBLE);
                digi2.setVisibility(EditText.VISIBLE);
                digi3.setVisibility(EditText.VISIBLE);
                digi4.setVisibility(EditText.INVISIBLE);
                digi5.setVisibility(EditText.INVISIBLE);
                break;
            case 3:
                roleVal = 4;
                digi1.setVisibility(View.VISIBLE);
                digi2.setVisibility(View.VISIBLE);
                digi3.setVisibility(View.VISIBLE);
                digi4.setVisibility(View.VISIBLE);
                digi5.setVisibility(View.INVISIBLE);
                break;
            case 4:
                roleVal = 5;
                digi1.setVisibility(View.VISIBLE);
                digi2.setVisibility(View.VISIBLE);
                digi3.setVisibility(View.VISIBLE);
                digi4.setVisibility(View.VISIBLE);
                digi5.setVisibility(View.VISIBLE);
                break;
        }

        keyOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                for(int i = 0; i< roleVal; i++){

                    for (int j = 0; j>digitos.length; j++){

                        if(digitos[i].getText() !=  valores[j]){
                            digitos[i].setText("1");
                        }
                    }

                }

                cargoIndex++;
            }
        });

        keyTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                cargo.setText(cargosPol[1]);
                digi1.setVisibility(View.VISIBLE);
                digi2.setVisibility(View.VISIBLE);
                digi3.setVisibility(View.INVISIBLE);
                digi4.setVisibility(View.INVISIBLE);
                digi5.setVisibility(View.INVISIBLE);
                */

            }
        });

        keyThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                cargo.setText(cargosPol[2]);
                digi1.setVisibility(View.VISIBLE);
                digi2.setVisibility(View.VISIBLE);
                digi3.setVisibility(View.VISIBLE);
                digi4.setVisibility(View.INVISIBLE);
                digi5.setVisibility(View.INVISIBLE);
                */

            }
        });

        keyFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                cargo.setText(cargosPol[3]);
                digi1.setVisibility(View.VISIBLE);
                digi2.setVisibility(View.VISIBLE);
                digi3.setVisibility(View.VISIBLE);
                digi4.setVisibility(View.VISIBLE);
                digi5.setVisibility(View.INVISIBLE);
                */
            }
        });

        keyFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                cargo.setText(cargosPol[4]);
                digi1.setVisibility(View.VISIBLE);
                digi2.setVisibility(View.VISIBLE);
                digi3.setVisibility(View.VISIBLE);
                digi4.setVisibility(View.VISIBLE);
                digi5.setVisibility(View.VISIBLE);
                */

            }
        });

        keySix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        keySeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        keyEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        keyNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        keyZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        keyCorr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cargoIndex--;

                switch (cargoIndex){
                    case 0:
                        cargo.setText(cargosPol[cargoIndex]);
                        digi1.setVisibility(View.VISIBLE);
                        digi2.setVisibility(View.VISIBLE);
                        digi3.setVisibility(View.INVISIBLE);
                        digi4.setVisibility(View.INVISIBLE);
                        digi5.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        cargo.setText(cargosPol[cargoIndex]);
                        digi1.setVisibility(View.VISIBLE);
                        digi2.setVisibility(View.VISIBLE);
                        digi3.setVisibility(View.INVISIBLE);
                        digi4.setVisibility(View.INVISIBLE);
                        digi5.setVisibility(View.INVISIBLE);
                        break;

                    case 2:
                        cargo.setText(cargosPol[cargoIndex]);
                        digi1.setVisibility(View.VISIBLE);
                        digi2.setVisibility(View.VISIBLE);
                        digi3.setVisibility(View.VISIBLE);
                        digi4.setVisibility(View.INVISIBLE);
                        digi5.setVisibility(View.INVISIBLE);
                        break;

                    case 3:
                        cargo.setText(cargosPol[cargoIndex]);
                        digi1.setVisibility(View.VISIBLE);
                        digi2.setVisibility(View.VISIBLE);
                        digi3.setVisibility(View.VISIBLE);
                        digi4.setVisibility(View.VISIBLE);
                        digi5.setVisibility(View.INVISIBLE);
                        break;

                    case 4:
                        cargo.setText(cargosPol[cargoIndex]);
                        digi1.setVisibility(View.VISIBLE);
                        digi2.setVisibility(View.VISIBLE);
                        digi3.setVisibility(View.VISIBLE);
                        digi4.setVisibility(View.VISIBLE);
                        digi5.setVisibility(View.VISIBLE);
                        break;
                }


            }
        });

        keyConf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cargoIndex++;
                switch (cargoIndex){
                    case 0:
                        cargo.setText(cargosPol[cargoIndex]);
                        digi1.setVisibility(View.VISIBLE);
                        digi2.setVisibility(View.VISIBLE);
                        digi3.setVisibility(View.INVISIBLE);
                        digi4.setVisibility(View.INVISIBLE);
                        digi5.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        cargo.setText(cargosPol[cargoIndex]);
                        digi1.setVisibility(View.VISIBLE);
                        digi2.setVisibility(View.VISIBLE);
                        digi3.setVisibility(View.INVISIBLE);
                        digi4.setVisibility(View.INVISIBLE);
                        digi5.setVisibility(View.INVISIBLE);
                        break;

                    case 2:
                        cargo.setText(cargosPol[cargoIndex]);
                        digi1.setVisibility(View.VISIBLE);
                        digi2.setVisibility(View.VISIBLE);
                        digi3.setVisibility(View.VISIBLE);
                        digi4.setVisibility(View.INVISIBLE);
                        digi5.setVisibility(View.INVISIBLE);
                        break;

                    case 3:
                        cargo.setText(cargosPol[cargoIndex]);
                        digi1.setVisibility(View.VISIBLE);
                        digi2.setVisibility(View.VISIBLE);
                        digi3.setVisibility(View.VISIBLE);
                        digi4.setVisibility(View.VISIBLE);
                        digi5.setVisibility(View.INVISIBLE);
                        break;

                    case 4:
                        cargo.setText(cargosPol[cargoIndex]);
                        digi1.setVisibility(View.VISIBLE);
                        digi2.setVisibility(View.VISIBLE);
                        digi3.setVisibility(View.VISIBLE);
                        digi4.setVisibility(View.VISIBLE);
                        digi5.setVisibility(View.VISIBLE);
                        break;
                }


            }
        });

        keyBranco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}

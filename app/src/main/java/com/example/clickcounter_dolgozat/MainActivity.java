package com.example.clickcounter_dolgozat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button ButtonHozzaad;
    private Button ButtonKivon;
    private TextView Kimenet;
    private int Szam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        ButtonHozzaad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Szam  += 1;
                Kimenet.setText(String.valueOf(Szam));
                if (Szam > 0){

                    Kimenet.setTextColor(Color.rgb(13,239,81));

                }
                else if(Szam<0){

                    Kimenet.setTextColor(Color.rgb(239,13,13));

                }
                else {

                    Kimenet.setTextColor(Color.rgb(13,13,239));

                }


            }
        });





        ButtonKivon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Szam  -= 1;
                Kimenet.setText(String.valueOf(Szam));

                if (Szam > 0){

                    Kimenet.setTextColor(Color.rgb(13,239,81));

                }
                else if(Szam<0){

                    Kimenet.setTextColor(Color.rgb(239,13,13));

                }
                else {

                    Kimenet.setTextColor(Color.rgb(13,13,239));

                }

            }
        });


    }

    public void init(){


        ButtonHozzaad= findViewById(R.id.ButtonPlus);
        ButtonKivon= findViewById(R.id.ButtonMinus);
        Kimenet= findViewById(R.id.TextViewOutput);
        Szam = 0;



    }

}
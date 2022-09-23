package com.example.clickcounter_dolgozat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button ButtonHozzaad;
    private Button ButtonKivon;
    private TextView Kimenet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        ButtonHozzaad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String Szam = String.valueOf(Kimenet);
                Szam  += 1;
                Kimenet.setText(Szam);



            }
        });


    }

    public void init(){


        ButtonHozzaad= findViewById(R.id.ButtonPlus);
        ButtonKivon= findViewById(R.id.ButtonMinus);
        Kimenet= findViewById(R.id.TextViewOutput);



    }

}
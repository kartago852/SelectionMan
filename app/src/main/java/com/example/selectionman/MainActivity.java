package com.example.selectionman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int mate = 5;
        int quimi = 5;
        int fisica = 5;
        int promedio = 0;

        promedio = (mate + quimi + fisica) /3;

        if(promedio <= 6){
            Toast.makeText(this, "Aprobado", Toast.LENGTH_SHORT).show();
        } else if(promedio <= 5){
            Toast.makeText(this, "Reprobado", Toast.LENGTH_SHORT).show();
        }
    }

}

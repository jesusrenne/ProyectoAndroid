package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Enlaces de una ventana a otra
    public void goToActivitySecond(View view){
        Intent newIntent2 = new Intent(this, SecondActivity.class);
        newIntent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        //Pasar parámetros entre actividades
        newIntent2.putExtra("msg","Hola");
        newIntent2.putExtra("year",2021);

        startActivity(newIntent2);

    }

    //Enlaces de una ventana a otra
    public void goToActivityThird(View view){
        Intent newIntent3 = new Intent(this, ThirdActivity.class);
        newIntent3.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(newIntent3);

    }
}
package com.example.ProyectoAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Enlaces de una ventana a otra y enviar parámetros
    public void goToActivitySecond(View view){
        Intent newIntent2 = new Intent(this, SecondActivity.class);
        newIntent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        //Pasar parámetros entre actividades
        newIntent2.putExtra("msg","Hola MinTIC");
        newIntent2.putExtra("year",2021);
        startActivity(newIntent2);

    }
    //Hacer que aparezca el menú en pantalla
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return  true;
    }

    //Método para ir a la pantalla de la actividad2 utilizando el Menú Bar
    public boolean onOptionsItemSelected(MenuItem menuItem){
        int id = menuItem.getItemId();
        if(id == R.id.mnusecondActivity){
            Intent newIntent2 = new Intent(this, SecondActivity.class);
            newIntent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            //Pasar parámetros entre actividades
            newIntent2.putExtra("msg","Hola MinTIC");
            newIntent2.putExtra("year",2021);
            startActivity(newIntent2);
        }
        else if(id==R.id.mnuthirdActivity){
            Intent newIntent = new Intent(this, ThirdActivity.class);

            startActivity(newIntent);

        }
        return super.onOptionsItemSelected(menuItem);

    }




    //Enlaces de una ventana a otra
    public void goToActivityThird(View view){
        Intent newIntent3 = new Intent(this, ThirdActivity.class);
        newIntent3.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(newIntent3);

    }
}
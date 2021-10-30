package com.example.ProyectoAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //Crear la barra para el menú
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Llamar al método que recibe los parámetros
        getParametros();
    }
    //Método para destruir la aplicación
    public void onBackPressed(){
        finish();

    }
    //Método para crear las opciones en el menú
    public boolean onOptionsItemSelected(MenuItem menuItem){
        int id = menuItem.getItemId();
        if(id == android.R.id.home){
            onBackPressed();
            return  true;
        }
        return super.onOptionsItemSelected(menuItem);

    }

    //Crear un nuevo método para recibir los parámetros
    public  void getParametros() {
        Bundle extras = getIntent().getExtras();
        String msg = extras.getString("msg");
        int year = extras.getInt("year");
        Toast.makeText(this,msg +" " + year,Toast.LENGTH_SHORT).show();



    }
    //Enlaces de una actividad a otra
    public void goToActivityMain(View view){
        Intent newIntent = new Intent(this, MainActivity.class);
        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(newIntent);

    }
}
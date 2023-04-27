package com.aplicacion.agroorganico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CalendarioLunar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_lunar);
    }
    public void Octubre(View view){
        Intent actividades = new Intent(this, Octubre.class);
        startActivity(actividades);
    }
    public void Noviembre(View view){
        Intent actividades = new Intent(this, Noviembre.class);
        startActivity(actividades);
    }
    public void Diciembre(View view){
        Intent actividades = new Intent(this, Diciembre.class);
        startActivity(actividades);
    }
    public void Enero(View view){
        Intent actividades = new Intent(this, Enero.class);
        startActivity(actividades);
    }
    public void Febrero(View view){
        Intent actividades = new Intent(this, Febrero.class);
        startActivity(actividades);
    }
    public void Marzo(View view){
        Intent actividades = new Intent(this, Marzo.class);
        startActivity(actividades);
    }
    public void Abril(View view){
        Intent actividades = new Intent(this, Abril.class);
        startActivity(actividades);
    }
    public void Mayo(View view){
        Intent actividades = new Intent(this, Mayo.class);
        startActivity(actividades);
    }
    public void Junio(View view){
        Intent actividades = new Intent(this, Junio.class);
        startActivity(actividades);
    }
    public void Julio(View view){
        Intent actividades = new Intent(this, Julio.class);
        startActivity(actividades);
    }
    public void Agosto(View view){
        Intent actividades = new Intent(this, Agosto.class);
        startActivity(actividades);
    }
    public void Septiembre(View view){
        Intent actividades = new Intent(this, Septiembre.class);
        startActivity(actividades);
    }
}
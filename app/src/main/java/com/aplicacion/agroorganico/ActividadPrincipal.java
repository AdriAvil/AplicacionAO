package com.aplicacion.agroorganico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActividadPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);
    }
    public void CalendarioLunar(View view){
        Intent actividades = new Intent(this, CalendarioLunar.class);
        startActivity(actividades);
    }
    public void FichaTecnica(View view){
        Intent actividades = new Intent(this, FichaTecnica.class);
        startActivity(actividades);
    }
}
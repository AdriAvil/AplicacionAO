package com.aplicacion.agroorganico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FichaTecnica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_tecnica);
    }
    public void Ferti(View view){
        Intent actividades = new Intent(this, FertiOrganMain.class);
        startActivity(actividades);
    }
    public void Triplex(View view){
        Intent actividades = new Intent(this, TriplexMain.class);
        startActivity(actividades);
    }
    public void GPlus(View view){
        Intent actividades = new Intent(this, GPlusMain.class);
        startActivity(actividades);
    }
    public void Nutri(View view){
        Intent actividades = new Intent(this, NutriFullMain.class);
        startActivity(actividades);
    }
    public void Complemento(View view){
        Intent actividades = new Intent(this, ComplementoMain.class);
        startActivity(actividades);
    }
    public void FullCacao(View view){
        Intent actividades = new Intent(this, FullCacaoMain.class);
        startActivity(actividades);
    }
    public void Humi(View view){
        Intent actividades = new Intent(this, HumiPKMain.class);
        startActivity(actividades);
    }
}
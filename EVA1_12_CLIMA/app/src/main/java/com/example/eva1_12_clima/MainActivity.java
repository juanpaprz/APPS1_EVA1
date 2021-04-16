package com.example.eva1_12_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lstVwClima;

    Clima aClimaCd[] = {
            new Clima(R.drawable.sunny, "Chihuahua", 28, "Despejado con viento"),
            new Clima(R.drawable.atmospher, "Delicias", 15, "Vientos huracanados"),
            new Clima(R.drawable.cloudy, "Camargo", 22.3, "Nublado con probabilidad de lluvia"),
            new Clima(R.drawable.light_rain, "Casas Grandes", 15, "Lluvia ligera"),
            new Clima(R.drawable.rainy, "Parral", 11, "Lluvioso con tormentas eléctricas"),
            new Clima(R.drawable.snow, "Cuauhtemoc", -3, "Nieve"),
            new Clima(R.drawable.thunderstorm, "Madera", 24, "Tormentas fuertes"),
            new Clima(R.drawable.tornado, "Guerrero", 17, "Run like hell"),
            new Clima(R.drawable.sunny, "Creel", 12, "A todo dar"),
            new Clima(R.drawable.light_rain, "Ahumada", 13, "Pal cafecito"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVwClima = findViewById(R.id.lstVwClima);
        lstVwClima.setAdapter(new ClimaAdaptador(this, R.layout.mi_lista_clima, aClimaCd));
    }
}
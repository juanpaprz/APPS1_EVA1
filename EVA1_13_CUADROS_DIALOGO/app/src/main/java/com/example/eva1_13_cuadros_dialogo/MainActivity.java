package com.example.eva1_13_cuadros_dialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCDSistema(View v){
        new AlertDialog.Builder(this)
                .setTitle("Cuadro de diálogo de Android")
                .setMessage("Hola mundo")
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Boton Ok", Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Boton No", Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNeutralButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Boton Cancel", Toast.LENGTH_SHORT).show();
                            }
                        })
                .show();
    }

    public void onClickCDCustom(View v){
        Dialog dlgMiCuadroDialogo = new Dialog(this);
        dlgMiCuadroDialogo.setContentView(R.layout.cuadro_dialogo);

        TextView txtVwTitulo;
        EditText edtTxtDatos;
        Button btnAccion;

        txtVwTitulo = dlgMiCuadroDialogo.findViewById(R.id.txtVwTitulo);
        edtTxtDatos = dlgMiCuadroDialogo.findViewById(R.id.edtTxtDatos);
        btnAccion = dlgMiCuadroDialogo.findViewById(R.id.btnAccion);

        txtVwTitulo.setText("ESTE ES UN CUADRO DE DIALOGO PERSONALIZADO");
        btnAccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), edtTxtDatos.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        dlgMiCuadroDialogo.show();
    }

}
package com.example.eva1_7_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdGrpComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdGrpComida = findViewById(R.id.rdGrpComida);

        rdGrpComida.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                /*switch (i){
                    case R.id.radioButton:
                        Toast.makeText(getApplicationContext(), "Montados", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(getApplicationContext(), "Burritos", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(getApplicationContext(), "Alitas", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton4:
                        Toast.makeText(getApplicationContext(), "Hamburguesas", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton5:
                        Toast.makeText(getApplicationContext(), "Boneless", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton6:
                        Toast.makeText(getApplicationContext(), "Sushi", Toast.LENGTH_SHORT).show();
                        break;

                }*/
                RadioButton rdBtnSel;
                rdBtnSel = findViewById(i);
                Toast.makeText(getApplicationContext(), rdBtnSel.getText(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
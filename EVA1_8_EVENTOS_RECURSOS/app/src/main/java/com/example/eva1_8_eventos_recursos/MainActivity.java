package com.example.eva1_8_eventos_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {


    TextView txtVwNom, txtVwApe;
    EditText edtTxtNom, edtTxtApe;
    RadioGroup rdGrpIdioma;
    RadioButton rdBtnEs, rdBtnIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVwNom = findViewById(R.id.txtVwNom);
        txtVwApe = findViewById(R.id.txtVwApe);
        edtTxtNom = findViewById(R.id.edtTxtNom);
        edtTxtApe = findViewById(R.id.edtTxtApe);
        rdGrpIdioma = findViewById(R.id.rdGrpIdioma);
        rdBtnEs = findViewById(R.id.rdBtnEs);
        rdBtnIn = findViewById(R.id.rdBtnIn);

        rdGrpIdioma.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId == R.id.rdBtnEs){
            txtVwNom.setText(R.string.txt_vw_nom);
            edtTxtNom.setHint(R.string.edt_txt_nom);
            txtVwApe.setText(R.string.txt_vw_ape);
            edtTxtApe.setHint(R.string.edt_txt_ape);
            rdBtnEs.setText(R.string.rd_btn_es);
            rdBtnIn.setText(R.string.rd_btn_in);
        } else {
            txtVwNom.setText(R.string.txt_vw_nom_en);
            edtTxtNom.setHint(R.string.edt_txt_nom_en);
            txtVwApe.setText(R.string.txt_vw_ape_en);
            edtTxtApe.setHint(R.string.edt_txt_ape_en);
            rdBtnEs.setText(R.string.rd_btn_es_en);
            rdBtnIn.setText(R.string.rd_btn_in_en);
        }
    }
}
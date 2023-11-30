package com.example.buoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText edtF, edtCel;
    Button btnFtoC, btnCtoF, btnClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCel = findViewById(R.id.edtCel);
        edtF = findViewById(R.id.edtF);
        btnFtoC = findViewById(R.id.btnFtoC);
        btnCtoF = findViewById(R.id.btnCtoF);
        btnClear = findViewById(R.id.bntClear);

        btnCtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("0.00");
                int C= Integer.parseInt(edtCel.getText().toString());
                Double F = C*1.8 + 32;
                edtF.setText(dcf.format(F)+"");
            }
        });
        btnFtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("0.00");
                int F= Integer.parseInt(edtF.getText().toString());
                Double C = (F-32)/1.8;
                edtCel.setText(dcf.format(C)+"");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCel.setText("");
                edtF.setText("");
            }
        });
    }
}
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    private EditText txtOperador;
    private Button btnButton0;
    private  Button btnButton1;
    private  Button btnButton2;
    private  Button btnButton3;
    private Button btnButton4;
    private  Button btnButton5;
    private  Button btnButton6;
    private  Button btnButton7;
    private Button btnButton8;
    private  Button btnButton9;
    private  Button btnButtonclear;
    private  Button btnButtonmas;
    private Button btnButtonmenos;
    private  Button btnButtondividir;
    private  Button btnButtonmultiplicar;
    private  Button btnButtonrestar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOperador = findViewById(R.id.txtOperacionesAritmeticas);
        txtOperador.setFocusable(true);

        btnButton0 = findViewById(R.id.btnNum0);
        btnButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Anterior = txtOperador.getText().toString();
                txtOperador.setText(Anterior + "0");
            }
        });

        btnButton1 = findViewById(R.id.btnNum1);
        btnButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Anterior = txtOperador.getText().toString();
                txtOperador.setText(Anterior + "1");
            }
        });

        btnButton2 = findViewById(R.id.btnNum2);
        btnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Anterior = txtOperador.getText().toString();
                txtOperador.setText(Anterior + "2");
            }
        });

        btnButton3 = findViewById(R.id.btnNum3);
        btnButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Anterior = txtOperador.getText().toString();
                txtOperador.setText(Anterior + "3");
            }
        });

        btnButton4 = findViewById(R.id.btnNum4);
        btnButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Anterior = txtOperador.getText().toString();
                txtOperador.setText(Anterior + "4");
            }
        });

        btnButton5 = findViewById(R.id.btnNum5);
        btnButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Anterior = txtOperador.getText().toString();
                txtOperador.setText(Anterior + "5");
            }
        });

        btnButton6 = findViewById(R.id.btnNum6);
        btnButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Anterior = txtOperador.getText().toString();
                txtOperador.setText(Anterior + "6");
            }
        });

        btnButton7 = findViewById(R.id.btnNum7);
        btnButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Anterior = txtOperador.getText().toString();
                txtOperador.setText(Anterior + "7");
            }
        });

        btnButton8 = findViewById(R.id.btnNum8);
        btnButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Anterior = txtOperador.getText().toString();
                txtOperador.setText(Anterior + "8");
            }
        });

        btnButton9 = findViewById(R.id.btnNum9);
        btnButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Anterior = txtOperador.getText().toString();
                txtOperador.setText(Anterior + "9");
            }
        });


    }
}
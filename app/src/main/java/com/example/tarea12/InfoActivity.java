package com.example.tarea12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    TextView nombre, apellido, edad, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        nombre.setText(getIntent().getStringExtra("putnombres"));
        apellido.setText(getIntent().getStringExtra("putapellidos"));
        edad.setText(getIntent().getStringExtra("putedad"));
        correo.setText(getIntent().getStringExtra("putcorreo"));
    }
}
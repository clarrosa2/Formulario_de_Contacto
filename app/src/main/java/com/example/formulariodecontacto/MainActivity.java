package com.example.formulariodecontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText nombre, telefono, email, descripcion;
    DatePicker fecha;
    Button botonSigueinte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=findViewById(R.id.edit_nombre);
        telefono=findViewById(R.id.edit_telefono);
        email=findViewById(R.id.edit_email);
        descripcion=findViewById(R.id.edit_descripcion);
        fecha=findViewById(R.id.select_fecha);

        botonSigueinte=findViewById(R.id.botonSigueinte);

        botonSigueinte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit_nombre = nombre.getText().toString().trim();
                String edit_telefono= telefono.getText().toString().trim();
                String edit_email= email.getText().toString().trim();
                String edit_descripcion = descripcion.getText().toString().trim();
                String select_fecha = String.valueOf(fecha.getCalendarView());


                Intent intent= new Intent(MainActivity.this, ConfirmacionDeDatos.class);
                intent.putExtra("Nombre", edit_nombre);
                intent.putExtra("Telefono", edit_telefono);
                intent.putExtra("Email", edit_email);
                intent.putExtra("Descripcion", edit_descripcion);
                intent.putExtra("Fecha",select_fecha);

                startActivity(intent);
            }


        });

    }

}
package com.example.formulariodecontacto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class ConfirmacionDeDatos extends AppCompatActivity {

    TextView confirmarNombre, confirmarTelefono, confirmarEmail, confirmarDescripcion, confirmarFecha;

    Button botonEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_de_datos);
        botonEditar=findViewById(R.id.botonEditar);
        confirmarNombre=findViewById(R.id.nombreConfirmar);
        confirmarTelefono=findViewById(R.id.telefonoConfirmar);
        confirmarEmail=findViewById(R.id.emailConfirmar);
        confirmarDescripcion=findViewById(R.id.descripcionConfirmar);
        confirmarFecha=findViewById(R.id.fechaConfirmar);


        String edit_nombre, edit_telefono, edit_email, edit_descripcion, select_fecha;

        Intent intent = getIntent();

        edit_nombre = intent.getStringExtra("Nombre");
        edit_telefono = intent.getStringExtra("Telefono");
        edit_email = intent.getStringExtra("Email");
        edit_descripcion = intent.getStringExtra("Descripcion");
        select_fecha = intent.getStringExtra("Fecha");



        confirmarNombre.setText(edit_nombre);
        confirmarTelefono.setText(edit_telefono);
        confirmarEmail.setText(edit_email);
        confirmarDescripcion.setText(edit_descripcion);
        confirmarFecha.setText(select_fecha);







        botonEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConfirmacionDeDatos.this, MainActivity.class));
            }
        });

    }

}
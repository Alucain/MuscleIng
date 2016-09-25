package com.example.cristian.muscleregistrationylogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etEdad = (EditText) findViewById(R.id.etEdad);
        final EditText etNombre = (EditText) findViewById(R.id.etNombre);
        final EditText etContraseña = (EditText) findViewById(R.id.etContraseña);
        final EditText etUsuario = (EditText) findViewById(R.id.etUsuario);
        final EditText etPeso = (EditText) findViewById(R.id.etPeso);
        final EditText etAltura = (EditText) findViewById(R.id.etAltura);
        final EditText etTelefono = (EditText) findViewById(R.id.etTelefono);
        final Button bRegistro = (Button) findViewById(R.id.bRegistro);


        bRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent regsterActiityIntent = new Intent(RegisterActivity.this, UserAreaActivity.class);
                RegisterActivity.this.startActivity(regsterActiityIntent);
            }
        });
    }
}

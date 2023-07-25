package com.example.apptambo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.apptambo.databinding.ActivityRegistroBinding;

public class RegistroActivity extends AppCompatActivity {

    ActivityRegistroBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        binding = ActivityRegistroBinding.inflate(getLayoutInflater());
        View vista = binding.getRoot();
        setContentView(vista);

        //Boton Registro
        binding.btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.edtNombresRegistro.getText().toString().trim().equals("") || binding.edtCorreoRegistro.getText().toString().trim().equals("") || binding.edtContraseARegistro.getText().toString().trim().equals("")){
                    Toast.makeText(RegistroActivity.this, "Complete sus datos en las respectivas casillas", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
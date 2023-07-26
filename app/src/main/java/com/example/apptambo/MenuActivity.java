package com.example.apptambo;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.apptambo.DAO.DBHelper;
import com.example.apptambo.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {
    DBHelper dbHelper=new DBHelper(MenuActivity.this);
    SQLiteDatabase db;
    ActivityMenuBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        View vista = binding.getRoot();
        setContentView(vista);
        binding.btnBuscarProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
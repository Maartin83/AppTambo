package com.example.apptambo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.apptambo.DAO.DBHelper;
import com.example.apptambo.DAO.UsuarioDAO;
import com.example.apptambo.Entities.Usuario;
import com.example.apptambo.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_login);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View vista = binding.getRoot();
        setContentView(vista);

        UsuarioDAO dao=new UsuarioDAO(getApplicationContext());

        Usuario prueba=new Usuario("admin_1","admins@admins","admins");
        String msje=dao.GuardarUsuario(prueba);

        Toast.makeText(this,msje, Toast.LENGTH_SHORT).show();
        dao=null;

        binding.btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c=new Intent(LoginActivity.this,ResgistroSistemaActivity.class);
                startActivity(c);
            }
        });

        binding.btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingresar();

                /*UsuarioDAO dao;
                dao=null;
                String user=binding.etCorreo.getText().toString();
                String con=binding.etContra.getText().toString();

                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(con))
                    Toast.makeText(LoginActivity.this, "Todos los campos son requeridos", Toast.LENGTH_SHORT).show();
                else{
                    Boolean user_pass=dao.check_usu_con(user,con);
                    if(user_pass){
                        Toast.makeText(LoginActivity.this, "sesion exitosa", Toast.LENGTH_SHORT).show();
                        Intent i =new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }else {
                        Toast.makeText(LoginActivity.this, "error al iniciar", Toast.LENGTH_SHORT).show();
                    }
                }*/
            }
        });
    }
    public void ingresar() {
        try {
            DBHelper user=new DBHelper(LoginActivity.this);
            SQLiteDatabase db=user.getWritableDatabase();
            String usuario=binding.etCorreo.getText().toString();
            String contra=binding.etContra.getText().toString();
            Cursor fila=db.rawQuery("Select correo,contraseña from usuarios where correo='"+usuario+ "'and contraseña='"+contra+"'",null);

            Toast.makeText(this, "datos correctos", Toast.LENGTH_SHORT).show();
            Intent i =new Intent(LoginActivity.this,MenuActivity.class);
            startActivity(i);

        }catch (Exception e){
            Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
        }


    }

}
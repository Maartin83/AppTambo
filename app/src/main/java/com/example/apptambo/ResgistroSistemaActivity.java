package com.example.apptambo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.apptambo.DAO.DBHelper;
import com.example.apptambo.DAO.UsuarioDAO;
//import com.example.apptambo.databinding.ActivityResgistroSistemaBinding;

public class ResgistroSistemaActivity extends AppCompatActivity {

    //ActivityResgistroSistemaBinding binding;

    /*EditText username, password, repassword;
    Button signup, signin;
    DBHelper DB;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgistro_sistema);

        /*username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        signup=findViewById(R.id.signup);
        signin=findViewById(R.id.signin);
        DB= new DBHelper (this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UsuarioDAO dao;
                dao=null;

                String user=username.getText().toString();
                String pass=password.getText().toString();
                String repass=repassword.getText().toString();
                if (TextUtils.isEmpty (user) || TextUtils.isEmpty (pass) || TextUtils.isEmpty (repass))
                    Toast.makeText( ResgistroSistemaActivity.this,"Todos los Campos Requeridos", Toast.LENGTH_SHORT).show();
                else{
                    if (pass.equals(repass)) {
                        Boolean checkuser = dao.checkUsua(user);
                        if (checkuser==false) {
                            Boolean insert = dao.insertData(user,pass);
                            if(insert==true){
                                Toast.makeText( ResgistroSistemaActivity. this, "Registro Exitoso", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent (getApplicationContext(),MainActivity.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText( ResgistroSistemaActivity. this,  "Error al Registrar", Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            Toast.makeText( ResgistroSistemaActivity. this, "El Usuario ya Existe", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText( ResgistroSistemaActivity. this,"Passwords are not matching", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (getApplicationContext(), LoginActivity.class);
                startActivity (intent);
            }
        });*/

    }
}
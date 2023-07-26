package com.example.apptambo.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.apptambo.Entities.Usuario;

public class UsuarioDAO {
    private DBHelper helper;
    private SQLiteDatabase db;

    public UsuarioDAO(Context ctx) {
        helper = new DBHelper(ctx);
    }

    //public void abrir(){
        //db=helper.getWritableDatabase();
    //}

    //public void cerrar(){
        //helper.close();
   // }

    public String GuardarUsuario(Usuario obj)
    {
        ContentValues us=new ContentValues();
        us.put("nomusu",obj.getNombreUsuario());
        us.put("correo",obj.getCorreoElectronico());
        us.put("contraseña",obj.getContrasenia());

        db=helper.getWritableDatabase();
        db.insert("usuarios",null,us);
        db.close();
        return "Datos registrados";
    }

    /*public Boolean insertData(String username, String password) {
        SQLiteDatabase db= this.helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("nomusu", username);
        values.put("password", password);
        long result= db.insert( "users",  null, values);
        if(result ==-1) return false;
        else
            return true;
    }

    //DBHelper
    public Boolean checkUsua(String user){
        SQLiteDatabase db=this.helper.getWritableDatabase();
        Cursor c=db.rawQuery("select * from users where nomusu=?",new String[]{user});
        if(c.getCount()>0)
            return true;
        else
            return true;
    }
    public Boolean check_usu_con(String user, String pass){
        SQLiteDatabase db=this.helper.getWritableDatabase();
        Cursor u_c=db.rawQuery("select * from users where nomusu=? and password=?",new String[]{user,pass});
        if(u_c.getCount()>0)
            return true;
        else
            return false;
    }*/
}

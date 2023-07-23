package com.example.apptambo.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UsuarioDAO {
    DBHelper helper;
    SQLiteDatabase db;

    public UsuarioDAO(Context ctx) {
        helper = new DBHelper(ctx);
    }
}

package com.example.apptambo.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class CategoriaDAO {
    DBHelper helper;
    SQLiteDatabase db;

    public CategoriaDAO(Context ctx) {
        helper = new DBHelper(ctx);
    }
}

package com.example.apptambo.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class CompraVentaDAO {
    DBHelper helper;
    SQLiteDatabase db;

    public CompraVentaDAO(Context ctx) {
        helper = new DBHelper(ctx);
    }
}

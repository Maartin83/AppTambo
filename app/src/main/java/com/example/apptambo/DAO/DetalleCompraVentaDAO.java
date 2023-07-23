package com.example.apptambo.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DetalleCompraVentaDAO {
    DBHelper helper;
    SQLiteDatabase db;

    public DetalleCompraVentaDAO(Context ctx) {
        helper = new DBHelper(ctx);
    }
}

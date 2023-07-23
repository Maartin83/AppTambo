package com.example.apptambo.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DetalleCarritoDAO {
    DBHelper helper;
    SQLiteDatabase db;

    public DetalleCarritoDAO(Context ctx) {
        helper = new DBHelper(ctx);
    }
}

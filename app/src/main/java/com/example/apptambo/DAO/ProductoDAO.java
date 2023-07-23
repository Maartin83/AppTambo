package com.example.apptambo.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ProductoDAO {
    DBHelper helper;
    SQLiteDatabase db;

    public ProductoDAO(Context ctx) {
        helper = new DBHelper(ctx);
    }
}

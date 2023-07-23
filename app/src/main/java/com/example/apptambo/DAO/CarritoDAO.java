package com.example.apptambo.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class CarritoDAO {
    DBHelper helper;
    SQLiteDatabase db;

    public CarritoDAO(Context ctx) {
        helper = new DBHelper(ctx);
    }
}

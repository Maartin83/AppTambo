package com.example.apptambo.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    //tabla usuarios
    String usua="create table if not exists usuarios(" +
            "id INTEGER primary key AUTOINCREMENT,"+
            "nomusu varchar(60)," +
            "correo varchar(100)," +
            "contraseña varchar(30))";

    //tabla categorias
    String cat="create table if not exists categorias(" +
            "id INTEGER primary key AUTOINCREMENT,"+
            "nomcat varchar(60))";

    //tabla producto
    String pro="create table if not exists productos(" +
            "id INTEGER primary key AUTOINCREMENT,"+
            "nomcat varchar(60)," +
            "despro varchar(100)," +
            "prepro real," +
            "stockpro int," +
            "codcat int, foreign key(codcat) references categorias (id) )";

    //tabla carritos
    String car="create table if not exists carrito(id INTEGER primary key AUTOINCREMENT,"+
            "usu_id INTEGER," +
            "foreign key(usu_id) references usuarios(id) )";

    //tabla detalle_carritos
    String det_car="create table if not exists detalle_carrito(" +
            "id INTEGER primary key AUTOINCREMENT,"+
            "cantidad int," +
            "precio_unitario real," +
            "pro_id int, " +
            "car_id int," +
            "foreign key(pro_id) references productos(id),"+
            "foreign key(car_id) references carrito(id))";

    //tabla compras-ventas
    String com_ven="create table if not exists compras_ventas(" +
            "id INTEGER primary key AUTOINCREMENT,"+
            "fech_hours varchar(15)," +
            "total real," +
            "tipo varchar(50)," +
            "usu_id int," +
            " foreign key(usu_id) references usuarios(id) )";

    //tabla detalle_compras_ventas
    String d_com_ven="create table if not exists detalle_compras_ventas(" +
            "id INTEGER primary key AUTOINCREMENT,"+
            "cantidad int," +
            "pre_uni real," +
            "pro_id int, " +
            "com_ven_id int ," +
            "foreign key(pro_id) references productos(id)," +
            "foreign key(com_ven_id) references compras_ventas(id))";


    //constructor
    public DBHelper(@Nullable Context context) {
        super(context, "BDTAMBO", null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //creacion de tablas
        db.execSQL(usua);
        db.execSQL(cat);
        db.execSQL(pro);
        db.execSQL(car);
        db.execSQL(det_car);
        db.execSQL(com_ven);
        db.execSQL(d_com_ven);
        db.execSQL("insert into usuarios values('admin','admin@admin','admin')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

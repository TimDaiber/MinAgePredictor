package com.example.tim.myfinalproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Tim on 4/23/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "prediction.db";
    public static final String TABLE_NAME = "prediction_table";

    public static final String ID = "id";
    public static final String COL_1 = "smoker";
    public static final String COL_2 = "weight";
    public static final String COL_3 = "gender";
    public static final String COL_4 = "eating";
    public static final String COL_5 = "country";
    public static final String COL_6 = "outlook";
    public static final String COL_7 = "alcohol";
    public static final String COL_8 = "";
    public static final String COL_9 = "";


    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

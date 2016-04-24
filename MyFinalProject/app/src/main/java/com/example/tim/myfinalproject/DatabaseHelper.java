package com.example.tim.myfinalproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Tim on 4/23/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "prediction5.db";
    public static final String TABLE_NAME = "prediction_table";

    public static final String COL_1 = "id";
    public static final String COL_2 = "name";
    public static final String COL_3 = "smoker";
    public static final String COL_4 = "weight";
    public static final String COL_5 = "gender";
    public static final String COL_6 = "eating";
    public static final String COL_7 = "country";
    public static final String COL_8 = "alcohol";
    public static final String COL_9 = "outlook";
    public static final String COL_10 = "age";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("create table " + TABLE_NAME + " (id integer primary key autoincrement,name text,smoker text,weight text,gender text, eating text,country text,alcohol text,outlook text,age integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    }

    public boolean inssrData(String name,String smoker, String weight, String gender, String eating,String country, String alcohol,String outlook, int age){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COL_2, name);
        contentValues.put(COL_3, smoker);
        contentValues.put(COL_4, weight);
        contentValues.put(COL_5, gender);
        contentValues.put(COL_6, eating);
        contentValues.put(COL_7, country);
        contentValues.put(COL_8, alcohol);
        contentValues.put(COL_9, outlook);
        contentValues.put(COL_10, age);

        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1){
            return false;
        }else {
            return true;
        }
    }
    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+ TABLE_NAME ,null);
        return  res;
    }
}

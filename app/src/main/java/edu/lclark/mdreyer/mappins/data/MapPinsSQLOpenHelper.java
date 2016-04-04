package edu.lclark.mdreyer.mappins.data;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by Magisus on 4/4/2016.
 */
public class MapPinsSQLOpenHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "maps.db";
    private static MapPinsSQLOpenHelper instance;

    public static MapPinsSQLOpenHelper getInstance(Context context) {
        if (instance == null) {
            instance = new MapPinsSQLOpenHelper(context.getApplicationContext(), DB_NAME, null, 1);
        }
        return instance;
    }

    public MapPinsSQLOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory
            factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + User.TABLE_NAME + " ( " +
                        User._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        User.COL_NAME + " TEXT )"
        );

        db.execSQL("CREATE TABLE " + Pin.TABLE_NAME + " ( " +
                        Pin._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        Pin.COL_TITLE + " TEXT, " +
                        Pin.COL_LAT + " REAL, " +
                        Pin.COL_LONG + " REAL, " +
                        Pin.COL_DESCRIPTION + " TEXT, " +
                        Pin.COL_USER + " INTEGER )"
        );

    }
    
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

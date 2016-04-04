package edu.lclark.mdreyer.mappins.data;

import android.content.ContentValues;
import android.provider.BaseColumns;

import java.util.ArrayList;

/**
 * Created by Magisus on 4/4/2016.
 */
public class User implements BaseColumns {

    public static final String TABLE_NAME = "users";
    public static final String COL_NAME = "name";

    String name;

    public User(String name) {
        this.name = name;
    }

    public void addPin(double lat, double lng) {

    }

    public String getID() {
        return _ID;
    }

    public ContentValues getContentValues() {
        ContentValues values = new ContentValues();
        values.put(COL_NAME, name);
        return values;
    }

}

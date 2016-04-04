package edu.lclark.mdreyer.mappins.data;

import android.content.ContentValues;
import android.provider.BaseColumns;

/**
 * Created by Magisus on 4/4/2016.
 */
public class Pin implements BaseColumns {

    public static final String TABLE_NAME = "pins";
    public static final String COL_TITLE = "title";
    public static final String COL_LAT = "latitude";
    public static final String COL_LONG = "longitude";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_USER = "user";

    private String title;
    private double latitude;
    private double longitude;
    private String description;
    private User user;

    public Pin(User user, double latitude, double longitude) {
        this.user = user;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setColDescription(String description) {
        this.description = description;
    }

    public ContentValues getContentValues() {
        ContentValues values = new ContentValues();
        values.put(COL_TITLE, title);
        values.put(COL_LAT, latitude);
        values.put(COL_LONG, longitude);
        values.put(COL_DESCRIPTION, description);
        values.put(COL_USER, user.getID());
        return values;
    }
}

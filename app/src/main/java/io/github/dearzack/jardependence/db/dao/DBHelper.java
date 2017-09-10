package io.github.dearzack.jardependence.db.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import org.greenrobot.greendao.database.DatabaseOpenHelper;

/**
 * Created by Zack on 2017/9/10.
 */

public class DBHelper extends DatabaseOpenHelper {

    public DBHelper(Context context, String name, int version) {
        super(context, name, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
    }
}

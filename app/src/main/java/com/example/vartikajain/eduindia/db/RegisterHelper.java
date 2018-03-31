package com.example.vartikajain.eduindia.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

import com.example.vartikajain.eduindia.db.Tables.RegisterTable;
import com.example.vartikajain.eduindia.db.Tables.SignupTable;

/**
 * Created by VARTIKA JAIN on 29-03-2018.
 */

public class RegisterHelper extends SQLiteOpenHelper {

    public static final String DB_NAME="Register.db";
    public static final int DB_VER= 1;
    public RegisterHelper(Context context) {
        super(context, DB_NAME, null, DB_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SignupTable.CMD_CREATE1);
        db.execSQL(RegisterTable.CMD_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

package com.example.vartikajain.eduindia.db.Tables;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;

import com.example.vartikajain.eduindia.Models.Register;
import com.example.vartikajain.eduindia.Models.signup;

import static com.example.vartikajain.eduindia.db.Tables.DBConsts.CMD_CREATE_TABLE_INE;
import static com.example.vartikajain.eduindia.db.Tables.DBConsts.COMMA;
import static com.example.vartikajain.eduindia.db.Tables.DBConsts.LBR;
import static com.example.vartikajain.eduindia.db.Tables.DBConsts.RBR;
import static com.example.vartikajain.eduindia.db.Tables.DBConsts.SEMI;
import static com.example.vartikajain.eduindia.db.Tables.DBConsts.TYPE_AI;
import static com.example.vartikajain.eduindia.db.Tables.DBConsts.TYPE_INT;
import static com.example.vartikajain.eduindia.db.Tables.DBConsts.TYPE_PK;
import static com.example.vartikajain.eduindia.db.Tables.DBConsts.TYPE_TEXT;
import com.example.vartikajain.eduindia.Models.signup;

import java.util.ArrayList;


/**
 * Created by VARTIKA JAIN on 30-03-2018.
 */

public class SignupTable {

    public static final String TABLE_NAME="signup";
    public interface Columns {
        String ID = "id";
        String FNAME="firstname";
        String LNAME="lastname";
        String USERNAME = "username";
        String PASS="password";
    }

    public static final String CMD_CREATE1=
            CMD_CREATE_TABLE_INE + TABLE_NAME +
                    LBR+
                    Columns.ID + TYPE_INT + TYPE_PK + TYPE_AI+ COMMA +
                    Columns.FNAME + TYPE_TEXT +COMMA+
                    Columns.LNAME + TYPE_TEXT +COMMA+
                    Columns.USERNAME + TYPE_TEXT +COMMA+
                    Columns.PASS + TYPE_TEXT +
                    RBR +
                    SEMI ;


//    public static String getUserInfo(SQLiteDatabase db, EditText etusername, EditText etpswrd)
//    {
//
//        String whereClause = Columns.USERNAME+" LIKE ?" + " AND "+ Columns.PASS+" LIKE ?";
//        String[] whereArgs = new String[] {
//                etusername.getText().toString(),
//                etpswrd.getText().toString()
//        };
//        Cursor c= db.query(
//                TABLE_NAME,
//                new String[]{
//                        Columns.ID,Columns.FNAME,Columns.LNAME,Columns.USERNAME,Columns.PASS},
//                whereClause,
//                whereArgs,
//                null,
//                null,
//                null
//        );
//        if(c!=null){
//            c.moveToFirst();
//            String name=c.getString(0);
//            return name;
//        }
//        return null;
//    }
    public static long insertSignupInfo(SQLiteDatabase db, signup signup){

        ContentValues signupData=new ContentValues();
        signupData.put(Columns.FNAME,signup.getFname());
        signupData.put(Columns.LNAME,signup.getLname());
        signupData.put(Columns.USERNAME,signup.getUname());
        signupData.put(Columns.PASS,signup.getPswrd());
        return db.insert(TABLE_NAME,
                null,
                signupData
        );
    }
}


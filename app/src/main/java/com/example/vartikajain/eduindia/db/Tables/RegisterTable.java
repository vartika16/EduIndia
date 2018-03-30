package com.example.vartikajain.eduindia.db.Tables;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.vartikajain.eduindia.Models.Register;

import static com.example.vartikajain.eduindia.db.Tables.DBConsts.CMD_CREATE_TABLE_INE;
import static com.example.vartikajain.eduindia.db.Tables.DBConsts.*;

/**
 * Created by VARTIKA JAIN on 29-03-2018.
 */

public class RegisterTable {

    public static final String TABLE_NAME="todos";

    public interface Columns{
        String ID="id";
        String USERNAME= "username";
        String EMAIL="email";
        String CONTACT="contact_no";
        String DOB="dob";
        String ADDRESS="address";
        String GENDER="gender";
        String PASS="pass_no";
        String RELIGION="religion";
        String NATION="nationality";
        String SCHOOL="school";
        String UNI="university";
        String MARKS_10="marks_10";
        String MARKS_12="marks_12";
        String MARKS_UNI="marks_uni";
    }

    public static final String CMD_CREATE=
            CMD_CREATE_TABLE_INE + TABLE_NAME +
                    LBR+
                    Columns.ID + TYPE_INT + TYPE_PK + TYPE_AI+ COMMA +
                    Columns.USERNAME + TYPE_TEXT +COMMA+
                    Columns.EMAIL + TYPE_TEXT +COMMA+
                    Columns.CONTACT + TYPE_TEXT +COMMA+
                    Columns.DOB + TYPE_TEXT +COMMA+
                    Columns.ADDRESS + TYPE_TEXT +COMMA+
                    Columns.GENDER + TYPE_TEXT +COMMA+
                    Columns.RELIGION + TYPE_TEXT +COMMA+
                    Columns.NATION + TYPE_TEXT +COMMA+
                    Columns.SCHOOL + TYPE_TEXT +COMMA+
                    Columns.UNI + TYPE_TEXT +COMMA+
                    Columns.MARKS_10 + TYPE_INT +COMMA+
                    Columns.MARKS_12 + TYPE_INT +COMMA+
                    Columns.MARKS_UNI + TYPE_INT +
                    RBR +
                    SEMI ;

    public static long insertPersonalInfo(SQLiteDatabase db, Register register){

        ContentValues registerData=new ContentValues();
        registerData.put(Columns.USERNAME,register.getUsername());
        registerData.put(Columns.EMAIL,register.getEmail());
        registerData.put(Columns.CONTACT,register.getContact_no());
        registerData.put(Columns.DOB,register.getDob());
        registerData.put(Columns.ADDRESS,register.getAddress());
        registerData.put(Columns.GENDER,register.getGender());
        registerData.put(Columns.RELIGION,register.getReligion());
        registerData.put(Columns.NATION,register.getNationality());
        registerData.put(Columns.SCHOOL,register.getSchool());
        registerData.put(Columns.UNI,register.getUniversity());
        registerData.put(Columns.MARKS_10,register.getMarks_10());
        registerData.put(Columns.MARKS_12,register.getMarks_12());
        registerData.put(Columns.MARKS_UNI,register.getMarks_uni());

        return db.insert(TABLE_NAME,
                null,
                registerData
        );
    }
}

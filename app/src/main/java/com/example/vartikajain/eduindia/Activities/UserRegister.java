package com.example.vartikajain.eduindia.Activities;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.vartikajain.eduindia.Models.signup;
import com.example.vartikajain.eduindia.R;
import com.example.vartikajain.eduindia.db.RegisterHelper;
import com.example.vartikajain.eduindia.db.Tables.SignupTable;

public class UserRegister extends AppCompatActivity {
    EditText etfname,etlname,etuname,etpswrd;
    Button btnsubmit;
    public static final String TAG = "db";
    SQLiteDatabase signupdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etfname= (EditText) findViewById(R.id.etfname);
        etlname= (EditText) findViewById(R.id.etlname);
        etuname= (EditText) findViewById(R.id.etuname);
        etpswrd= (EditText) findViewById(R.id.etpswrd);
        btnsubmit=(Button)findViewById(R.id.btnsubmit);
        signupdb=new RegisterHelper(this).getWritableDatabase();
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                long id= SignupTable.insertSignupInfo(signupdb,new signup(etfname.getText().toString(),
                        etlname.getText().toString(),etuname.getText().toString(),
                        etpswrd.getText().toString()));

                Log.d(TAG,"entry:"+id);
            }
        });
    }
}

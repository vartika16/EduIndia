package com.example.vartikajain.eduindia.Activities;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vartikajain.eduindia.MainActivity;
import com.example.vartikajain.eduindia.Models.signup;
import com.example.vartikajain.eduindia.R;
import com.example.vartikajain.eduindia.db.Tables.SignupTable;

import java.util.ArrayList;

public class login extends AppCompatActivity {

    EditText etusername,etpswrd;
    Button btnlogin,btnregister;
    signup signups=null;
    SQLiteDatabase signupdb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etusername= (EditText) findViewById(R.id.etusername);
        etpswrd= (EditText) findViewById(R.id.etpswrd);
        btnlogin= (Button) findViewById(R.id.btnlogin);
        btnregister= (Button) findViewById(R.id.btnregister);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if((SignupTable.getUserInfo(signupdb, etusername, etpswrd))== null) {
//                    Toast.makeText(login.this,"Invalid Username/Password",Toast.LENGTH_SHORT).show();
//                }
                    Intent intent=new Intent(login.this,MainActivity.class);
                    login.this.startActivity(intent);

            }
        });
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(login.this,UserRegister.class);
                login.this.startActivity(i);
            }
});
    }
}

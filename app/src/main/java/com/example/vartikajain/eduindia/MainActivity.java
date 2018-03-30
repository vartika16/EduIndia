package com.example.vartikajain.eduindia;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.vartikajain.eduindia.Models.Register;
import com.example.vartikajain.eduindia.db.RegisterHelper;
import com.example.vartikajain.eduindia.db.Tables.RegisterTable;

public class MainActivity extends AppCompatActivity {
    EditText etusername, etemail, etcontact, etdob, etaddress, etpass, etreligion, etnation, etschool, etuni, etmarks10, etmarks12, etmarksuni;
    RadioGroup rggender;
    RadioButton rbmale, rbfemale, rbgender;
    Button btnsubmit;
    int genderid;

    public static final String TAG = "db";
    public static final String GENDER = "gender";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusername = (EditText) findViewById(R.id.etusername);
        etemail = (EditText) findViewById(R.id.etemail);
        etcontact = (EditText) findViewById(R.id.etcontact);
        etdob = (EditText) findViewById(R.id.etdob);
        etaddress = (EditText) findViewById(R.id.etaddress);
        etpass = (EditText) findViewById(R.id.etpass);
        etreligion = (EditText) findViewById(R.id.etreligion);
        etnation = (EditText) findViewById(R.id.etnation);
        etschool = (EditText) findViewById(R.id.etschool);
        etuni = (EditText) findViewById(R.id.etuni);
        etmarks10 = (EditText) findViewById(R.id.etmarks10);
        etmarks12 = (EditText) findViewById(R.id.etmarks12);
        etmarksuni = (EditText) findViewById(R.id.etmarksuni);
        rggender = (RadioGroup) findViewById(R.id.rggender);
        rbmale = (RadioButton) findViewById(R.id.rbmale);
        rbfemale = (RadioButton) findViewById(R.id.rbfemale);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);
        final SQLiteDatabase registerDb = new RegisterHelper(this).getWritableDatabase();

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                genderid = rggender.getCheckedRadioButtonId();
                rbgender = (RadioButton) findViewById(genderid);
                long id= RegisterTable.insertPersonalInfo(registerDb,new Register(etusername.getText().toString(),
                        etemail.getText().toString(),etcontact.getText().toString(),etdob.getText().toString(),
                        rbgender.getText().toString(),
                        etaddress.getText().toString(),etpass.getText().toString(),
                        etreligion.getText().toString(), etnation.getText().toString(),etschool.getText().toString(),
                        etuni.getText().toString(), Integer.parseInt(etmarks10.getText().toString()),
                        Integer.parseInt(etmarks12.getText().toString()),
                      Integer.parseInt(etmarksuni.getText().toString())));

                Log.d(GENDER,"gender is:"+rbgender.getText());
                Log.d(TAG,"onclick:"+id);
            }
        });
    }
}
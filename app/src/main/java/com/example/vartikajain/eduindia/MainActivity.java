package com.example.vartikajain.eduindia;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.vartikajain.eduindia.Activities.ExamDisplay;
import com.example.vartikajain.eduindia.Activities.UploadActivity;
import com.example.vartikajain.eduindia.Activities.UserRegister;
import com.example.vartikajain.eduindia.Models.Register;
import com.example.vartikajain.eduindia.db.RegisterHelper;
import com.example.vartikajain.eduindia.db.Tables.RegisterTable;

public class MainActivity extends AppCompatActivity {
    EditText etusername, etemail, etcontact, etdob, etaddress, etpass, etreligion, etnation, etschool, etuni, etmarks10, etmarks12, etmarksuni;
    RadioGroup rggender;
    RadioButton rbmale, rbfemale, rbgender;
    Button btnsubmit;
    CheckBox cbmain,cbadvance,cbgmat,cbclat;
    int genderid,total;
    public static final String TAG = "db";
    public static final String GENDER = "gender";
    public static final String CHECKBOX="cb";
    SQLiteDatabase registerDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        total=0;
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
        cbmain= (CheckBox) findViewById(R.id.cbmain);
        cbadvance= (CheckBox) findViewById(R.id.cbadvance);
        cbgmat= (CheckBox) findViewById(R.id.cbgmat);
        cbclat= (CheckBox) findViewById(R.id.cbclat);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);
        final SQLiteDatabase registerDb = new RegisterHelper(this).getWritableDatabase();
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                genderid = rggender.getCheckedRadioButtonId();
                rbgender = (RadioButton) findViewById(genderid);

                long id= RegisterTable.insertPersonalInfo(registerDb,new Register(etusername.getText().toString(),
                        etemail.getText().toString(),etcontact.getText().toString(),etdob.getText().toString(),
                        etaddress.getText().toString(),
                        rbgender.getText().toString(),etpass.getText().toString(),
                        etreligion.getText().toString(), etnation.getText().toString(),etschool.getText().toString(),
                        etuni.getText().toString(), Integer.parseInt(etmarks10.getText().toString()),
                        Integer.parseInt(etmarks12.getText().toString()),
                      Integer.parseInt(etmarksuni.getText().toString())));

                Log.d(GENDER,"gender is:"+rbgender.getText());
                Log.d(TAG,"onclick:"+id);
                Log.d(CHECKBOX,"no of checks:"+total);
                Intent intent=new Intent(MainActivity.this, UploadActivity.class);
                MainActivity.this.startActivity(intent);


            }
        });


    }
    public void oncbclicked(View v){
        switch (v.getId()){
            case R.id.cbmain:
                if (cbmain.isChecked())
                    total++;
            case R.id.cbadvance:
                if (cbadvance.isChecked())
                    total++;
            case R.id.cbgmat:
                if (cbgmat.isChecked())
                    total++;
            case R.id.cbclat:
                if (cbclat.isChecked())
                    total++;
        }
    }
    public void cbdatatransfer(View view){

        Intent i=new Intent(MainActivity.this, ExamDisplay.class);
        switch (view.getId()){
            case R.id.cbmain:
                if (cbmain.isChecked())
                    total++;
            case R.id.cbadvance:
                if (cbadvance.isChecked())
                    total++;
            case R.id.cbgmat:
                if (cbgmat.isChecked())
                    total++;
            case R.id.cbclat:
                if (cbclat.isChecked())
                    total++;
        }
    }
}
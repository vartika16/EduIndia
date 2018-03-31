package com.example.vartikajain.eduindia.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.example.vartikajain.eduindia.R;

public class UploadActivity extends AppCompatActivity {
    private static final int photoPdf = 1;
    private static final int signaturePdf = 2;
    private static final int identityPdf = 3;
    private static final int tenthPdf = 4;
    private static final int twelfthPdf = 5;
    private static final int passportPdf = 6;
    ImageView ivPhoto, ivSignature, ivIdentity, ivTenth, ivTwelfth, ivPassport;
    Button btnSubmit;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==photoPdf){
            if(resultCode == RESULT_OK){
                ivPhoto.setImageResource(R.drawable.ic_check_circle_black_24dp);
            }
        }
        if(requestCode==signaturePdf){
            if(resultCode == RESULT_OK){
                ivSignature.setImageResource(R.drawable.ic_check_circle_black_24dp);
            }
        }
        if(requestCode==identityPdf){
            if(resultCode == RESULT_OK){
                ivIdentity.setImageResource(R.drawable.ic_check_circle_black_24dp);
            }
        }
        if(requestCode==tenthPdf){
            if(resultCode == RESULT_OK){
                ivTenth.setImageResource(R.drawable.ic_check_circle_black_24dp);
            }
        }
        if(requestCode==twelfthPdf){
            if(resultCode == RESULT_OK){
                ivTwelfth.setImageResource(R.drawable.ic_check_circle_black_24dp);
            }
        }
        if(requestCode==passportPdf){
            if(resultCode == RESULT_OK){
                ivPassport.setImageResource(R.drawable.ic_check_circle_black_24dp);
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        ivPhoto = (ImageView) findViewById(R.id.ivPhoto);
        ivSignature = (ImageView) findViewById(R.id.ivSignature);
        ivIdentity = (ImageView) findViewById(R.id.ivIdentity);
        ivTenth = (ImageView) findViewById(R.id.ivTenth);
        ivTwelfth = (ImageView) findViewById(R.id.ivTwelfth);
        ivPassport = (ImageView) findViewById(R.id.ivPassport);
        btnSubmit= (Button) findViewById(R.id.btnSubmit);
        ivPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("application/pdf");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Pdf"), photoPdf);

            }
        });

        ivSignature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("application/pdf");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Pdf"), signaturePdf);

            }
        });

        ivIdentity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("application/pdf");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Pdf"), identityPdf);

            }
        });

        ivTenth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("application/pdf");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Pdf"), tenthPdf);

            }
        });

        ivTwelfth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("application/pdf");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Pdf"), twelfthPdf);

            }
        });

        ivPassport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("application/pdf");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Pdf"), passportPdf);

            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UploadActivity.this,ExamDisplay.class);
                UploadActivity.this.startActivity(intent);
            }
        });

    }
}



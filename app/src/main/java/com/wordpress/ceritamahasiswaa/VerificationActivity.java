package com.wordpress.ceritamahasiswaa;

/*
 * NIM   : 10116517
 * NAMA  : Naufal Zayn M
 * KELAS : AKB-12
 * TGL   : 18/04/2019
 * */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VerificationActivity extends AppCompatActivity {

    Button backhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        backhome = (Button) findViewById(R.id.btn_Send);
        backhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VerificationActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });
    }
}
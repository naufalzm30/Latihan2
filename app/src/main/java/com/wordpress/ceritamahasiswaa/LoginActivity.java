package com.wordpress.ceritamahasiswaa;

/*
 * NIM   : 10116517
 * NAMA  : Naufal Zayn M
 * KELAS : AKB-12
 * TGL   : 18/04/2019
 * */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void OnClick(View view) {
        Intent i = null;
        switch (view.getId()){
            case R.id.btn_register:
                i = new Intent(this, RegisterActivity.class);
        }
        if (null!=i) startActivity(i);
    }
}


package com.udinus.appoinmentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetCode extends AppCompatActivity {


    EditText editTextResetCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_code);

        editTextResetCode = findViewById(R.id.edt_txt_reset);
    }

    public void keResetPassword(View view) {
        if(TextUtils.isEmpty(editTextResetCode.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Harap masukkan Kode Reset terlebih dahulu", Toast.LENGTH_LONG).show();
        }
        else{
            //Intent ke form ganti password
            Intent i = new Intent(ResetCode.this, ResetPassword.class);
            startActivity(i);
        }

    }

}
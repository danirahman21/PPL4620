package com.udinus.appoinmentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    // Deklarasi EditText
    EditText editTextPassword;
    EditText editTextConfirmPassword;
    EditText editTextResetCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        // Binding EditText
        editTextPassword = findViewById(R.id.edt_new_password);
        editTextConfirmPassword = findViewById(R.id.edt_confirm_password);
        editTextResetCode = findViewById(R.id.edt_txt_code);
    }

    public void postChangePassword(View view) {
        if(TextUtils.isEmpty(editTextPassword.getText().toString().trim())
                && TextUtils.isEmpty(editTextConfirmPassword.getText().toString().trim())
                && TextUtils.isEmpty(editTextResetCode.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Harap Isi Kode Reset, New Password, dan Confirm Password", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(editTextPassword.getText().toString().trim())
                && TextUtils.isEmpty(editTextConfirmPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Harap Isi Field New Password dan Confirm Password", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(editTextResetCode.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Harap masukkan Kode Reset terlebih dahulu", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "New Password tidak Boleh Kosong", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(editTextConfirmPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Konfirmasi Password tidak Boleh Kosong", Toast.LENGTH_LONG).show();
        }
        else if(editTextConfirmPassword.getText().toString().equals(editTextPassword.getText().toString())){
            Intent i = new Intent(ResetPassword.this, SuksesReset.class);
            startActivity(i);
        }
        else{
            Toast.makeText(view.getContext(), "New Password dan Confirm Password Harus Sama dan Sesuai", Toast.LENGTH_LONG).show();
        }

    }
}
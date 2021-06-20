package com.udinus.appoinmentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LupaPassword extends AppCompatActivity {

    EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);

        editTextEmail = findViewById(R.id.edt_txt_email);
    }

    public void postSendRequest(View view) {
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email Tidak boleh kosong", Toast.LENGTH_LONG).show();
        }
        else if(!isValidEmail(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email Tidak Valid", Toast.LENGTH_LONG).show();
        }
        else{
            Intent i = new Intent(LupaPassword.this, ResetPassword.class);
            startActivity(i);
        }
    }

    public static boolean isValidEmail(CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}
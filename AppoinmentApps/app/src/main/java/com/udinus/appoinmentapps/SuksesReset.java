package com.udinus.appoinmentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SuksesReset extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukses_reset);
    }

    public void keLogin(View view) {
        Intent i = new Intent(SuksesReset.this, Login.class);
        startActivity(i);
    }
}
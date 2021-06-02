package com.udinus.appoinmentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void keMakeSchedule(View view) {
        Intent i = new Intent(Welcome.this, MakeSchedule.class);
        startActivity(i);
    }

    public void keScheduleHistory(View view) {
        Intent i = new Intent(Welcome.this, ScheduleHistory.class);
        startActivity(i);
    }

    public void keAbout(View view){
        Intent i = new Intent(Welcome.this, About.class);
        startActivity(i);
    }
}
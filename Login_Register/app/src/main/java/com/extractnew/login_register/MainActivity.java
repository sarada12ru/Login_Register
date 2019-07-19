package com.extractnew.login_register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Home");

    }

    public void btn_Reg(View view) {
        startActivity(new Intent(getApplicationContext(),SignUp.class));
    }

    public void btn_log(View view) {
        startActivity(new Intent(getApplicationContext(),LogIn.class));
    }
}

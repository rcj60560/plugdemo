package com.luocj.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.luocj.common.Utils;

public class LoginMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);
        Utils.fun();
    }
}
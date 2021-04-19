package com.luocj.plugdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.luocj.user.UserMainActivity;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkGo.<String >get("www.baidu.com")
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        Log.i("TAG", "onSuccess: ");
                    }
                });
    }

    public void go2User(View view) {
        startActivity(new Intent(this, UserMainActivity.class));
        Log.i(TAG, "go2User: ");
    }
}
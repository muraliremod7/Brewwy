package com.mr.brewwy.brewwy;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    Button llogin,lllogin;
    TextView lregister,llregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        llogin = (Button)findViewById(R.id.llogin);
        lregister = (TextView) findViewById(R.id.lregister);
        lllogin = (Button)findViewById(R.id.lllogin);
        llregister = (TextView) findViewById(R.id.llregister);
        llogin.setOnClickListener(this);
        lregister.setOnClickListener(this);
        lllogin.setOnClickListener(this);
        llregister.setOnClickListener(this);
        findViewById(R.id.llogin).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.llogin:
                View forgotLayout = findViewById(R.id.mainlogin);
                forgotLayout.setVisibility(View.VISIBLE);
                forgotLayout.setAnimation(AnimationUtils.makeInChildBottomAnimation(getApplicationContext()));
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        findViewById(R.id.sociallogin).setVisibility(View.GONE);
                    }
                }, 500);
                break;
            case R.id.lregister:
                Intent mainreg = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(mainreg);
            case R.id.lllogin:
                Intent mainnlogin = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(mainnlogin);
                break;
            case R.id.llregister:
                Intent mainnreg = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(mainnreg);
        }
    }
}

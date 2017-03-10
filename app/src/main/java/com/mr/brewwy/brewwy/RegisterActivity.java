package com.mr.brewwy.brewwy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
        Button regnext;
        EditText userName,emailAddress,passWord,conPass;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            userName = (EditText)findViewById(R.id.regusername);
            emailAddress = (EditText)findViewById(R.id.regemail);
            passWord = (EditText)findViewById(R.id.regpass);
            conPass = (EditText)findViewById(R.id.regconpass);
            regnext = (Button)findViewById(R.id.regnext);
            regnext.setOnClickListener(this);
        }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportActionBar().setTitle("");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case android.R.id.home:
                this.finish();
                break;
            case R.id.regnext:
                Intent loginintent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(loginintent);
                finish();
        }
    }
}

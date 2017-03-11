package com.mr.brewwy.brewwy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
        Button regnext;
        TextView regsignin;
        EditText userName,emailAddress,passWord,conPass;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);
            userName = (EditText)findViewById(R.id.regusername);
            emailAddress = (EditText)findViewById(R.id.regemail);
            passWord = (EditText)findViewById(R.id.regpass);
            conPass = (EditText)findViewById(R.id.regconpass);
            regnext = (Button)findViewById(R.id.regnext);
            regsignin = (TextView)findViewById(R.id.regsignin);
            regsignin.setOnClickListener(this);
            regnext.setOnClickListener(this);
        }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.regnext:
                Intent loginintent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(loginintent);
                finish();
            case R.id.regsignin:
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}

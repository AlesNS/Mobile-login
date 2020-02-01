package com.example.mobile_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText mRegUsername, mRegPassword, mRegConfPassword, mRegEmail;
        Button mRegSubmit;

        mRegUsername = findViewById(R.id.enterName);
        mRegEmail = findViewById(R.id.enterEmail);
        mRegPassword = findViewById(R.id.enterPass);
        mRegConfPassword = findViewById(R.id.confPass);

        mRegSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRegUsername.getText();
                mRegEmail.getText();
                mRegPassword.getText();
                mRegConfPassword.getText();

            }
        });






    }
}

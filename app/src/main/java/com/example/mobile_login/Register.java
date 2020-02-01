package com.example.mobile_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    EditText mRegUsername, mRegPassword, mRegConfPassword, mRegEmail;
    Button mRegister;
    TextView loginHere;
    FirebaseAuth fAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mRegUsername = findViewById(R.id.enterName);
        mRegEmail = findViewById(R.id.enterEmail);
        mRegPassword = findViewById(R.id.enterPass);
        mRegConfPassword = findViewById(R.id.confPass);
        mRegister = findViewById(R.id.buttonSubmit);
        loginHere = findViewById(R.id.loginHere);

        fAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar);







    }
}

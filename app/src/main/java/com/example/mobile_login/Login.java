package com.example.mobile_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    EditText mPassword, mEmail;
    Button mLoginBtn;
    TextView mCreateBtn;
    FirebaseAuth fAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEmail = findViewById(R.id.enterEmail);
        mPassword = findViewById(R.id.enterPass);

        mLoginBtn = findViewById(R.id.loginBtn);
        mCreateBtn = findViewById(R.id.loginHere);

        fAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar);

    }
}

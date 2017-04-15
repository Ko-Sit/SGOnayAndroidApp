package com.application.nikita.sgonayapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.application.nikita.sgonayapp.R;

/**
 * Created by Nikita on 06.03.2017.
 */

public class LoginActivity extends AppCompatActivity {

    private static EditText mLoginText;
    private static EditText mPasswordText;
    private static Button mSignInButton;
    private static String mDummyLogin = "admin";
    private static String mDummyPassword = "admin";
    private static TextView mSignUpTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle(R.string.title_activity_login);
        mLoginText = (EditText)findViewById(R.id.login_text);
        mPasswordText = (EditText) findViewById(R.id.password_text);
        mSignInButton = (Button) findViewById(R.id.signin_button);
        mSignUpTextView = (TextView)findViewById(R.id.link_signup);

        mSignUpTextView.setClickable(true);
        mSignUpTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void logIn(View view) {

        if (mLoginText.getText().toString().equals(mDummyLogin) && mPasswordText.getText().toString().equals(mDummyPassword)) {
            Intent intent = new Intent(LoginActivity.this, GamesActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(LoginActivity.this, R.string.wrong_login_or_password, Toast.LENGTH_SHORT).show();
        }
    }
}

package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnlogin);

        btnLogin.setOnClickListener(view -> {
            String username = etUsername.getText().toString();
            String password = etPassword.getText().toString();

            if(username.isEmpty())
            {
                etUsername.setError("Enter username");
                return;
            }

            if(password.isEmpty())
            {
                etPassword.setError("Enter password");
                return;
            }

            if(username.equals("admin") && password.equals("1234"))
            {
                Toast.makeText(MainActivity.this,
                        "Login Successful",
                        Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity.this,
                        "Invalid Username or Password",
                        Toast.LENGTH_SHORT).show();
            }

        });
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);

    }
}
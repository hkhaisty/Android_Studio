/*
Name: Harriet Haisty
Instructor: Dr. Selena He
Lab: 04
 */

package com.example.lab_004;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private EditText loginText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.etUserName);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.loginButton);
        loginText = (EditText) findViewById(R.id.loginText);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Name.getText().toString().equals("cs4322") && Password.getText().toString().equals("123456")) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Username", Name.getText().toString());
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}


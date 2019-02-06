package com.example.lab_004;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private EditText userName;
    private TextView setText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        userName = (EditText) findViewById(R.id.etUserName);
        setText = (TextView) findViewById(R.id.textView);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setText.setText(userName+ ", Welcome to my homepage!");
    }
}

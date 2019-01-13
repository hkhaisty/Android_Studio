package com.example.hkhai.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        EditText edit = (EditText)findViewById(R.id.editText);
        TextView tview = (TextView)findViewById(R.id.textView);
        String result = edit.getText().toString();
        tview.setText(result);
    }
}

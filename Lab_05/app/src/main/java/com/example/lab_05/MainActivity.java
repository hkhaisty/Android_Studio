package com.example.lab_05;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import static android.content.Intent.ACTION_VIEW;

public class MainActivity extends AppCompatActivity {
    Button openBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openBrowser = findViewById(R.id.openBrowser);

        openBrowser.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent("android.intent.action.VIEW");
//                Intent chooser = Intent.createChooser(intent, "Choose an App");

                startActivity(intent);
            }
        });
    }

}

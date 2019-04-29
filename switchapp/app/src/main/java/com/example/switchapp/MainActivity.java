package com.example.switchapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pressme = (Button) findViewById(R.id.press);
        pressme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri url =  Uri.parse("http://www.google.com" );
                Intent intent = new Intent(Intent.ACTION_VIEW,url);
                Intent chooser = Intent.createChooser(intent,"Choose ONE ALREADY JEEZ");
                if(chooser.resolveActivity(getPackageManager())!=null)
                startActivity(chooser);
            }
        });
    }
}

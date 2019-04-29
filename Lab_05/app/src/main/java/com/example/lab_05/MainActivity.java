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
<<<<<<< HEAD
=======
        }

    public void onButtonClick()
    {

        Intent intent = new Intent(MainActivity.this, Activity_A.class);
        Intent intent2 = new Intent(this, Activity_B.class);

        startActivity(intent);
        startActivity(intent2);

//        if(user) {
//            Intent intent = new Intent(this, Activity_A.class);
//        }
//        else if () {
//            startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://developer.android.com")));
//        }
//        else {
//            Intent intent = new Intent(this, Activity_B.class);
//        }

>>>>>>> c30d662c387083c28c185e85d85b05c6e340748a
    }

}

package com.example.homework_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText userInput;

        TextView tenPercentTip;
        TextView fifteenPercentTip;
        TextView twentyPercentTip;

        TextView customTip;

        TextView tenPercentTotal;
        TextView fifteenPercentTotal;
        TextView twentyPercentTotal;
        TextView customTipTotal;

        tenPercentTip = findViewById(R.id.ten_percent_tip);
        tenPercentTotal = findViewById(R.id.ten_percent_total);

        fifteenPercentTip = findViewById(R.id.fifteen_percent_tip);
        fifteenPercentTotal = findViewById(R.id.fifteen_percent_total);

        twentyPercentTip = findViewById(R.id.twenty_percent_tip);
        twentyPercentTotal = findViewById(R.id.twenty_percent_total);

        userInput = findViewById(R.id.user_input);
        String userInputString = userInput.getText().toString();
//        Double.parseDouble(userInputString);



//
//    private double userInputDoubleFifteen;
//    private double userInputDoubleFifteenTotal;

//    protected void fifteenCalculation(double userInputDouble) {
//        userInputDoubleFifteen = userInputDouble * .15;
//        fifteenPercentTip.setText(Double.toString(userInputDoubleFifteen));
//
//        userInputDoubleFifteenTotal = userInputDouble + userInputDoubleFifteen;
//        fifteenPercentTotal.setText(Double.toString(userInputDoubleFifteenTotal));
//    }

    }
}

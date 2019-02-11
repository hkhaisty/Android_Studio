package com.example.homework_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText userInput;

        final TextView tenPercentTip;
        final TextView fifteenPercentTip;
        final TextView twentyPercentTip;

        TextView customTip;

        final TextView tenPercentTotal;
        final TextView fifteenPercentTotal;
        final TextView twentyPercentTotal;
        TextView customTipTotal;

        calculate = findViewById(R.id.calcButton);

        tenPercentTip = findViewById(R.id.ten_percent_tip);
        tenPercentTotal = findViewById(R.id.ten_percent_total);

        fifteenPercentTip = findViewById(R.id.fifteen_percent_tip);
        fifteenPercentTotal = findViewById(R.id.fifteen_percent_total);

        twentyPercentTip = findViewById(R.id.twenty_percent_tip);
        twentyPercentTotal = findViewById(R.id.twenty_percent_total);

        userInput = findViewById(R.id.user_input);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userString = userInput.toString();
                double userDouble = Double.parseDouble(userString);

                double tenDouble = tenPercent(userDouble);
                double finalTen = tenDouble + userDouble;

                String tenDoubleString = Double.toString(tenDouble);
                String finalTenString = Double.toString(finalTen);

                tenPercentTip.setText(tenDoubleString);
                tenPercentTotal.setText(finalTenString);

                double fifteenDouble = fifteenPercent(userDouble);
                double finalFifteen = fifteenDouble + userDouble;

                String fifteenDoubleString = Double.toString(fifteenDouble);
                String finalFifteenString = Double.toString(finalFifteen);

                fifteenPercentTip.setText(fifteenDoubleString);
                fifteenPercentTotal.setText(finalFifteenString);

                double twentyDouble = twentyPercent(userDouble);
                double finalTwenty = twentyDouble + userDouble;

                String twentyDoubleString = Double.toString(twentyDouble);
                String finalTwentyString = Double.toString(finalTwenty);

                twentyPercentTip.setText(twentyDoubleString);
                twentyPercentTotal.setText(finalTwentyString);
            }


            protected double tenPercent(double userDouble) {
                double userTip = userDouble * .10;

                return userTip;
            }

            protected double fifteenPercent(double userDouble) {
                double userTip = userDouble * .15;

                return userTip;
            }

            protected double twentyPercent(double userDouble) {
                double userTip = userDouble * .20;

                return userTip;
            }
        });


    }
}

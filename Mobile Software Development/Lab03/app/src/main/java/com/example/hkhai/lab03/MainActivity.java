package com.example.hkhai.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double pizzaPrice = 5.00;
    TextView priceTextView = findViewById(R.id.priceText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onCheckChanged(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.fetacheckbox:
                if (checked) {
                    pizzaPrice += .50;
                    priceTextView.setText(Double.toString(pizzaPrice));
                } else {
                    pizzaPrice += 0;
                    priceTextView.setText(Double.toString(pizzaPrice));
                }
                break;

            case R.id.blackolivescheckbox:
                if (checked) {
                    pizzaPrice += .50;
                    priceTextView.setText(Double.toString(pizzaPrice));
                } else {
                    pizzaPrice += 0;
                    priceTextView.setText(Double.toString(pizzaPrice));
                }
                break;

            case R.id.onionscheckbox:
                if (checked) {
                    pizzaPrice += .50;
                    priceTextView.setText(Double.toString(pizzaPrice));
                } else {
                    pizzaPrice += 0;
                    priceTextView.setText(Double.toString(pizzaPrice));
                }
                break;

            case R.id.spinaichcheckbox:
                if (checked) {
                    pizzaPrice += .50;
                    priceTextView.setText(Double.toString(pizzaPrice));
                } else {
                    pizzaPrice += 0;
                    priceTextView.setText(Double.toString(pizzaPrice));
                }
                break;
        }
    }

    public void onCrustButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.crispyradio:
                if (checked) {
                    pizzaPrice += 0;
                    priceTextView.setText(Double.toString(pizzaPrice));
                }
                break;

            case R.id.thickradio:
                if (checked) {
                    pizzaPrice += 2.50;
                    priceTextView.setText(Double.toString(pizzaPrice));
                }
                break;

            case R.id.soggyradio:
                if (checked) {
                    pizzaPrice += 5.00;
                    priceTextView.setText(Double.toString(pizzaPrice));
                }
                break;
        }
    }

    public void onDeliveryButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.pickupButton:
                if (checked) {
                    pizzaPrice += 0;
                    priceTextView.setText(Double.toString(pizzaPrice));
                }
                break;

            case R.id.dineInButton:
                if (checked) {
                    pizzaPrice += 0;
                    priceTextView.setText(Double.toString(pizzaPrice));
                }
                break;
            case R.id.deliverButton:
                if (checked) {
                    pizzaPrice += 3.00;
                    priceTextView.setText(Double.toString(pizzaPrice));
                }
                break;
        }
    }

    public void onSeekBarChange(SeekBar.OnSeekBarChangeListener L)
    {

    }
}

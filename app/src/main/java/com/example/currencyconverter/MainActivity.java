package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void currencyConverter(View view){

        Log.i("Info", "Button Pressed!");

        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);

        String amountInRupee = editText.getText().toString();
        double amountInRupeeDouble = Double.parseDouble(amountInRupee);

        double amountInDollar = amountInRupeeDouble /64.0;

        String amountInDollarString = String.format("%.2f", amountInDollar);

        Toast.makeText(this, "" +amountInRupee+ " Rupees = " +amountInDollarString + "$", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view)
    {
        Log.i("Info","Button pressed!");
        ImageView image = (ImageView) findViewById(R.id.currencyImageView);
        EditText currencyDollars = (EditText) findViewById(R.id.currencyEditTextNumberDecimal);
        double currencyRupees = Double.parseDouble(currencyDollars.getText().toString())*74.81;
        Toast.makeText(this, String.format( "%.2f", currencyRupees) + " Rupees", Toast.LENGTH_LONG).show();
        image.setImageResource(R.drawable.rupees);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

package com.example.abdulbasitmehtab.dollarstorupeesconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText n;
    Button convert;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n = (EditText) findViewById(R.id.etAmount);
        convert = (Button) findViewById(R.id.btConvert);
        result = (TextView) findViewById(R.id.tvResult);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = n.getText().toString();
                double num = Double.parseDouble(value);

                double finalValue = num * 105.41;
                result.setText("" + finalValue);
            }
        });
    }
}

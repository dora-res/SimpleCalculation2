package com.example.simplecalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNumber, secondNumber;
    Button addButton, subButton, mulButton, divButton;
    TextView appText, enterText, chooseText, resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        addButton = findViewById(R.id.add);
        subButton = findViewById(R.id.sub);
        mulButton = findViewById(R.id.mul);
        divButton = findViewById(R.id.div);
        appText = findViewById(R.id.app);
        enterText = findViewById(R.id.enter);
        chooseText = findViewById(R.id.choose);
        resultText = findViewById(R.id.result);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(firstNumber.getText().toString());
                double n2 = Double.parseDouble(secondNumber.getText().toString());
                double result = n1+n2;
                resultText.setText(Double.valueOf(result).toString());
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(firstNumber.getText().toString());
                double n2 = Double.parseDouble(secondNumber.getText().toString());
                double result = n1-n2;
                resultText.setText(Double.valueOf(result).toString());
            }
        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(firstNumber.getText().toString());
                double n2 = Double.parseDouble(secondNumber.getText().toString());
                double result = n1*n2;
                resultText.setText(Double.valueOf(result).toString());
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(firstNumber.getText().toString());
                double n2 = Double.parseDouble(secondNumber.getText().toString());
                double result = n1/n2;
                resultText.setText(Double.valueOf(result).toString());
            }
        });

    }
}
package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FactorialActivity extends AppCompatActivity implements View.OnClickListener {

    EditText inputNumber;
    Button calculateButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);

        inputNumber = findViewById(R.id.input_number);
        calculateButton = findViewById(R.id.calculate_button);
        resultTextView = findViewById(R.id.result_text_view);

        calculateButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.calculate_button) {
            String input = inputNumber.getText().toString().trim();
            if (!input.isEmpty()) {
                int number = Integer.parseInt(input);
                long factorial = calculateFactorial(number);
                resultTextView.setText(String.valueOf(factorial));
            }
        }
    }

    private long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

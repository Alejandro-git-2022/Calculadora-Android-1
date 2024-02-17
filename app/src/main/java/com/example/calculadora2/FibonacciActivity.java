package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FibonacciActivity extends AppCompatActivity {

    EditText inputNumberEditText;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        inputNumberEditText = findViewById(R.id.input_number_edit_text);
        resultTextView = findViewById(R.id.result_text_view);
    }

    // Método para calcular el número de Fibonacci
    public void calculateFibonacci(View view) {
        String input = inputNumberEditText.getText().toString();
        if (!input.isEmpty()) {
            int n = Integer.parseInt(input);
            int fibonacci = fibonacci(n);
            resultTextView.setText("Fibonacci(" + n + ") = " + fibonacci);
        } else {
            resultTextView.setText("Ingrese un número");
        }
    }

    // Método recursivo para calcular el número de Fibonacci
    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

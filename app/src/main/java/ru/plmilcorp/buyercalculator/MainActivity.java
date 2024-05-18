package ru.plmilcorp.buyercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        EditText priceElement1 = findViewById(R.id.editText);
        String priceString1 = priceElement1.getText().toString();


        EditText quantityElement1 = findViewById(R.id.editTextNumber2);
        String quantityString1 = quantityElement1.getText().toString();


        EditText priceElement2 = findViewById(R.id.editTextNumber4);
        String priceString2 = priceElement2.getText().toString();


        EditText quantityElement2 = findViewById(R.id.editTextNumber);
        String quantityString2 = quantityElement2.getText().toString();

        if(priceString1.isEmpty() || quantityString1.isEmpty() || priceString2.isEmpty() || quantityString2.isEmpty()){
            return;
        }

        float price1 = Float.parseFloat(priceString1);
        float quantity1 = Float.parseFloat(quantityString1);
        float price2 = Float.parseFloat(priceString2);
        float quantity2 = Float.parseFloat(quantityString2);

        float result1 = price1 / quantity1;
        float result2 = price2 / quantity2;

        TextView textView1 = findViewById(R.id.textView7);
        TextView textView2 = findViewById(R.id.textView14);

        textView1.setText(String.valueOf(result1));
        textView2.setText(String.valueOf(result2));

    }
}
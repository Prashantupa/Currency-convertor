package com.example.udemypro3cc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        EditText dollarAmountText = (EditText) findViewById(R.id.dollarAmountEditText);
        Double dollarAmountDouble = Double.parseDouble(dollarAmountText.getText().toString());
        Double indianAmount = dollarAmountDouble * 69.39;

        Toast.makeText(MainActivity.this, " Rs " + indianAmount.toString(),Toast.LENGTH_LONG).show();


        Log.i("amount",dollarAmountText.getText().toString());



    }

    public void convert1(View view){
      EditText rupeeAmountText = (EditText) findViewById(R.id.rupeeAmountEditText);
      Double rupeeAmountDouble = Double.parseDouble(rupeeAmountText.getText().toString());
      Double dollarAmount = rupeeAmountDouble / 69.39;

      Toast.makeText(MainActivity.this," In dollar " + dollarAmount.toString(),Toast.LENGTH_LONG).show();

      Log.i("Dollar",rupeeAmountText.getText().toString());

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}







package com.example.ticketsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PreviewActivity extends AppCompatActivity {
    private Button buttonReset;
    private TextView UserData;
    private  suchnost customer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        buttonReset = findViewById(R.id.buttonReset);
        UserData = findViewById(R.id.textView3);

        Bundle bundle = getIntent().getExtras();
        customer = (suchnost)bundle.getSerializable("argument");

        UserData.setText("Ваш ID: " + customer.getID() + "\n" +
                "Ваше место: " + customer.getPlace() + "\n" +
                "Время отправления: " + customer.getOn() + "\n" +
                "Время прибытия: " + customer.getOff() + "\n" +
                "Стоимость: " + customer.getCash());

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReset = new Intent(getApplicationContext(), MainActivity.class);
                intentReset.addFlags(intentReset.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intentReset);
            }
        });
    }
}
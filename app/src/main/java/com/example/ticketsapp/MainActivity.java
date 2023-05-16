package com.example.ticketsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText userID;
    private EditText time;
    private EditText timeIn;
    private EditText place;
    private EditText cost;

    private Button buttonBegin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userID = findViewById(R.id.userID);
        place = findViewById(R.id.place);
        time = findViewById(R.id.time);
        timeIn = findViewById(R.id.timeIn);
        cost = findViewById(R.id.cost);

        buttonBegin = findViewById(R.id.button);
        buttonBegin.setOnClickListener(listener);
    }
    private View.OnClickListener listener= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String IDstr = userID.getText().toString();
            String PLACEstr = place.getText().toString();
            String ONstr =  time.getText().toString();
            String OFFstr = timeIn.getText().toString();
            String CASHstr =  cost.getText().toString();

            suchnost suchnost = new suchnost(IDstr, PLACEstr, ONstr, OFFstr, CASHstr);
            Intent intentBegin = new Intent(getApplicationContext(), PreviewActivity.class);
            intentBegin.putExtra("argument",suchnost );
            startActivity(intentBegin);

        }
    };
}
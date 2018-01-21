package com.example.riyoh.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    TextView today,date,temp,press,humidity,wind;

    private void setupView(){
//        today = findViewById(R.id.tvToday);
//        date  = findViewById(R.id.tvDate);
//        temp = findViewById(R.id.tvTemp);
//        press = findViewById(R.id.tvPress);
//        humidity = findViewById(R.id.tvHumidity);
//        wind = findViewById(R.id.tvWind);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }


}

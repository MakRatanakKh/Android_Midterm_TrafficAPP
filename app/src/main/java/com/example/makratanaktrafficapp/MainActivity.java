package com.example.makratanaktrafficapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.makratanaktrafficapp.adapter.CarAdapter;
import com.example.makratanaktrafficapp.model.CarModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<CarModel> modelList;
    private ListView lvCar;
    private CarAdapter adapter;
    private String[] longtitute;
    private String[] latitute;
    private String[] speed;

    private TextView tvMySpeed, tvMyLat, tvMyLong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modelList = new ArrayList<>();
        lvCar = findViewById(R.id.lv_car);
        tvMyLat = findViewById(R.id.my_lat);
        tvMyLong = findViewById(R.id.my_long);
        tvMySpeed = findViewById(R.id.my_speed);

        String[] latitute = {"11.634062", "11.634927", "11.636461", "11.638163", "11.640338", "11.643569", "11.644976"};
        String[] longtitute = {"104.921050", "104.900652", "104.920111", "104.919564", "104.918601", "104.917149", "104.916555"};
        String[] speed = {};
        for(int i = 0; i < 8; i++){
            int r = 1 + (int)(Math.random() * 50);
            String s = String.valueOf(r);
            speed[i] = s + " km/h";
        }

        tvMySpeed.setText(speed[0]);
        tvMyLat.setText(latitute[0]);
        tvMyLong.setText(longtitute[0]);

        for(int i = 1; i < 7; i++){
            CarModel c = new CarModel(latitute[i], longtitute[i], speed[i]);
            modelList.add(c);
        }

        adapter = new CarAdapter(MainActivity.this, modelList);
        lvCar.setAdapter(adapter);
    }
}

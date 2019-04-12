package com.example.displaycar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private EditText make,year,color,price,size;
    private Button car, diesel;
    private  String carvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       init();

    }

    private void init() {
        result = findViewById(R.id.result);
        make = findViewById(R.id.make);
        year = findViewById(R.id.year);
        color = findViewById(R.id.color);
        price = findViewById(R.id.price);
        size = findViewById(R.id.size);
        car = findViewById(R.id.car);
        diesel = findViewById(R.id.diesel);
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
               VehicleModel vm=new VehicleModel(make.getText().toString(),year.getText().toString(),
                       color.getText().toString(),price.getText().toString(),size.getText().toString());
                result.setText(vm.toString());

            }
        });

    }
}

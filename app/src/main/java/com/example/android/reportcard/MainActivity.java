package com.example.android.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void act2015(View view) {
        Intent record2015=new Intent(this,recordData2015.class);
        startActivity(record2015);
    }
    public void act2016(View view){
        Intent record2016=new Intent(this,recordData2016.class);
        startActivity(record2016);
    }
    public void act2017(View view){
        Intent record2017=new Intent(this,recordData2017.class);
        startActivity(record2017);
    }
    public void act2018(View view){
        Intent record2018=new Intent(this,recordData2018.class);
        startActivity(record2018);
    }
    public void act2019(View view){
        Intent record2018=new Intent(this,recordData2019.class);
        startActivity(record2018);
    }

}
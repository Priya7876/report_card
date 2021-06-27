package com.example.android.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class recordData2017 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_data2017);
        ArrayList<RECORD>
                makeRecord=new ArrayList<RECORD>();
        makeRecord.add(new RECORD(1701,"A"));
        makeRecord.add(new RECORD(1702,"B"));
        makeRecord.add(new RECORD(1703,"A++"));
        makeRecord.add(new RECORD(1704,"C"));
        makeRecord.add(new RECORD(1705,"A"));
        makeRecord.add(new RECORD(1706,"D"));
        makeRecord.add(new RECORD(1707,"F"));
        makeRecord.add(new RECORD(1708,"B"));
        makeRecord.add(new RECORD(1709,"A"));
        makeRecord.add(new RECORD(1710,"B++"));

        recordAdapter adapterR= new recordAdapter(this,0,makeRecord);
        ListView getRecord=(ListView)findViewById(R.id.recordroot2017);
        getRecord.setAdapter(adapterR);
    }
}
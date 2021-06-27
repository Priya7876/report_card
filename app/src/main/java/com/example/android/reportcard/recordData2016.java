package com.example.android.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class recordData2016 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_data2016);
        ArrayList<RECORD>
                makeRecord=new ArrayList<RECORD>();
        makeRecord.add(new RECORD(1601,"A++"));
        makeRecord.add(new RECORD(1602,"C"));
        makeRecord.add(new RECORD(1603,"B++"));
        makeRecord.add(new RECORD(1604,"D"));
        makeRecord.add(new RECORD(1605,"A"));
        makeRecord.add(new RECORD(1606,"E"));
        makeRecord.add(new RECORD(1607,"F"));
        makeRecord.add(new RECORD(1608,"A"));
        makeRecord.add(new RECORD(1609,"B"));
        makeRecord.add(new RECORD(1610,"A++"));

        recordAdapter adapterR= new recordAdapter(this,0,makeRecord);
        ListView getRecord=(ListView)findViewById(R.id.recordroot2016);
        getRecord.setAdapter(adapterR);
    }
}
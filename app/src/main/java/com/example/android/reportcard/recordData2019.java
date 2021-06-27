package com.example.android.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class recordData2019 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_data2019);
        ArrayList<RECORD>
                makeRecord=new ArrayList<RECORD>();
        makeRecord.add(new RECORD(1901,"C"));
        makeRecord.add(new RECORD(1902,"F"));
        makeRecord.add(new RECORD(1903,"A+"));
        makeRecord.add(new RECORD(1904,"A++"));
        makeRecord.add(new RECORD(1905,"A"));
        makeRecord.add(new RECORD(1906,"B"));
        makeRecord.add(new RECORD(1907,"F"));
        makeRecord.add(new RECORD(1908,"B"));
        makeRecord.add(new RECORD(1909,"A"));
        makeRecord.add(new RECORD(1910,"B++"));

        recordAdapter adapterR= new recordAdapter(this,0,makeRecord);
        ListView getRecord=(ListView)findViewById(R.id.recordroot2019);
        getRecord.setAdapter(adapterR);
    }
}
package com.example.android.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class recordData2015 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_data2015);
        ArrayList<RECORD>
                makeRecord=new ArrayList<RECORD>();
        makeRecord.add(new RECORD(1501,"A"));
        makeRecord.add(new RECORD(1502,"B"));
        makeRecord.add(new RECORD(1503,"A++"));
        makeRecord.add(new RECORD(1504,"C"));
        makeRecord.add(new RECORD(1505,"A"));
        makeRecord.add(new RECORD(1506,"D"));
        makeRecord.add(new RECORD(1507,"F"));
        makeRecord.add(new RECORD(1508,"B"));
        makeRecord.add(new RECORD(1509,"A"));
        makeRecord.add(new RECORD(1510,"B++"));

   recordAdapter adapterR= new recordAdapter(this,0,makeRecord);
        ListView getRecord=(ListView)findViewById(R.id.recordroot2015);
        getRecord.setAdapter(adapterR);
    }
}
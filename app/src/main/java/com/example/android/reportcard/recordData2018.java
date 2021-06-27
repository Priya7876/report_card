package com.example.android.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class recordData2018 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_data2018);
        ArrayList<RECORD>
                makeRecord=new ArrayList<RECORD>();
        makeRecord.add(new RECORD(1801,"A"));
        makeRecord.add(new RECORD(1802,"B++"));
        makeRecord.add(new RECORD(1803,"A++"));
        makeRecord.add(new RECORD(1804,"B"));
        makeRecord.add(new RECORD(1805,"F"));
        makeRecord.add(new RECORD(1806,"D"));
        makeRecord.add(new RECORD(1807,"A++"));
        makeRecord.add(new RECORD(1808,"C"));
        makeRecord.add(new RECORD(1809,"E"));
        makeRecord.add(new RECORD(1810,"B++"));

        recordAdapter adapterR= new recordAdapter(this,0,makeRecord);
        ListView getRecord=(ListView)findViewById(R.id.recordroot2018);
        getRecord.setAdapter(adapterR);
    }
}
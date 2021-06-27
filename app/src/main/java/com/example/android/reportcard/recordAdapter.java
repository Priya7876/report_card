package com.example.android.reportcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class recordAdapter extends ArrayAdapter<RECORD> {

    public recordAdapter( Context context, int resource,  ArrayList<RECORD> makeRecord) {
        super(context, 0, makeRecord);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View list = convertView;
        if (list == null) {
list= LayoutInflater.from(getContext()).inflate(R.layout.recordlayout1,parent,false);
        }
        RECORD currentRecord = getItem(position);
        TextView rollno=(TextView)list.findViewById(R.id.rollno);
        rollno.setText(String.valueOf(currentRecord.getRoll_no()));
        TextView Grade=(TextView)list.findViewById(R.id.grade);
        Grade.setText(currentRecord.getGrade());
return list;
    }
}

package com.example.android.reportcard;

public class RECORD {
    private int Roll_no;
    private String grade;
    public RECORD(int m,String n){
        Roll_no=m;
        grade=n;
    }
    public int getRoll_no(){

        return Roll_no;
    }
    public String getGrade(){

        return grade;
    }
}

package com.example.myfileexplorer;

import android.widget.TextView;

public class ViewHolder {
    private TextView info;

    ViewHolder(TextView info){
        this.info = info;
    }

    public TextView getInfo(){
        return info;
    }
}

package com.example.user.events;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public  class SimpleViewHolder extends RecyclerView.ViewHolder{
    public TextView textView;
    public SimpleViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView;
    }
}


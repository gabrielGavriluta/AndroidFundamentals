package com.example.complexviews;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EventsViewHolder extends RecyclerView.ViewHolder {

    private TextView fstName;
    private TextView lstName;

    public EventsViewHolder(@NonNull View itemView) {
        super(itemView);
        fstName = itemView.findViewById(R.id.firstNameTxt);
        lstName = itemView.findViewById((R.id.lastNameTxt));
    }

    public TextView getFstName() {
        return fstName;
    }

    public void setFstName(TextView fstName) {
        this.fstName = fstName;
    }

    public TextView getLstName() {
        return lstName;
    }

    public void setLstName(TextView lstName) {
        this.lstName = lstName;
    }
}

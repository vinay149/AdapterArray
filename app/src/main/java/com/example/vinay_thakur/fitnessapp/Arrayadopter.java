package com.example.vinay_thakur.fitnessapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vinay_thakur on 5/19/2018.
 */

public class Arrayadopter extends ArrayAdapter<DataUser> {

    public Arrayadopter(Context context, ArrayList<DataUser> arrayList) {
        super(context,0,arrayList);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        DataUser user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.textView);
        TextView tvHome = (TextView) convertView.findViewById(R.id.textView2);
        ImageView imageView=(ImageView)convertView.findViewById(R.id.image1);
        // Populate the data into the template view using the data object
        tvName.setText(user.name);
        tvHome.setText(user.id);
        imageView.setImageResource(user.img);
        // Return the completed view to render on screen
        return convertView;
    }
}

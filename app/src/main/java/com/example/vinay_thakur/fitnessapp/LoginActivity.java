package com.example.vinay_thakur.fitnessapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        String array[]={"vinay","cc"};
        ArrayList<DataUser> arrayList=DataUser.getUsers( );
        Arrayadopter adapter=new Arrayadopter(this,arrayList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }



}

package com.example.vinay_thakur.fitnessapp;
import android.widget.ImageView;

import java.util.ArrayList;
/**
 * Created by vinay_thakur on 5/19/2018.
 */
public class DataUser {
    String name;
    String id;
    int img;
    public DataUser(String vinay, String ddd , int img) {
        this.name=vinay;
        this.id=ddd;
        this.img =img;
    }
   String getVinay()
   {
       return name;
   }
   void setVinay(String name)
   {
       this.name=name;
   }
   int getImg()
   {
       return img;
   }
   public static ArrayList<DataUser> getUsers()
    {
        ArrayList<DataUser> users=new ArrayList<>();
        users.add(new DataUser("vinay","ddd",R.drawable.img));
        users.add(new DataUser("vinay","ddd",R.drawable.img));
        users.add(new DataUser("vinay","ddd",R.drawable.img));
        users.add(new DataUser("vinay","ddd",R.drawable.img));
        users.add(new DataUser("vinay","ddd",R.drawable.img));
        users.add(new DataUser("vinay","ddd",R.drawable.img));
        return  users;
    }
}

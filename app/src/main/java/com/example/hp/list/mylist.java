package com.example.hp.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] Product;
    private final String[] Price;
    private final String[] Weight;
   // private final Integer[] imgid;

    public MyListAdapter(Activity context, String[] Product,String[] Price,String[] Weight) {
        super(context, R.layout.activity_mylist, Product);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.Product=Product;
        this.Price=Price;
        this.Weight=Weight;
       // this.imgid=imgid;

    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_mylist, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.product);
        //ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.price);
        TextView subtitleText1 = (TextView) rowView.findViewById(R.id.weight);


        titleText.setText(Product[position]);
       // imageView.setImageResource(imgid[position]);
        subtitleText.setText(Price[position]);
        subtitleText1.setText(Weight[position]);

        return rowView;

    };
}
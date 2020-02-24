package edu.temple.md_assignment4;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;




public class CustomAdapter extends BaseAdapter {
        int simple_spinner_dropdown_item;
        String [] myStringArray;
        Context paletteActivity;
        public CustomAdapter(PaletteActivity paletteActivity, String[] myStringArray) {
            this.paletteActivity = paletteActivity;

            this.myStringArray = myStringArray;

        }


        @Override
        public int getCount () {
            return myStringArray.length;
        }

        @Override
        public Object getItem ( int position){
            return myStringArray[position];
        }

        @Override
        public long getItemId ( int position){
            return position;
        }

        @Override
        public View getView (int position, View convertView, ViewGroup parent){

            TextView tv = new TextView(paletteActivity);
            tv.setText(myStringArray[position]);
            tv.setBackgroundColor(Color.WHITE);


            return tv;
        }
        @Override
        public View getDropDownView ( int position,
                                      View convertView,
                                      ViewGroup parent){
            TextView tv = new TextView(paletteActivity);
            tv.setText(myStringArray[position]);
            tv.setBackgroundColor(Color.parseColor(myStringArray[position]));



            return tv;
        }

    }



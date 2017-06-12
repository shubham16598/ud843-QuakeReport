package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shubham16598 on 12/6/17.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        // Get the {@link Earthquake} object located at this position in the list
        Earthquake currentAndroidFlavor = getItem(position);


        TextView nameTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        nameTextView.setText(currentAndroidFlavor.getmMagnitude());



        TextView numberTextView = (TextView) listItemView.findViewById(R.id.location);
        numberTextView.setText(currentAndroidFlavor.getmLocation());


        TextView numberdateTextView = (TextView) listItemView.findViewById(R.id.date);
        numberdateTextView.setText(currentAndroidFlavor.getmLocation());


        return listItemView;

    }
}

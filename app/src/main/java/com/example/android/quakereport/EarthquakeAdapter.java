package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/*
 * {@link EarthquakeAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link SearchHistory} objects.
 * */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context             The current context. Used to inflate the layout file.
     * @param earthquakeArrayList A List of SearchHistory objects to display in a list
     */
    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakeArrayList) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, earthquakeArrayList);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_item, parent, false);
        }

        // Get the {@link SearchHistory} object located at this position in the list
        Earthquake earthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView magTextView = (TextView) listItemView.findViewById(R.id.mag);
        // Get the  mag from the current earthquake object and
        // set this text on the name TextView
        if (earthquake != null) {
            magTextView.setText(""+earthquake.getmMag());
        } else {
            magTextView.setText("mag is null");

        }


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView locTextView = (TextView) listItemView.findViewById(R.id.location);
        // Get the version name from the current SearchHistory object and
        // set this text on the name TextView
        if (earthquake != null) {
            locTextView.setText(earthquake.getmLocation());
        } else {
            locTextView.setText("loc is null");

        }

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        // Get the date from the current earthquake object and
        // set this text on the name TextView
        if (earthquake != null) {
            dateTextView.setText(earthquake.getmDate());
        } else {
            dateTextView.setText("date is null");

        }


//        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
//        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
//        // Get the image resource ID from the current SearchHistory object and
//        // set the image to iconView
//        iconView.setImageResource(earthquake.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }

}

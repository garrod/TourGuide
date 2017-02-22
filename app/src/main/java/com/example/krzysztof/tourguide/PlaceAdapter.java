package com.example.krzysztof.tourguide;

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
 * Created by krzysztof on 22.02.2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> resource) {
        super(context, 0);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.place_list_element, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
        placeName.setText(currentPlace.getName());

        ImageView imagesrc = (ImageView) listItemView.findViewById(R.id.image);
        imagesrc.setImageResource(currentPlace.getImagePlace());

        return listItemView;
    }
}

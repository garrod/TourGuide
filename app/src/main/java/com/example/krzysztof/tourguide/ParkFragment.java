package com.example.krzysztof.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by krzysztof on 22.02.2017.
 */

public class ParkFragment extends Fragment {

    public ParkFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = DataSource.getParksList();

        PlaceAdapter placesAdapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place place = places.get(position);

                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra("place", place);
                startActivity(intent);
            }
        });

        return rootView;
    }
}

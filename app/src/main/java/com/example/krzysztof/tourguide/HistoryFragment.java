package com.example.krzysztof.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by krzysztof on 22.02.2017.
 */

public class HistoryFragment extends Fragment {

    // empty public constructor
    public HistoryFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.history_fragment, container, false);

        return rootView;
    }
}

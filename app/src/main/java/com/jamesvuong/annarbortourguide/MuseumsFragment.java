package com.jamesvuong.annarbortourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        ArrayList<CityAttraction> cityAttractionsList = new ArrayList<CityAttraction>();
        cityAttractionsList.add(new CityAttraction(getString(R.string.museum_1), getString(R.string.museum_1_address), R.drawable.hands_on_logo));
        cityAttractionsList.add(new CityAttraction(getString(R.string.museum_2), getString(R.string.museum_2_address), R.drawable.um_museum_of_natural_history_newlogo));
        cityAttractionsList.add(new CityAttraction(getString(R.string.museum_3), getString(R.string.museum_3_address), R.drawable.umma_logo));
        cityAttractionsList.add(new CityAttraction(getString(R.string.museum_4), getString(R.string.museum_4_address), R.drawable.leslie_logo));

        CityAttractionAdapter itemsAdapter = new CityAttractionAdapter(getContext(), cityAttractionsList);

        ListView listView = (ListView) rootView.findViewById(R.id.attractions_list_view);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}

package com.jamesvuong.annarbortourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        ArrayList<CityAttraction> cityAttractionsList = new ArrayList<CityAttraction>();
        cityAttractionsList.add(new CityAttraction("Zingerman’s Delicatessen", "422 Detroit St"));
        cityAttractionsList.add(new CityAttraction("Frita Batidos", "117 W Washington St"));
        cityAttractionsList.add(new CityAttraction("Jolly Pumpkin Cafe & Brewery", "311 S Main St"));
        cityAttractionsList.add(new CityAttraction("Sava's", "216 S State St"));
        cityAttractionsList.add(new CityAttraction("Mani Osteria & Bar", "341 E Liberty St"));
        cityAttractionsList.add(new CityAttraction("Tomukun Noodle Bar", "505 E Liberty St"));
        cityAttractionsList.add(new CityAttraction("Isalita", "341 E Liberty St"));

        CityAttractionAdapter itemsAdapter = new CityAttractionAdapter(getContext(), cityAttractionsList);

        ListView listView = (ListView) rootView.findViewById(R.id.attractions_list_view);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}

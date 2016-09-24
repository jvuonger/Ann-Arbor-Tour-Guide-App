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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        ArrayList<CityAttraction> cityAttractionsList = new ArrayList<CityAttraction>();
        cityAttractionsList.add(new CityAttraction("Ann Arbor Hands-On Museum", "220 E Ann St", R.drawable.hands_on_logo));
        cityAttractionsList.add(new CityAttraction("UofM Museum of Natural History", "1109 Geddes Ave", R.drawable.um_museum_of_natural_history_newlogo));
        cityAttractionsList.add(new CityAttraction("UofM Museum of Art", "525 S State St", R.drawable.umma_logo));
        cityAttractionsList.add(new CityAttraction("Leslie Science Center", "1831 Traver Rd", R.drawable.leslie_logo));

        CityAttractionAdapter itemsAdapter = new CityAttractionAdapter(getContext(), cityAttractionsList);

        ListView listView = (ListView) rootView.findViewById(R.id.attractions_list_view);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}

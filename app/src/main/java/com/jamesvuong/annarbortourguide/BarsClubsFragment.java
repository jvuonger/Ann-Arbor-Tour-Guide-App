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
public class BarsClubsFragment extends Fragment {


    public BarsClubsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        ArrayList<CityAttraction> cityAttractionsList = new ArrayList<CityAttraction>();
        cityAttractionsList.add(new CityAttraction("The Last Word", "301 W Huron St"));
        cityAttractionsList.add(new CityAttraction("Wolverine State Brewing", "2019 W Stadium"));
        cityAttractionsList.add(new CityAttraction("Ashley's", "338 S State St"));
        cityAttractionsList.add(new CityAttraction("Bill's Beer Garden", "210 S Ashley St"));
        cityAttractionsList.add(new CityAttraction("The Beer Grotto", "303 S Ashley St"));
        cityAttractionsList.add(new CityAttraction("Arbor Brewing Company", "114 E Washington St"));
        cityAttractionsList.add(new CityAttraction("Fraser's Pub", "114 E Washington St"));
        cityAttractionsList.add(new CityAttraction("Conor O'Neill's", "318 S Main St"));

        CityAttractionAdapter itemsAdapter = new CityAttractionAdapter(getContext(), cityAttractionsList);

        ListView listView = (ListView) rootView.findViewById(R.id.attractions_list_view);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}

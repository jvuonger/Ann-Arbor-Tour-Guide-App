package com.jamesvuong.annarbortourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        ArrayList<CityAttraction> cityAttractionsList = new ArrayList<CityAttraction>();
        cityAttractionsList.add(new CityAttraction("Gallup Park", "3000 Fuller Rd"));
        cityAttractionsList.add(new CityAttraction("Bandemer Park", "1352 Lake Shore Dr"));
        cityAttractionsList.add(new CityAttraction("Argo Nature Area", "1055 Longshore Dr"));
        cityAttractionsList.add(new CityAttraction("Furstenberg Nature Area", "2728 Fuller Rd"));
        cityAttractionsList.add(new CityAttraction("Nichols Arboretum", "1610 Washington Hts"));
        cityAttractionsList.add(new CityAttraction("County Farm Park", "2230 Platt Rd"));
        cityAttractionsList.add(new CityAttraction("Island Park", "1425 Island Dr"));

        CityAttractionAdapter itemsAdapter = new CityAttractionAdapter(getContext(), cityAttractionsList);

        ListView listView = (ListView) rootView.findViewById(R.id.attractions_list_view);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}

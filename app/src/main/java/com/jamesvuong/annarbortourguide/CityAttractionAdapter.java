package com.jamesvuong.annarbortourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by jvuonger on 9/23/16.
 */

public class CityAttractionAdapter extends ArrayAdapter<CityAttraction> {

    private ArrayList<CityAttraction> mCityAttractionsList;

    public CityAttractionAdapter(Context context, ArrayList<CityAttraction> attractions) {
        super(context, 0, attractions);
        mCityAttractionsList = attractions;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        CityAttraction cityAttraction = getItem(position);

        TextView tvAttractionName = (TextView) listItemView.findViewById(R.id.attraction_name);
        tvAttractionName.setText(cityAttraction.getName());

        TextView tvAttractionAddress = (TextView) listItemView.findViewById(R.id.attraction_address);
        tvAttractionAddress.setText(cityAttraction.getAddress());

        return listItemView;
    }
}

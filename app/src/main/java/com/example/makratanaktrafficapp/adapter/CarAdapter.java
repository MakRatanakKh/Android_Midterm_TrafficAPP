package com.example.makratanaktrafficapp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.makratanaktrafficapp.R;
import com.example.makratanaktrafficapp.model.CarModel;

import java.util.List;

public class CarAdapter extends BaseAdapter {
    private Context context;
    private List<CarModel> modelList;

    public CarAdapter(Context context, List<CarModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }


    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        return modelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.item_listview, null);
        TextView tvLatitute = v.findViewById(R.id.the_lat);
        TextView tvLongtitute = v.findViewById(R.id.the_long);
        TextView tvSpeed = v.findViewById(R.id.the_speed);

        CarModel model = modelList.get(position);
        tvLatitute.setText(model.getLatitute());
        tvLongtitute.setText(model.getLongtitute());
        tvSpeed.setText(model.getSpeed());

        return v;

    }
}

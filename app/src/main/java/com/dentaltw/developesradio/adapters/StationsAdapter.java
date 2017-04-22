package com.dentaltw.developesradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.dentaltw.developesradio.R;
import com.dentaltw.developesradio.activities.MainActivity;
import com.dentaltw.developesradio.holders.StationViewHolder;
import com.dentaltw.developesradio.models.Station;

import java.util.ArrayList;

/**
 * Created by Scott on 2017/4/22.
 */

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {
    private ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public int getItemCount() {
        return stations.size();
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {
        final Station station = stations.get(position);
        holder.updateUI(station);

        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                MainActivity.getMainActivity().loadDetailsScreen(station);
            }
        });
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station, parent, false);
        return new StationViewHolder(stationCard);
    }
}

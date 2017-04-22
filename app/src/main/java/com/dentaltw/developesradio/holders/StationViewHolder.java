package com.dentaltw.developesradio.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.dentaltw.developesradio.R;
import com.dentaltw.developesradio.models.Station;

/**
 * Created by Scott on 2017/4/22.
 */

public class StationViewHolder extends RecyclerView.ViewHolder {
    private ImageView mainImage;
    private TextView titleTextView;

    public StationViewHolder(View itemView) {
        super(itemView);

        this.mainImage = (ImageView) itemView.findViewById(R.id.main_image);
        this.titleTextView = (TextView) itemView.findViewById(R.id.main_text);
    }

    public void updateUI(Station station){
        String uri = station.getImgUri();
        int resource = mainImage.getResources().getIdentifier(uri, null, mainImage.getContext().getPackageName());
        mainImage.setImageResource(resource);
        titleTextView.setText(station.getStationTitle());
    }
}

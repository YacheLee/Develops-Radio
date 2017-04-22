package com.dentaltw.developesradio.services;

import com.dentaltw.developesradio.models.Station;

import java.util.ArrayList;

/**
 * Created by Scott on 2017/4/22.
 */

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Station> getFeaturedStations(){
        return getData();
    }

    public ArrayList<Station> getRecentStations(){
        return getData();
    }

    public ArrayList<Station> getPartyStations(){
        return getData();
    }

    private ArrayList<Station> getData(){
        ArrayList<Station> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(new Station("Flight plan (Tunas for Travel)","flightplanmusic"));
            list.add(new Station("Two-Wheelin (Biking list)","bicyclemusic"));
            list.add(new Station("Kids Jams (Music for children)","kidsmusic"));
            list.add(new Station("Kids Jams (Music for children)","vinylmusic"));
            list.add(new Station("Kids Jams (Music for children)","socialmusic"));
        }
        return list;
    }
}
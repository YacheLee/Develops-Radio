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
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight plan (Tunas for Travel)","flightmdramsic"));
        list.add(new Station("Two-Wheelin (Biking list)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for children)","kidsmusic"));
        list.add(new Station("Flight plan (Tunas for Travel)","flightmdramsic"));
        list.add(new Station("Two-Wheelin (Biking list)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for children)","kidsmusic"));
        list.add(new Station("Flight plan (Tunas for Travel)","flightmdramsic"));
        list.add(new Station("Two-Wheelin (Biking list)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for children)","kidsmusic"));
        list.add(new Station("Flight plan (Tunas for Travel)","flightmdramsic"));
        list.add(new Station("Two-Wheelin (Biking list)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for children)","kidsmusic"));
        return list;
    }

    public ArrayList<Station> getRecentStations(){
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight plan (Tunas for Travel)","flightmdramsic"));
        list.add(new Station("Two-Wheelin (Biking list)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for children)","kidsmusic"));
        return list;
    }

    public ArrayList<Station> getPartyStations(){
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight plan (Tunas for Travel)","flightmdramsic"));
        list.add(new Station("Two-Wheelin (Biking list)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for children)","kidsmusic"));
        return list;
    }
}

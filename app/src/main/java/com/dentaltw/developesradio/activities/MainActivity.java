package com.dentaltw.developesradio.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import com.dentaltw.developesradio.R;
import com.dentaltw.developesradio.fragments.DetailsFragment;
import com.dentaltw.developesradio.fragments.MainFragment;
import com.dentaltw.developesradio.models.Station;

public class MainActivity extends AppCompatActivity {
    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    public static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }

    private static MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity.setMainActivity(this);

        FragmentManager fm = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment) fm.findFragmentById(R.id.container_main);
        if(mainFragment==null){
            mainFragment = MainFragment.newInstance("blash", "talk");
            fm.beginTransaction().add(R.id.container_main,mainFragment).commit();
        }
    }

    public void loadDetailsScreen(Station selectedStation){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_main,new DetailsFragment())
                .addToBackStack(null)
                .commit();
    }
}

package vn.edu.usth.weather;

import android.graphics.Color;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.google.android.material.tabs.TabLayout;

public class WeatherAndForecastFragment extends AppCompatActivity {
    private TabLayout mTablayout;
    private ViewPager mViewpager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_weather_and_forecast);

        mTablayout = findViewById(R.id.tab_layout);
        mViewpager = findViewById(R.id.view_pager);

        Myadapter myadapter = new Myadapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewpager.setAdapter(myadapter);
        mTablayout.setupWithViewPager(mViewpager);



    }
}
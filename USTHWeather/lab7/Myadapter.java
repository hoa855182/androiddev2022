package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Myadapter extends FragmentStatePagerAdapter {

    public Myadapter(@NonNull FragmentManager fm, int behavior){

        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new WeatherFragment();
            case 1:
                return new ForecastFragment();
            case 2:
                return new WeatherFragment();
            default:
                return new ForecastFragment();
        }
    }



    @Override
    public int getCount() {

        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title ="";
        switch (position){
            case 0:

                title ="weather fragment";
                break;
            case 1:
                title = "forecast fragment";
                break;
            case 2:
                title ="weather fragment";
                break;
            default:
                title="forecast fragment";
                break;
        }
        return super.getPageTitle(position);
    }
}

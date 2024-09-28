package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class weatherAdapter extends FragmentPagerAdapter {

    public weatherAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @NonNull
    @Override
    public Fragment getItem(int page) {
        switch (page) {
            case 0: return new WeatherFragment();
            case 1: return new ForecastFragment();
        }
        return new EmptyFragment();
    }
    @Override
    public CharSequence getPageTitle(int page) {
        final String[] titles = new String[] { "Weather", "Forecast"};
        return titles[page];
    }
}
package comvoroninlevan.instagram.www.saintpetersburgcityguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Леван on 31.08.2016.
 */
public class MainPageAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public MainPageAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new MuseumsFragment();
        } else if (position == 1){
            return new PalacesFragment();
        } else if (position == 2){
            return new ReligionFragment();
        } else {
            return new TheatreFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.tab_museum);
        } else if (position == 1) {
            return mContext.getString(R.string.tab_palace);
        } else if (position == 2) {
            return mContext.getString(R.string.tab_religion);
        } else {
            return mContext.getString(R.string.tab_theatre);
        }
    }
}

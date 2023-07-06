package com.app.socilon.adpters;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.app.socilon.fragments.events.My_Events_Fragment;
import com.app.socilon.fragments.events.Past_Events_Fragment;
import com.app.socilon.fragments.events.UpcomingEventsFragment;

import java.util.ArrayList;
import java.util.List;

public class MyPagerAdapter extends FragmentStateAdapter {

    private List<Fragment> fragments;

    public MyPagerAdapter(Fragment fragment) {
        super(fragment);
        fragments = new ArrayList<>();
        fragments.add(new UpcomingEventsFragment());
        fragments.add(new Past_Events_Fragment());
        fragments.add(new My_Events_Fragment());
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }

    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }
}


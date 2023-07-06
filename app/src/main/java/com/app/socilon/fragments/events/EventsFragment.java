package com.app.socilon.fragments.events;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.app.socilon.R;
import com.app.socilon.adpters.HomeAdapter;
import com.app.socilon.adpters.MyPagerAdapter;
import com.app.socilon.adpters.ScreensAdapter;
import com.app.socilon.adpters.UpcomingAdapter;
import com.app.socilon.databinding.FragmentEventsBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;


public class EventsFragment extends Fragment implements ScreensAdapter.OnItemClick{
    FragmentEventsBinding eventsBinding;

    List<String> tabHeadingList = new ArrayList();




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        eventsBinding=FragmentEventsBinding.inflate(getLayoutInflater());

//        TabLayout.Tab tab1 = eventsBinding.tablayout.newTab().setText("Upcoming");
//        TabLayout.Tab tab2 = eventsBinding.tablayout.newTab().setText("Past Events");
//        TabLayout.Tab tab3 = eventsBinding.tablayout.newTab().setText("Past Events");
        tabHeadingList.add("Upcoming");
        tabHeadingList.add("Past Events");
        tabHeadingList.add("My Events");

        int betweenSpace = 100;

        ViewGroup slidingTabStrip = (ViewGroup) eventsBinding.tablayout.getChildAt(0);

        for(int i=0; i < eventsBinding.tablayout.getTabCount(); i++) {
            View tab = ((ViewGroup) eventsBinding.tablayout.getChildAt(0)).getChildAt(i);
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) tab.getLayoutParams();
            p.setMargins(20, 10, 20, 0);
            tab.requestLayout();
        }

//        eventsBinding.tablayout.addTab(tab1);
//        eventsBinding.tablayout.addTab(tab2);
//        eventsBinding.tablayout.addTab(tab3);

        return eventsBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        adapter(view);
        tabLayoutMethod();
        onClicks(view);
        cartNewList();
        findIds(view);
    }

    private void tabLayoutMethod() {

//        eventsBinding.tablayout.addTab(eventsBinding.tablayout.newTab().setText("Upcoming"));
//        eventsBinding.tablayout.addTab(eventsBinding.tablayout.newTab().setText("Past Events"));
//        eventsBinding.tablayout.addTab(eventsBinding.tablayout.newTab().setText("My Events"));

//        eventsBinding.tablayoutExploreScreen.setTabGravity(TabLayout.GRAVITY_FILL);
//
//        final PagerAdapter pagerAdapter=new Adaptor(getChildFragmentManager(),tablayout_ExploreScreen.getTabCount());
//        viewPager_ES.setAdapter(pagerAdapter);
//        viewPager_ES.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout_ExploreScreen));
//        eventsBinding.tablayoutExploreScreen.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager_ES));
//        animationApplier(tablayout_ExploreScreen);


        // Set up the ViewPager2 with the PagerAdapter
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(this);
        eventsBinding.viewPager.setAdapter(myPagerAdapter);

        // Connect the TabLayout to the ViewPager2
        new TabLayoutMediator(eventsBinding.tablayout, eventsBinding.viewPager, (tab, position) -> {
            tab.setText(tabHeadingList.get(position));
        }).attach();

    }
    public static class Adaptor extends FragmentStatePagerAdapter
    {

        private final int totalCount;

        public Adaptor(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);

            this.totalCount=behavior;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new UpcomingEventsFragment();
                case 1:
                    return new Past_Events_Fragment();
                case 2:
                    return new My_Events_Fragment();
                default:return null;
            }
        }

        @Override
        public int getCount() {
            return totalCount;
        }
    }


    private void animationApplier(TabLayout tabLayout) {
        tabLayout.setTranslationY(300);
        tabLayout.setAlpha(0);
        tabLayout.animate().translationY(0).alpha(1).setDuration(500).setStartDelay(100).start();

    }

    private void findIds(View view) {
//        tablayout_ExploreScreen=view.findViewById(R.id.tablayout_ExploreScreen);
//        viewPager_ES=view.findViewById(R.id.viewPager_ES);

    }

    private void cartNewList() {

    }
//
//    private void adapter(View view) {
//
//        UpcomingAdapter upcomingAdapter=new UpcomingAdapter();
//        eventsBinding.eventsUpcoming.setAdapter(upcomingAdapter);
//
//
//
//        ScreensAdapter adpaterlist=new ScreensAdapter(requireContext(), newlist,this);
//        eventsBinding.eventItemRecyclar.setAdapter(adpaterlist);
//    }

    private void onClicks(View view) {
//        newlist.add("Upcoming");
//        newlist.add("Past Events");
//        newlist.add("My Events");

    }

    @Override
    public void onClick(int position) {


    }
}
package com.app.socilon.fragments.home_fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.app.socilon.R;
import com.app.socilon.adpters.HomeAdapter;
import com.app.socilon.adpters.ScreensAdapter;
import com.app.socilon.appModelClasses.ParentModelClass;
import com.app.socilon.databinding.FragmentHomeBinding;


import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements ScreensAdapter.OnItemClick {
    FragmentHomeBinding homeBinding;
    List<String> list = new ArrayList<>();

    ArrayList<ParentModelClass> parentModelClasses=new ArrayList<>();


    private ViewPager viewPager_ES;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     homeBinding=FragmentHomeBinding.inflate(inflater,container,false);
     return homeBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createListItems();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false);
        homeBinding.rvParent.setLayoutManager(linearLayoutManager);
        homeBinding.rvParent.setAdapter(new HomeAdapter(15));
        adapter(view);
    }

    private void createListItems() {
        list.add("All");
        list.add("Live");
        list.add("Popular");
        list.add("Upcoming");
        list.add("Live Shopping");
        list.add("Foods");
        list.add("Live Event Concert");
        list.add("Talent hunt");
        list.add("Videos/Audio massage");
        list.add("Talk show");
        list.add("Podcast");
        list.add("Reels/short videos");
        list.add("Health fitness");
        list.add("Sports");
        list.add("Faith");
        list.add("News");
        list.add("Live Learning");
    }

    private void adapter(View view) {
        ScreensAdapter screensAdapter=new ScreensAdapter(requireContext(), list, HomeFragment.this);
        homeBinding.itemRecyclar.setAdapter(screensAdapter);
    }



    @Override
    public void onClick(int position) {

        if (position==0){
            homeBinding.rvParent.setAdapter(new HomeAdapter(14));
        }

        if (position == 1) {
            homeBinding.rvParent.setAdapter(new HomeAdapter(2));
            Toast.makeText(requireContext(), "44", Toast.LENGTH_SHORT).show();
        }
        if (position == 2) {
            homeBinding.rvParent.setAdapter(new HomeAdapter(2));

        } if (position == 3) {
            homeBinding.rvParent.setAdapter(new HomeAdapter(2));
        } if (position == 4) {
            homeBinding.rvParent.setAdapter(new HomeAdapter(2));
        } if (position == 5) {
            homeBinding.rvParent.setAdapter(new HomeAdapter(2));
        } if (position == 6) {
            homeBinding.rvParent.setAdapter(new HomeAdapter(2));
        } if (position == 7) {
            homeBinding.rvParent.setAdapter(new HomeAdapter(3));
        } if (position == 8) {
            homeBinding.rvParent.setAdapter(new HomeAdapter(3));
        } if (position == 9) {
            homeBinding.rvParent.setAdapter(new HomeAdapter(3));
        }if (position == 10) {
            homeBinding.rvParent.setAdapter(new HomeAdapter(3));
        }if (position == 11) {
            homeBinding.rvParent.setAdapter(new HomeAdapter(2));
        }if (position == 12) {
            homeBinding.rvParent.setAdapter(new HomeAdapter(5));
        }if (position == 13) {
            homeBinding.rvParent.setAdapter(new HomeAdapter(4));
        }if (position == 14) {
            homeBinding.rvParent.setAdapter(new HomeAdapter(3));
        }if (position == 15) {
            Toast.makeText(requireContext(), "Live Learning", Toast.LENGTH_SHORT).show();
//            HomeAdapter homeAdapter = new HomeAdapter(1);
//            homeBinding.rvParent.setAdapter(homeAdapter);
//            homeAdapter.notifyDataSetChanged();
            Navigation.findNavController(getView()).navigate(R.id.action_homeFragment_to_cartFragment);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().findViewById(R.id.bottom_navigation).setVisibility(View.VISIBLE);
    }
}
package com.app.socilon.fragments.loginSection;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.Models.CategoryItemModel;
import com.app.socilon.R;
import com.app.socilon.adpters.InterestItemAdapter;
import com.app.socilon.databinding.FragmentInterstsBinding;

import java.util.ArrayList;
import java.util.List;


public class InterstsFragment extends Fragment {
FragmentInterstsBinding interstsBinding;
List<CategoryItemModel>list=new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        interstsBinding=FragmentInterstsBinding.inflate(inflater,container,false);
        return  interstsBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        onClicks(view);
        addLists();
        setAdapter(view);

    }

    private void addLists() {
        list.add(new CategoryItemModel(R.drawable.paws,"Live show"));
        list.add(new CategoryItemModel(R.drawable.popular_shows,"Popular shows"));
        list.add(new CategoryItemModel(R.drawable.artboard,"Up coming shows"));
        list.add(new CategoryItemModel(R.drawable.live_shopping,"Live shopping"));
        list.add(new CategoryItemModel(R.drawable.live_perforamance,"Live performance"));
        list.add(new CategoryItemModel(R.drawable.foods,"Foods"));
        list.add(new CategoryItemModel(R.drawable.live_events,"Live Event Concert"));
        list.add(new CategoryItemModel(R.drawable.talent,"Talent hunt"));
        list.add(new CategoryItemModel(R.drawable.messages,"Videos/Audio \n" +
                "massage"));
        list.add(new CategoryItemModel(R.drawable.talk_shows,"Talk show"));
        list.add(new CategoryItemModel(R.drawable.podcast,"Podcast"));
        list.add(new CategoryItemModel(R.drawable.reels,"Reels/short videos"));
        list.add(new CategoryItemModel(R.drawable.health,"Health fitness"));
        list.add(new CategoryItemModel(R.drawable.sports,"Sports"));
        list.add(new CategoryItemModel(R.drawable.faith,"Faith"));
        list.add(new CategoryItemModel(R.drawable.newss,"News"));


    }

    private void setAdapter(View view) {
        InterestItemAdapter itemAdapter=new InterestItemAdapter(list);
        interstsBinding.itemRecyclar.setAdapter(itemAdapter);
    }

    private void onClicks(View view) {
        interstsBinding.goToNextPage.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_interstsFragment_to_userInterestFragment);

        });   interstsBinding.goToBack.setOnClickListener(view1 -> {
getActivity().onBackPressed();
        });
    }
}
package com.app.socilon.fragments.liveshow;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.adpters.HomeAdapter;
import com.app.socilon.adpters.ScreensAdapter;
import com.app.socilon.databinding.FragmentCartBinding;
import com.app.socilon.fragments.home_fragments.HomeFragment;

import java.util.ArrayList;
import java.util.List;

public class CartFragment extends Fragment implements  ScreensAdapter.OnItemClick{
    FragmentCartBinding cartBinding;
    List<String> list = new ArrayList<>();
    List<String> newlist = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         cartBinding=FragmentCartBinding.inflate(inflater,container,false);
         return  cartBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createListItems();
        cartNewList();
        adapter(view);
        onClicks(view);
    }

    private void onClicks(View view) {

        cartBinding.addItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_cartFragment_to_shoppingItemsFragment);
            }
        });


         cartBinding.reviews.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
             Navigation.findNavController(getView()).navigate(R.id.action_cartFragment_to_reviewsFragment);
             }
         });
    }

    private void cartNewList() {
        newlist.add("Sharing Now");
        newlist.add("Demostrate");
        newlist.add("Alternatives");
        newlist.add("Live Shopping");
        newlist.add("Foods");
        newlist.add("Live Event Concert");

    }

    private void adapter(View view) {
        ScreensAdapter screensAdapter=new ScreensAdapter(requireContext(), list,this);
        cartBinding.itemRecyclar.setAdapter(screensAdapter);


        ScreensAdapter adpaterlist=new ScreensAdapter(requireContext(), newlist,this);
        cartBinding.cartsItems.setAdapter(adpaterlist);
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
    }

    @Override
    public void onClick(int position) {

    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().findViewById(R.id.bottom_navigation).setVisibility(View.VISIBLE);
    }
}
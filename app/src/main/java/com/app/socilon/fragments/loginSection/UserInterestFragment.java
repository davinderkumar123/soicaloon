package com.app.socilon.fragments.loginSection;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.adpters.UserInterstAdapter;
import com.app.socilon.databinding.FragmentUserInterestBinding;

import java.util.ArrayList;
import java.util.List;


public class UserInterestFragment extends Fragment {
    FragmentUserInterestBinding userInterestBinding;
    List<String> list=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        userInterestBinding=FragmentUserInterestBinding.inflate(inflater,container,false);
       return  userInterestBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);
        addItems();
        setAdapter(view);

    }

    private void addItems() {
        list.add("Artist");
        list.add("Brands");
        list.add("Chef / Foodies");
        list.add("Coach");
        list.add("Comedian");
        list.add("Craftsperson");
        list.add("Gamer");
        list.add("Educator /Teacher");
        list.add("Event Producer");
        list.add("Fitness\n" +
                "Instruct");
        list.add("Influencer");
        list.add("Maker");
        list.add("Musician");
        list.add("Podcaster");
        list.add("Product Review...");
        list.add("Writer");
        list.add("Vlogger");
        list.add("Other");
    }

    private void setAdapter(View view) {
        UserInterstAdapter userAdapter=new UserInterstAdapter(list);
        userInterestBinding.useritemRecyclar.setAdapter(userAdapter);
    }

    private void onClicks(View view) {
        userInterestBinding.next2.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_userInterestFragment_to_selectLoactionFragment);
        });
    }
}
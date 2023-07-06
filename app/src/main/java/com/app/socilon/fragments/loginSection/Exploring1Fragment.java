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
import com.app.socilon.databinding.FragmentExploring1Binding;
import com.google.android.material.navigation.NavigationView;


public class Exploring1Fragment extends Fragment {
    FragmentExploring1Binding exploring1Binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        exploring1Binding =FragmentExploring1Binding.inflate(inflater,container,false);
        return exploring1Binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClick(view);

    }

    private void onClick(View view) {
        exploring1Binding.next1.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_exploring1Fragment_to_explore2Fragment);
        });



    }
}
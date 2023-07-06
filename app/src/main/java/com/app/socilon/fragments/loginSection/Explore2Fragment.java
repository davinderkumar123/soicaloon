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
import com.app.socilon.databinding.FragmentExplore2Binding;

public class Explore2Fragment extends Fragment {
    FragmentExplore2Binding explore2Binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        explore2Binding=FragmentExplore2Binding.inflate(inflater,container,false);
        return explore2Binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        explore2Binding.next2.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_explore2Fragment_to_loginFragment);
        });
    }
}
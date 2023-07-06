package com.app.socilon.fragments.user_profile_section;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.databinding.FragmentAboutUsBinding;


public class AboutUsFragment extends Fragment {
    FragmentAboutUsBinding aboutUsBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
aboutUsBinding=FragmentAboutUsBinding.inflate(getLayoutInflater());
    return aboutUsBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);

    }

    private void onClicks(View view) {
        aboutUsBinding.backbtn.setOnClickListener(view1 -> {
            getActivity().onBackPressed();
        });
    }
}
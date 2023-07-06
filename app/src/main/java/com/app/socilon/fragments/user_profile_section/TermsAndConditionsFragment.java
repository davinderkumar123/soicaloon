package com.app.socilon.fragments.user_profile_section;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.databinding.FragmentTermsAndConditionsBinding;


public class TermsAndConditionsFragment extends Fragment {
    FragmentTermsAndConditionsBinding termsAndConditionsBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        termsAndConditionsBinding = FragmentTermsAndConditionsBinding.inflate(getLayoutInflater());
        return termsAndConditionsBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);
    }

    private void onClicks(View view) {
        termsAndConditionsBinding.backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
    }
}
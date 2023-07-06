package com.app.socilon.fragments.user_profile_section;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.databinding.FragmentPrivacyPolicyBinding;

public class PrivacyPolicyFragment extends Fragment {
    FragmentPrivacyPolicyBinding privacyPolicyBinding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
privacyPolicyBinding=FragmentPrivacyPolicyBinding.inflate(getLayoutInflater());
    return privacyPolicyBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClciks(view);
    }

    private void onClciks(View view) {
        privacyPolicyBinding.backbtn.setOnClickListener(view1 -> {
            getActivity().onBackPressed();
        });
    }
}
package com.app.socilon.fragments.user_profile_section;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.databinding.FragmentHelpBinding;


public class HelpFragment extends Fragment {
    FragmentHelpBinding fragmentHelpBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentHelpBinding=FragmentHelpBinding.inflate(getLayoutInflater());
        return  fragmentHelpBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);
    }

    private void onClicks(View view) {
        fragmentHelpBinding.goToFaQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_helpFragment4_to_FAQFragment);
            }
        });
        fragmentHelpBinding.contactUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_helpFragment4_to_contactUsFragment);
            }
        });
        fragmentHelpBinding.termsAndConditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_helpFragment4_to_termsAndConditionsFragment);
            }
        });
        fragmentHelpBinding.privacyPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_helpFragment4_to_privacyPolicyFragment);
            }
        });
        fragmentHelpBinding.aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_helpFragment4_to_aboutUsFragment);
            }
        });
        fragmentHelpBinding.backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
getActivity().onBackPressed();            }
        });
    }
}
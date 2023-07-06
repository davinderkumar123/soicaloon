package com.app.socilon.fragments.forgotSection;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.databinding.FragmentForgotByMailBinding;

public class ForgotByMailFragment extends Fragment {
    FragmentForgotByMailBinding byMailBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
byMailBinding=FragmentForgotByMailBinding.inflate(inflater,container,false);
return  byMailBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);
    }

    private void onClicks(View view) {
        byMailBinding.phone.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_forgotByMailFragment_to_forgotByPhoneFragment);
        });
        byMailBinding.goToOtp.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_forgotByMailFragment_to_resteOtpFragment);
        });
        byMailBinding.backarrow.setOnClickListener(view1 -> {
getActivity().onBackPressed();
        });
    }
}
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
import com.app.socilon.databinding.FragmentOtpBinding;

public class OtpFragment extends Fragment {
    FragmentOtpBinding otpBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        otpBinding = FragmentOtpBinding.inflate(inflater, container, false);
        return otpBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onclicks(view);
    }

    private void onclicks(View view) {
        otpBinding.next2.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_otpFragment_to_interstsFragment);
        });
        otpBinding.backToScreen.setOnClickListener(view1 -> {
            getActivity().onBackPressed();
        });
    }
}
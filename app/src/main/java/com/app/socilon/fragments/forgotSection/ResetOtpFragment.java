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
import com.app.socilon.databinding.FragmentResetOtpBinding;

public class ResetOtpFragment extends Fragment {
    FragmentResetOtpBinding resteOtpBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        resteOtpBinding = FragmentResetOtpBinding.inflate(inflater, container, false);
        return resteOtpBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);
    }

    private void onClicks(View view) {
        resteOtpBinding.goToCreatePass.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_resteOtpFragment_to_createPassFragment2);
        });
        resteOtpBinding.backarrow.setOnClickListener(view1 -> {
            getActivity().onBackPressed();
        });
    }
}
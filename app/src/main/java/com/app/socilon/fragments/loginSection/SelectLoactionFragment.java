package com.app.socilon.fragments.loginSection;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.activities.HomeActivity;
import com.app.socilon.databinding.FragmentSelectLoactionBinding;


public class SelectLoactionFragment extends Fragment {
FragmentSelectLoactionBinding locationBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        locationBinding=FragmentSelectLoactionBinding.inflate(inflater,container,false);
        return locationBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);
    }

    private void onClicks(View view) {
        locationBinding.tvBack.setOnClickListener(view1 -> {
            getActivity().onBackPressed();
        });
        locationBinding.next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(requireActivity(), HomeActivity.class));
            }
        });
    }
}
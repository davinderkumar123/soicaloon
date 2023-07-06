package com.app.socilon.fragments.location;

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
import com.app.socilon.databinding.FragmentEndLiveBinding;

public class EndLiveFragment extends Fragment {
    FragmentEndLiveBinding endLiveBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        endLiveBinding = FragmentEndLiveBinding.inflate(getLayoutInflater());
        return endLiveBinding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);

    }

    private void onClicks(View view) {

        endLiveBinding.backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(requireActivity(),HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
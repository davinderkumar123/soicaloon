package com.app.socilon.fragments.loginSection;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.databinding.FragmentCreateYourChannelBinding;


public class CreateYourChannelFragment extends Fragment {
    FragmentCreateYourChannelBinding createYourChannelBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        createYourChannelBinding=FragmentCreateYourChannelBinding.inflate(getLayoutInflater());
        return createYourChannelBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
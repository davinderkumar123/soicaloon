package com.app.socilon.fragments.events;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.adpters.PhotoListAdapter;
import com.app.socilon.databinding.FragmentPhotoBinding;

public class
PhotoFragment extends Fragment {
    FragmentPhotoBinding photoBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        photoBinding = FragmentPhotoBinding.inflate(getLayoutInflater());
        return photoBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter(view);
        onClicks(view);
    }

    private void setAdapter(View view) {
        PhotoListAdapter photoListAdapter = new PhotoListAdapter();
        photoBinding.allPhotosRecyclar.setAdapter(photoListAdapter);
    }

    private void onClicks(View view) {
        photoBinding.backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
    }
}
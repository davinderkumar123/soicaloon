package com.app.socilon.fragments.events.Add_Documentation_Section;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.databinding.FragmentAddDocumentsBinding;


public class AddDocumentsFragment extends Fragment {
    FragmentAddDocumentsBinding documentsBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
documentsBinding=FragmentAddDocumentsBinding.inflate(getLayoutInflater());
    return documentsBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);
    }

    private void onClicks(View view) {
        documentsBinding.addPhotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                documentsBinding.addPhotos.setVisibility(View.GONE);
//                documentsBinding.PhotoBtn.setVisibility(View.VISIBLE);
                Navigation.findNavController(getView()).navigate(R.id.action_addDocumentsFragment_to_addPhotosFragment);

            }
        });
        documentsBinding.addVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                documentsBinding.addPhotos.setVisibility(View.GONE);
//                documentsBinding.videoBtn.setVisibility(View.VISIBLE);
                Navigation.findNavController(getView()).navigate(R.id.action_addDocumentsFragment_to_addVideosFragment);

            }
        });
        documentsBinding.backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              getActivity().onBackPressed();

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().findViewById(R.id.bottom_navigation).setVisibility(View.GONE);
    }
}
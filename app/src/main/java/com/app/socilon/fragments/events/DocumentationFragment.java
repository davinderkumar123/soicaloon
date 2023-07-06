package com.app.socilon.fragments.events;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.app.socilon.R;
import com.app.socilon.adpters.PhotoListAdapter;
import com.app.socilon.adpters.VideoListAdapter;
import com.app.socilon.databinding.FragmentDocumentationBinding;


public class DocumentationFragment extends Fragment {
    FragmentDocumentationBinding documentationBinding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        documentationBinding=FragmentDocumentationBinding.inflate(inflater,container,false);
        return documentationBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       onClicks(view);
        setAdapter(view);
    }

    private void setAdapter(View view) {
        PhotoListAdapter photoListAdapter=new PhotoListAdapter();
        documentationBinding.photosRecyclar.setAdapter(photoListAdapter);

        VideoListAdapter videoListAdapter=new VideoListAdapter();
        documentationBinding.videosRecyclar.setAdapter(videoListAdapter);
    }

    private void onClicks(View view) {
        documentationBinding.seeAllPhotos.setOnClickListener(view1 -> {
            Toast.makeText(requireContext(), "SeeAll", Toast.LENGTH_SHORT).show();
          Navigation.findNavController(getView()).navigate(R.id.action_documentationFragment_to_photoFragment);
        });
        documentationBinding.seeAllVideos.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_documentationFragment_to_videosFragment);
            Toast.makeText(requireContext(), "SeeAllVideos", Toast.LENGTH_SHORT).show();

        });
        documentationBinding.backbtn.setOnClickListener(view1 -> {
       getActivity().onBackPressed();
        });
    }
}
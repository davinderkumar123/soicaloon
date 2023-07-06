package com.app.socilon.fragments.events;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.adpters.VideoListAdapter;
import com.app.socilon.databinding.FragmentVideosBinding;


public class VideosFragment extends Fragment {
    FragmentVideosBinding videosBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        videosBinding=FragmentVideosBinding.inflate(getLayoutInflater());
        return videosBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter(view);
        onClicks(view);
    }

    private void onClicks(View view) {
        videosBinding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
    }

    private void setAdapter(View view) {
        VideoListAdapter videoListAdapter=new VideoListAdapter();
        videosBinding.aalVideosRecyclar.setAdapter(videoListAdapter);
    }
}
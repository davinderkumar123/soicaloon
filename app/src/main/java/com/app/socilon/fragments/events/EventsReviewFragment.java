package com.app.socilon.fragments.events;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.adpters.EventsReviewRatingAdapter;
import com.app.socilon.databinding.FragmentEventsBinding;
import com.app.socilon.databinding.FragmentEventsReviewBinding;
import com.app.socilon.databinding.FragmentReviewsBinding;


public class EventsReviewFragment extends Fragment {
FragmentEventsReviewBinding eventsReviewBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      eventsReviewBinding=FragmentEventsReviewBinding.inflate(getLayoutInflater());
        return  eventsReviewBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter(view);
        onClicks(view);
    }

    private void onClicks(View view) {
        eventsReviewBinding.backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();

            }
        });
    }

    private void setAdapter(View view) {
        EventsReviewRatingAdapter ratingAdapter=new EventsReviewRatingAdapter();
        eventsReviewBinding.eventsReviewrating.setAdapter(ratingAdapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().findViewById(R.id.bottom_navigation).setVisibility(View.GONE);
    }
}
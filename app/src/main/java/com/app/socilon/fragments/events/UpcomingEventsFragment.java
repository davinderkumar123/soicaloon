package com.app.socilon.fragments.events;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.adpters.UpcomingAdapter;
import com.app.socilon.databinding.FragmentUpcomingEventsBinding;

public class UpcomingEventsFragment extends Fragment {
    FragmentUpcomingEventsBinding upcomingEventsBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        upcomingEventsBinding=FragmentUpcomingEventsBinding.inflate(getLayoutInflater());
        return  upcomingEventsBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter();

    }

    private void setAdapter() {
        UpcomingAdapter upcomingAdapter=new UpcomingAdapter();
        upcomingEventsBinding.eventsUpcoming.setAdapter(upcomingAdapter);
    }
}
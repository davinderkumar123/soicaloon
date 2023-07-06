package com.app.socilon.fragments.calendar;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.adpters.CalendarListAdapter;
import com.app.socilon.databinding.FragmentCalendarBinding;
import com.app.socilon.databinding.FragmentCallingBinding;


public class CalendarFragment extends Fragment {
    FragmentCalendarBinding calendarBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
calendarBinding= FragmentCalendarBinding.inflate(getLayoutInflater());
return  calendarBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CalendarListAdapter calendarListAdapter=new CalendarListAdapter();
        calendarBinding.calendarList.setAdapter(calendarListAdapter);
    }
}
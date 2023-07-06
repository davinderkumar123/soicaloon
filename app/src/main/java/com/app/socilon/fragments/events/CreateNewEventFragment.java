package com.app.socilon.fragments.events;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.app.socilon.R;
import com.app.socilon.adpters.CreateNewEventsAdpter;
import com.app.socilon.databinding.FragmentCreateNewEventBinding;

public class CreateNewEventFragment extends Fragment {

    FragmentCreateNewEventBinding newEventBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        newEventBinding=FragmentCreateNewEventBinding.inflate(getLayoutInflater());
        return  newEventBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter();
        onClicks(view);

    }

    private void onClicks(View view) {
        newEventBinding.backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        newEventBinding.newEventsCreated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDailog(view);
            }
        });
    }

    private void openDailog(View view) {
        Dialog dialog=new Dialog(view.getContext());
        dialog.setContentView(R.layout.dailog_publish_successfully);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(true);
        dialog.getWindow().setGravity(Gravity.CENTER);
        WindowManager.LayoutParams layoutParams=new WindowManager.LayoutParams();
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT; // this is where the magic happens
        layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        dialog.getWindow().setAttributes(layoutParams);
        dialog.show();

        dialog.findViewById(R.id.dismiss).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });



    }

    private void setAdapter() {
        CreateNewEventsAdpter newEventsAdpter=new CreateNewEventsAdpter();
        newEventBinding.newEventsRecyclar.setAdapter(newEventsAdpter);
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().findViewById(R.id.bottom_navigation).setVisibility(View.GONE);
    }
}
package com.app.socilon.fragments.liveshow;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.app.socilon.R;
import com.app.socilon.databinding.FragmentLiveShoppingBinding;


public class LiveShoppingFragment extends Fragment {
    FragmentLiveShoppingBinding liveShoppingBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        liveShoppingBinding = FragmentLiveShoppingBinding.inflate(inflater, container, false);
        return liveShoppingBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onclicks(view);
    }

    private void onclicks(View view) {
        liveShoppingBinding.goLive.setOnClickListener(view1 -> {

            Navigation.findNavController(getView()).navigate(R.id.action_liveShoppingFragment_to_userLiveFragment);

        });
        liveShoppingBinding.gotTodailog.setOnClickListener(view1 -> {

           openDailog(view);
        });
        liveShoppingBinding.backBtn.setOnClickListener(view1 -> {
            getActivity().onBackPressed();
        });
        liveShoppingBinding.liveLearn.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_liveShoppingFragment_to_cartFragment);
        });
    }

    private void openDailog(View view) {
        Dialog dialog_share = new Dialog(view.getContext());
        dialog_share.setContentView(R.layout.dailog_screen_391);
        dialog_share.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));

//          dialog_share.getWindow().getAttributes().windowAnimations=R.style.DialogAnimation;
        dialog_share.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog_share.setCanceledOnTouchOutside(true);

        dialog_share.getWindow().setGravity(Gravity.CENTER_VERTICAL);
        WindowManager.LayoutParams lWindowParams = new WindowManager.LayoutParams();
        //lWindowParams.copyFrom(getDialog().getWindow().getAttributes());
        lWindowParams.width = WindowManager.LayoutParams.MATCH_PARENT; // this is where the magic happens
        lWindowParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        dialog_share.getWindow().setAttributes(lWindowParams);

        dialog_share.show();
        dialog_share.findViewById(R.id.dismissDailog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog_share.dismiss();
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        requireActivity().findViewById(R.id.bottom_navigation).setVisibility(View.GONE);
    }
}
package com.app.socilon.fragments.liveshow;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.app.socilon.R;
import com.app.socilon.adpters.UserLiveAdapter;

public class UserLiveFragment extends Fragment {
    com.app.socilon.databinding.FragmentUserLiveBinding userLiveBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        userLiveBinding = com.app.socilon.databinding.FragmentUserLiveBinding.inflate(inflater, container, false);
        return userLiveBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClick(view);
        serAdapter(view);
//        handler(view);
    }

//    private void handler(View view) {
////        new Handler().postDelayed(new Runnable() {
////            @Override
////            public void run() {
//                Dialog dialog_share = new Dialog(view.getContext());
//                dialog_share.setContentView(R.layout.dailog_screen_391);
//                dialog_share.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
//
////          dialog_share.getWindow().getAttributes().windowAnimations=R.style.DialogAnimation;
//                dialog_share.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
//                dialog_share.setCanceledOnTouchOutside(true);
//
//                dialog_share.getWindow().setGravity(Gravity.CENTER);
//                WindowManager.LayoutParams lWindowParams = new WindowManager.LayoutParams();
//                //lWindowParams.copyFrom(getDialog().getWindow().getAttributes());
//                lWindowParams.width = WindowManager.LayoutParams.MATCH_PARENT; // this is where the magic happens
//                lWindowParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
//                dialog_share.getWindow().setAttributes(lWindowParams);
//
//                dialog_share.show();
//                dialog_share.findViewById(R.id.dismissDailog).setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        dialog_share.dismiss();
//                    }
//                });
////            }
////        }, 2000);
//    }

    private void serAdapter(View view) {
        UserLiveAdapter userLiveAdapter = new UserLiveAdapter();
        userLiveBinding.watchLiverecyclar.setAdapter(userLiveAdapter);
    }

    private void onClick(View view) {
        userLiveBinding.close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        userLiveBinding.voiceCalling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_userLiveFragment_to_callingFragment);
            }
        });
        userLiveBinding.videoCalling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_userLiveFragment_to_videoCallingFragment2);
            }
        });

        userLiveBinding.goForchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_userLiveFragment_to_chatUserFragment2);
            }
        });
        userLiveBinding.userRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_userLiveFragment_to_userRoomFragment2);
            }
        });
        userLiveBinding.goToCartFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_userLiveFragment_to_cartFragment);
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().findViewById(R.id.bottom_navigation).setVisibility(View.GONE);
    }
}
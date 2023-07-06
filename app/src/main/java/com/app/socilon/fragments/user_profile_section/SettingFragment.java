package com.app.socilon.fragments.user_profile_section;

import android.app.Dialog;
import android.content.Intent;
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
import android.view.Window;
import android.view.WindowManager;

import com.app.socilon.R;
import com.app.socilon.activities.LoginActivity;
import com.app.socilon.databinding.FragmentSettingBinding;
import com.app.socilon.fragments.loginSection.RegisterFragment;


public class SettingFragment extends Fragment {
    FragmentSettingBinding settingBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        settingBinding = FragmentSettingBinding.inflate(getLayoutInflater());
        return settingBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);
    }

    private void onClicks(View view) {
        settingBinding.goToEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_settingFragment_to_editProfileFragment);
            }
        });
        settingBinding.goForNotifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_settingFragment_to_notificationFragment);
            }
        });
        settingBinding.goToSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_settingFragment_to_securityFragment);
            }
        });
        settingBinding.goToAppearance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_settingFragment_to_appearanceFragment);
            }
        });
        settingBinding.goToHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_settingFragment_to_helpFragment4);
            }
        });
        settingBinding.goToInvites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_settingFragment_to_inviteFriendsFragment);
            }
        });
        settingBinding.backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        settingBinding.goToLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDailog(view);

            }
        });
    }

    private void openDailog(View view) {
        Dialog dialogsecess = new Dialog(getContext());
        dialogsecess.setContentView(R.layout.logout_dailog);
        dialogsecess.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        dialogsecess.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogsecess.setCanceledOnTouchOutside(true);
        dialogsecess.getWindow().setGravity(Gravity.BOTTOM);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT; // this is where the magic happens
        layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        dialogsecess.getWindow().setAttributes(layoutParams);
        dialogsecess.show();
        dialogsecess.findViewById(R.id.cancelButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialogsecess.dismiss();

            }
        });
        dialogsecess.findViewById(R.id.logoutUser).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(requireActivity(),LoginActivity.class));
                getActivity().finishAffinity();
                dialogsecess.dismiss();
//getActivity().findViewById(R.id.bottom_navigation).setVisibility(View.GONE);

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().findViewById(R.id.bottom_navigation).setVisibility(View.GONE);
    }
}
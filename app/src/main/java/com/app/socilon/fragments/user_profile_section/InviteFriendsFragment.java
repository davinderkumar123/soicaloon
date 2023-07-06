package com.app.socilon.fragments.user_profile_section;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.adpters.InviteAdapter;
import com.app.socilon.databinding.FragmentInviteFriendsBinding;

public class InviteFriendsFragment extends Fragment {
    FragmentInviteFriendsBinding inviteFriendsBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
inviteFriendsBinding=FragmentInviteFriendsBinding.inflate(getLayoutInflater());
    return inviteFriendsBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter(view);
        onClicks(view);

    }

    private void onClicks(View view) {
        inviteFriendsBinding.backbtn.setOnClickListener(view1 -> {
            getActivity().onBackPressed();
        });
    }

    private void setAdapter(View view) {
        InviteAdapter inviteAdapter=new InviteAdapter();
      inviteFriendsBinding.recyclarInvite.setAdapter(inviteAdapter);
    }
}
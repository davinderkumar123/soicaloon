package com.app.socilon.fragments.liveshow;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.adpters.UserLiveAdapter;
import com.app.socilon.databinding.FragmentUseRoomBinding;

public class UserRoomFragment extends Fragment {
    FragmentUseRoomBinding roomBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        roomBinding=FragmentUseRoomBinding.inflate(inflater,container,false);
        return  roomBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        UserLiveAdapter userLiveAdapter=new UserLiveAdapter();
        roomBinding.watchLiverecyclar.setAdapter(userLiveAdapter);
    }
}
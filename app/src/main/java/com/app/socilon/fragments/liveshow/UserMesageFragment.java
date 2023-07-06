package com.app.socilon.fragments.liveshow;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.adpters.ChatSection.MesageAdapter;
import com.app.socilon.databinding.FragmentUserMesageBinding;


public class UserMesageFragment extends Fragment {
    FragmentUserMesageBinding mesageBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mesageBinding = FragmentUserMesageBinding.inflate(inflater, container, false);
        return mesageBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        onClicks(view);
        setAdapter();
    }

    private void onClicks(View view) {
        mesageBinding.goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
    }



    private void setAdapter() {
        MesageAdapter mesageAdapter=new MesageAdapter();
        mesageBinding.chat.setAdapter(mesageAdapter);
    }
}
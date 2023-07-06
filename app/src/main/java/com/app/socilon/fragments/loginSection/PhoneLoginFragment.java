package com.app.socilon.fragments.loginSection;

import android.content.Entity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.databinding.FragmentPhoneLoginBinding;

public class PhoneLoginFragment extends Fragment {
    FragmentPhoneLoginBinding phoneLoginBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        phoneLoginBinding=FragmentPhoneLoginBinding.inflate(inflater,container,false);
        return phoneLoginBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        phoneLoginBinding.next2.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_phoneLoginFragment_to_interstsFragment);
        });
    }
}
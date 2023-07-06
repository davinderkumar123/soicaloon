 package com.app.socilon.fragments.loginSection;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.activities.HomeActivity;
import com.app.socilon.activities.MainActivity;
import com.app.socilon.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {
    FragmentLoginBinding loginBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        loginBinding = FragmentLoginBinding.inflate(inflater, container, false);
        return loginBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);

    }

    private void onClicks(View view) {

        loginBinding.forgotPass.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_loginFragment_to_forgotByMailFragment);
        });        loginBinding.signUp.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_loginFragment_to_registerFragment);
        });

        loginBinding.next2.setOnClickListener(view1 -> {
//            Navigation.findNavController(getView()).navigate(R.id.action_loginFragment_to_registerFragment);
            Intent intent = new Intent(requireActivity(), HomeActivity.class);
            startActivity(intent);
        });
    }

}
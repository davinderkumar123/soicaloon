package com.app.socilon.fragments.location;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.adpters.UserLiveAdapter;
import com.app.socilon.databinding.FragmentGoLiveBinding;


public class GoLiveFragment extends Fragment {

   FragmentGoLiveBinding goLiveBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       goLiveBinding=FragmentGoLiveBinding.inflate(getLayoutInflater());
        return  goLiveBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter();
        onClicks(view);
    }

    private void onClicks(View view) {
        goLiveBinding.close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_goLiveFragment_to_endLiveFragment);

            }
        });
    }

    private void setAdapter() {

            UserLiveAdapter userLiveAdapter=new UserLiveAdapter();
            goLiveBinding.watchLiverecyclar.setAdapter(userLiveAdapter);
        }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().findViewById(R.id.bottom_navigation).setVisibility(View.GONE);
    }
}

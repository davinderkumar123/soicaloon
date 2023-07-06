package com.app.socilon.fragments.events.Add_Documentation_Section;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.databinding.FragmentScanTicketBinding;


public class ScanTicketFragment extends Fragment {
    FragmentScanTicketBinding scanTicketBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        scanTicketBinding=FragmentScanTicketBinding.inflate(getLayoutInflater());
        return  scanTicketBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClciks(view);
    }

    private void onClciks(View view) {
        scanTicketBinding.backbtn.setOnClickListener(view1 -> {
            getActivity().onBackPressed();
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().findViewById(R.id.bottom_navigation).setVisibility(View.GONE);
    }
}
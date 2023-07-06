package com.app.socilon.fragments.liveshow;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.databinding.FragmentPaymentBinding;
import com.app.socilon.databinding.FragmentReviewsBinding;


public class PaymentFragment extends Fragment {
    FragmentPaymentBinding paymentBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        paymentBinding = FragmentPaymentBinding.inflate(inflater, container, false);
        return paymentBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);

    }

    private void onClicks(View view) {
        paymentBinding.next1.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_paymentFragment_to_addNewCardFragment);
        });
        paymentBinding.backBtn.setOnClickListener(view1 -> {
            getActivity().onBackPressed();
        });
    }
}
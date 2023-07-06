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
import com.app.socilon.adpters.CartItemsAdapter;
import com.app.socilon.databinding.FragmentItemQuantityBinding;


public class ItemQuantityFragment extends Fragment {
    FragmentItemQuantityBinding itemQuantityBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        itemQuantityBinding = FragmentItemQuantityBinding.inflate(inflater, container, false);

        return itemQuantityBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter();
        onClicks(view);

    }

    private void onClicks(View view) {
        itemQuantityBinding.next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_itemQuantityFragment_to_paymentFragment2);
            }
        });
        itemQuantityBinding.backToScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
    }

    private void setAdapter() {
        CartItemsAdapter cartItemsAdapter = new CartItemsAdapter();
        itemQuantityBinding.quantityRecyclar.setAdapter(cartItemsAdapter);
    }
}
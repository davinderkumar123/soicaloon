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
import com.app.socilon.databinding.FragmentLiveShoppingBinding;
import com.app.socilon.databinding.FragmentShoppingItemsBinding;


public class ShoppingItemsFragment extends Fragment {
    FragmentShoppingItemsBinding shoppingItemsBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        shoppingItemsBinding = FragmentShoppingItemsBinding.inflate(inflater, container, false);
        return shoppingItemsBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);


    }

    private void onClicks(View view) {
        shoppingItemsBinding.addtoCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_shoppingItemsFragment_to_itemQuantityFragment);
            }
        });
        shoppingItemsBinding.backToScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
    }
}
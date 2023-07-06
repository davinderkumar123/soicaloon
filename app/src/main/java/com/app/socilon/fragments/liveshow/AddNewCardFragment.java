package com.app.socilon.fragments.liveshow;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.app.socilon.R;
import com.app.socilon.databinding.FragmentAddNewCardBinding;


public class AddNewCardFragment extends Fragment {
    FragmentAddNewCardBinding newCardBinding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        newCardBinding=FragmentAddNewCardBinding.inflate(inflater,container,false);
        return  newCardBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClick(view);
    }

    private void onClick(View view) {
        newCardBinding.next1.setOnClickListener(view1 -> {
            openDailog(view);
        });
    newCardBinding.backBtn.setOnClickListener(view1 -> {
            getActivity().onBackPressed();
        });

    }

    private void openDailog(View view) {

        Dialog dialog=new Dialog(view.getContext());
        dialog.setContentView(R.layout.payment_success);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(true);

        dialog.getWindow().setGravity(Gravity.CENTER);
        WindowManager.LayoutParams lWindowParams = new WindowManager.LayoutParams();
        //lWindowParams.copyFrom(getDialog().getWindow().getAttributes());
        lWindowParams.width = WindowManager.LayoutParams.MATCH_PARENT; // this is where the magic happens
        lWindowParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        dialog.getWindow().setAttributes(lWindowParams);

        dialog.show();
        dialog.findViewById(R.id.next1).setOnClickListener(view1 -> {
            dialog.hide();
        });

    }

    @Override
    public void onResume() {
        super.onResume();
      getActivity().findViewById(R.id.bottom_navigation).setVisibility(View.GONE);
    }
}
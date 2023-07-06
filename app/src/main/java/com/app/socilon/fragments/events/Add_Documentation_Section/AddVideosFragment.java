package com.app.socilon.fragments.events.Add_Documentation_Section;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.app.socilon.R;
import com.app.socilon.adpters.VideoListAdapter;
import com.app.socilon.databinding.FragmentAddVideosBinding;


public class AddVideosFragment extends Fragment {
    FragmentAddVideosBinding videosBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       videosBinding=FragmentAddVideosBinding.inflate(getLayoutInflater());
       return  videosBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter(view);
        onClicks(view);

    }

    private void onClicks(View view) {
        videosBinding.backbtn.setOnClickListener(view1 -> {
            getActivity().onBackPressed();
        });
        videosBinding.goToPhoto.setOnClickListener(view1 -> {
            Navigation.findNavController(getActivity(),R.id.fragment_container_view).navigate(R.id.addPhotosFragment);
        });
        videosBinding.updateVideoBtn.setOnClickListener(view1 -> {



            showDailog();
        });
    }

    private void showDailog() {

        Dialog dialog=new Dialog(getContext());
        dialog.setContentView(R.layout.upload_file_dailog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(true);
        dialog.getWindow().setGravity(Gravity.CENTER_HORIZONTAL);
        WindowManager.LayoutParams layoutParams=new WindowManager.LayoutParams();
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT; // this is where the magic happens
        layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        dialog.getWindow().setAttributes(layoutParams);
        dialog.show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                dialog.dismiss();
               showDalogMAin();

            }
        },2000);

    }

    private void showDalogMAin() {
        Dialog dialogsecess=new Dialog(getContext());
        dialogsecess.setContentView(R.layout.dailog_publish_successfully);
        dialogsecess.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        dialogsecess.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogsecess.setCanceledOnTouchOutside(true);
        dialogsecess.getWindow().setGravity(Gravity.CENTER_HORIZONTAL);
        WindowManager.LayoutParams layoutParams=new WindowManager.LayoutParams();
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT; // this is where the magic happens
        layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        dialogsecess.getWindow().setAttributes(layoutParams);
        dialogsecess.show();
        dialogsecess.findViewById(R.id.dismiss).setOnClickListener(view -> {
            dialogsecess.dismiss();
        });
    }


    private void setAdapter(View view) {
        VideoListAdapter videoListAdapter=new VideoListAdapter();
        videosBinding.videosRecyclar.setAdapter(videoListAdapter);
    }
}
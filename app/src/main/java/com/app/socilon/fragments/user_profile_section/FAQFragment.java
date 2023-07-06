package com.app.socilon.fragments.user_profile_section;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.adpters.ScreensAdapter;
import com.app.socilon.databinding.FragmentFAQBinding;
import com.app.socilon.fragments.home_fragments.HomeFragment;

import java.util.ArrayList;
import java.util.List;


public class FAQFragment extends Fragment implements ScreensAdapter.OnItemClick {
    FragmentFAQBinding faqBinding;
    List<String> listfaq = new ArrayList<>();

       @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       faqBinding=FragmentFAQBinding.inflate(getLayoutInflater());
       return  faqBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createListItems();
        adapter(view);
        onClicks(view);


    }

    private void onClicks(View view) {
           faqBinding.backbtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   getActivity().onBackPressed();
               }
           });
    }

    private void adapter(View view) {

        ScreensAdapter screensAdapter=new ScreensAdapter(requireContext(), listfaq, FAQFragment.this);
        faqBinding.faqItems.setAdapter(screensAdapter);
    }

    private void createListItems() {
           listfaq.add("General");
           listfaq.add("Login");
           listfaq.add("Account");
           listfaq.add("Socilon");
           listfaq.add("Tips");

    }

    @Override
    public void onClick(int position) {

    }
}
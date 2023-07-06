package com.app.socilon.fragments.liveshow;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.socilon.R;
import com.app.socilon.adpters.ReviewsAdapter;
import com.app.socilon.databinding.FragmentReviewsBinding;


public class ReviewsFragment extends Fragment {
    FragmentReviewsBinding reviewsBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        reviewsBinding=FragmentReviewsBinding.inflate(inflater,container,false);
        return reviewsBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);
        adapter(view);
    }

    private void adapter(View view) {

        ReviewsAdapter reviewsAdapter=new ReviewsAdapter();
        reviewsBinding.reviewRecyclar.setAdapter(reviewsAdapter);
    }

    private void onClicks(View view) {
        reviewsBinding.backToScreen.setOnClickListener(view1 -> {
            getActivity().onBackPressed();
        });

    }


}
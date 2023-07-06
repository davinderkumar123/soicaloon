package com.app.socilon.fragments.events;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import com.app.socilon.R;
import com.app.socilon.activities.HomeActivity;
import com.app.socilon.adpters.PastEventsAdapter;
import com.app.socilon.databinding.FragmentPastEventsBinding;


public class  Past_Events_Fragment extends Fragment {
    FragmentPastEventsBinding pastEventsBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        pastEventsBinding=FragmentPastEventsBinding.inflate(getLayoutInflater());
        return pastEventsBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdpater(view);

    }

    private void setAdpater(View view) {
        PastEventsAdapter eventsAdapter=new PastEventsAdapter(requireContext(), new PastEventsAdapter.CallbackClick() {
            @Override
            public void clickReviews(int viewId) {


//                Navigation.findNavController(view).navigate(R.id.action_past_Events_Fragment_to_eventsReviewFragment);

                switch(viewId) {
                    case R.id.seePastReviews:
                        Navigation.findNavController(requireActivity(),R.id.fragment_container_view).navigate(R.id.eventsReviewFragment);
                        break;
                    case R.id.seeDocumentation:
                        Navigation.findNavController(requireActivity(),R.id.fragment_container_view).navigate(R.id.documentationFragment);
                        break;

                    default:
                        break;
                }
            }
        });
        pastEventsBinding.pastEventsRecyclar.setAdapter(eventsAdapter);
    }


}
package com.app.socilon.fragments.events;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.app.socilon.R;
import com.app.socilon.adpters.My_events_Adapter;
import com.app.socilon.databinding.FragmentMyEventsBinding;


public class My_Events_Fragment extends Fragment{
    FragmentMyEventsBinding myEventsBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
myEventsBinding=FragmentMyEventsBinding.inflate(getLayoutInflater());
return  myEventsBinding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter(view);
        clcicks();
    }

    private void clcicks() {
        myEventsBinding.createNewEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(requireActivity(),R.id.fragment_container_view).navigate(R.id.createNewEventFragment);

            }
        });
    }


    private void setAdapter(View view) {
        My_events_Adapter my_events_adapter=new My_events_Adapter(requireContext(), new My_events_Adapter.onItemClick() {
            @Override
            public void onClick(int viewId) {
                switch (viewId){
                    case  R.id.seeReviews:
                   Navigation.findNavController(requireActivity(),R.id.fragment_container_view).navigate(R.id.eventsReviewFragment);
                   break;
                    case R.id.addNewDocs:
                        Navigation.findNavController(requireActivity(),R.id.fragment_container_view).navigate(R.id.addDocumentsFragment );
                        break;
                    case R.id.scan_docs:
                        Navigation.findNavController(requireActivity(),R.id.fragment_container_view).navigate(R.id.scanTicketFragment);
                        break;
                    default:
                        break;
                }
            }
        });
        myEventsBinding.mytEventsRecyclar.setAdapter(my_events_adapter);

    }


}
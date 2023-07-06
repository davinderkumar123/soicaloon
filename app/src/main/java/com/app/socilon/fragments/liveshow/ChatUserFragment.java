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
import com.app.socilon.adpters.ChatSection.ChatUserAdapter;
import com.app.socilon.databinding.FragmentChatUserBinding;

public class ChatUserFragment extends Fragment implements ChatUserAdapter.Callback  {
FragmentChatUserBinding chatUserBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       chatUserBinding=FragmentChatUserBinding.inflate(inflater,container,false);
       return  chatUserBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        onClicks(view);
        ChatUserAdapter chatUserAdapter=new ChatUserAdapter(this::onClick);
        chatUserBinding.chatUsersRecyclar.setAdapter(chatUserAdapter);

    }

    private void onClicks(View view) {
//        chatUserBinding.chatUsersRecyclar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Navigation.findNavController(getView()).navigate(R.id.action_chatUserFragment2_to_userMesageFragment);
//            }
//        });
//    }}
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().findViewById(R.id.bottom_navigation).setVisibility(View.GONE);
    }


    @Override
    public void onClick() {
        Navigation.findNavController(getView()).navigate(R.id.action_chatUserFragment2_to_userMesageFragment);
    }
}
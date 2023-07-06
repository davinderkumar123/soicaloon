package com.app.socilon.adpters.ChatSection;


import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.socilon.R;

import javax.security.auth.callback.Callback;

public class ChatUserAdapter extends RecyclerView.Adapter<ChatUserAdapter.holder> {


        Callback callback;

        public ChatUserAdapter(Callback callback) {

                this.callback = callback;
        }

        @NonNull
        @Override
        public ChatUserAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

                return new holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_users,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull ChatUserAdapter.holder holder, int position) {

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                callback.onClick();

                        }
                });
        }

        @Override
        public int getItemCount() {
                return 10;
        }

        public class holder extends RecyclerView.ViewHolder {
                public holder(@NonNull View itemView) {
                        super(itemView);
                }
        }
        public interface Callback{
                void onClick();
        }

}

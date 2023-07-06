package com.app.socilon.adpters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.socilon.R;

import java.util.ArrayList;
import java.util.List;

public class UserInterstAdapter extends RecyclerView.Adapter<UserInterstAdapter.holder> {
    private List<String> list;

    public UserInterstAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public UserInterstAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.user_interst_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserInterstAdapter.holder holder, int position) {

        holder.itemsId.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder {
        TextView itemsId;
        public holder(@NonNull View itemView) {
            super(itemView);
            itemsId=itemView.findViewById(R.id.itemsID);

        }
    }
}

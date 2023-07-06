package com.app.socilon.adpters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.socilon.R;

public class PhotoListAdapter extends RecyclerView.Adapter<PhotoListAdapter.holder> {
    @NonNull
    @Override
    public PhotoListAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.photos_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoListAdapter.holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class holder extends RecyclerView.ViewHolder {
        public holder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

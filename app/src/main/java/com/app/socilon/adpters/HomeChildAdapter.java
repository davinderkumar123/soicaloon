package com.app.socilon.adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.socilon.R;
import com.app.socilon.appModelClasses.ChildModelClass;

import java.util.List;

public class HomeChildAdapter extends RecyclerView.Adapter<HomeChildAdapter.holder> {
    List<ChildModelClass> childModelClasses;
    Context context;

    HomeChildAdapter.OnItemClick itemClick;

    public HomeChildAdapter(HomeChildAdapter.OnItemClick callback) {
        this.itemClick= callback;
    }

    @NonNull
    @Override
    public HomeChildAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.live_shows, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeChildAdapter.holder holder, int position) {
        holder.itemView.setOnClickListener(view -> {
            itemClick.onClick(position);

        });
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class holder extends RecyclerView.ViewHolder {
        ImageView liveLearning;
        public holder(@NonNull View itemView) {
            super(itemView);
            liveLearning=itemView.findViewById(R.id.livelearning);

        }
    }

    public interface OnItemClick {
        void onClick(int position);
    }
}

package com.app.socilon.adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.app.socilon.R;

public class My_events_Adapter extends RecyclerView.Adapter<My_events_Adapter.holder> {
    Context context;
    onItemClick onItemClick;

    public My_events_Adapter(Context context, My_events_Adapter.onItemClick onItemClick) {
        this.context = context;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public My_events_Adapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.my_events_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull My_events_Adapter.holder holder, int position) {
        holder.seeReviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onClick(holder.seeReviews.getId());
            }
        });

        holder.scanDocs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onClick(holder.scanDocs.getId());
            }
        });
        holder.addDocs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onClick(holder.addDocs.getId());
            }
        });




    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class holder extends RecyclerView.ViewHolder {
        AppCompatButton addDocs,seeReviews;
        ImageView scanDocs;
        public holder(@NonNull View itemView) {
            super(itemView);
            addDocs=itemView.findViewById(R.id.addNewDocs);
            scanDocs=itemView.findViewById(R.id.scan_docs);
            seeReviews=itemView.findViewById(R.id.seeReviews);

        }
    }
    public interface onItemClick{
        void onClick(int viewId);
    }
}

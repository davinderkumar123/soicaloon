package com.app.socilon.adpters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.socilon.R;

public class CartItemsAdapter extends RecyclerView.Adapter<CartItemsAdapter.holder> {
    @NonNull
    @Override
    public CartItemsAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.quantity_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CartItemsAdapter.holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class holder extends RecyclerView.ViewHolder {
        public holder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

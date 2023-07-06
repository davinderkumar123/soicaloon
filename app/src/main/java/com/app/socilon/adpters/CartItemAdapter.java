package com.app.socilon.adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.socilon.R;
import com.app.socilon.databinding.CartItemsBinding;
import com.app.socilon.databinding.ConsertsScreenListBinding;

import java.util.List;

import javax.security.auth.callback.Callback;

public class CartItemAdapter extends RecyclerView.Adapter<CartItemAdapter.holder> {
    Context context;
    Callback callback;
    private List<String> list;

    public CartItemAdapter(Context context, Callback callback, List<String> list) {
        this.context = context;
        this.callback = callback;
        this.list = list;
    }

    @NonNull
    @Override
    public CartItemAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     return  new holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CartItemAdapter.holder holder, int position) {
        String item = list.get(position);
        holder.bind(item, position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder {
        public holder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(String item, int position) {

        }
    }
}

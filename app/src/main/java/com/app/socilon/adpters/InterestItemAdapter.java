package com.app.socilon.adpters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.socilon.Models.CategoryItemModel;
import com.app.socilon.R;

import java.util.List;

public class InterestItemAdapter extends RecyclerView.Adapter<InterestItemAdapter.holder> {
 List<CategoryItemModel> items;

    public InterestItemAdapter(List<CategoryItemModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public InterestItemAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
 return new holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.interest_item_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull InterestItemAdapter.holder holder, int position) {
        CategoryItemModel item = items.get(position);
        holder.imageView.setImageResource(item.getDrawableId());
        holder.categories.setText(item.getText());


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class holder extends RecyclerView.ViewHolder {
        TextView categories;
        ImageView imageView;

        public holder(@NonNull View itemView) {
            super(itemView);
            categories=itemView.findViewById(R.id.categoriesId);
            imageView=itemView.findViewById(R.id.imgItems);
        }
    }

}

package com.app.socilon.adpters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.socilon.R;
import com.app.socilon.databinding.ConsertsScreenListBinding;


import java.util.List;
import java.util.Optional;

public class  ScreensAdapter extends RecyclerView.Adapter<ScreensAdapter.holder> {
    private Context context;
    private List<String> list;
    private OnItemClick onItemClick;
    int selectedItemPosition = RecyclerView.SCROLLBAR_POSITION_DEFAULT;

    public ScreensAdapter(Context context, List<String> list, OnItemClick onItemClick) {
        this.context = context;
        this.list = list;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ScreensAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ConsertsScreenListBinding binding = ConsertsScreenListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new holder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull ScreensAdapter.holder holder, int position) {
        String item = list.get(position);
        holder.bind(item, position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder {
        View itemView;
        TextView concertTextView;
        ConsertsScreenListBinding binding;
        public holder(@NonNull ConsertsScreenListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            this.itemView = binding.getRoot();
            this.concertTextView = itemView.findViewById(R.id.tv_concert);
        }

        @SuppressLint("ResourceAsColor")
        public void bind(String item, int position) {

                if (position == selectedItemPosition) {

//                    binding.tvConcert.setTextColor(R.color.white);

                    binding.rootLayout.setBackgroundResource(R.drawable.item_bg);

                } else {
                    binding.rootLayout.setBackgroundResource(R.drawable.capsule);
                    binding.rootLayout.setElevation(0);
                }

                binding.rootLayout.setOnClickListener(v -> {
                    if (selectedItemPosition != getAdapterPosition()) {

                        binding.rootLayout.setBackgroundResource(R.drawable.item_bg);

                        binding.rootLayout.setElevation(6);
                        if (selectedItemPosition != RecyclerView.NO_POSITION) {
                            notifyItemChanged(selectedItemPosition);
                        }
                        selectedItemPosition = getAdapterPosition();
                    } else {
                        binding.rootLayout.setBackgroundResource(R.drawable.capsule);
                        binding.rootLayout.setElevation(0);

                    }

                    onItemClick.onClick(getAdapterPosition());
                });

//                itemView.setOnClickListener(view -> {
//
//                });
            concertTextView.setText(list.get(getAdapterPosition()));
        }
    }

    public interface OnItemClick {
        void onClick(int position);
    }

}

package com.app.socilon.adpters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.socilon.R;
import com.app.socilon.appModelClasses.ParentModelClass;
import com.app.socilon.fragments.liveshow.LiveShoppingFragment;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.callback.Callback;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.holder> {
    List<ParentModelClass> parentModelClassList = new ArrayList<>();
    Context context;
    int size;
    OnItemClick itemClick;

    public HomeAdapter(OnItemClick callback) {
        this.itemClick= callback;
    }

    public HomeAdapter(int size) {
        this.size = size;
    }

    @NonNull
    @Override
    public HomeAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_recylar_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.holder holder, int position) {
        HomeChildAdapter childAdapter=new HomeChildAdapter(new HomeChildAdapter.OnItemClick() {
            @Override
            public void onClick(int position) {
//                FragmentManager fragmentManager= ((AppCompatActivity)context).getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.homeLayout, new LiveShoppingFragment());

                Navigation.findNavController(holder.itemView).navigate(R.id.action_homeFragment_to_liveShoppingFragment);
            }
        });
        holder.rvChildView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        holder.rvChildView.setAdapter(childAdapter);
        childAdapter.notifyDataSetChanged();

        holder.itemView.setOnClickListener(view -> {
//           itemClick.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return size;
    }

    public class holder extends RecyclerView.ViewHolder {
        RecyclerView rvChildView;
        public holder(@NonNull View itemView) {
            super(itemView);
            rvChildView = itemView.findViewById(R.id.rv_child);
        }
    }

    public interface OnItemClick {
        void onClick(int position);
    }
}

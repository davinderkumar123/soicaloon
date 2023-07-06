package com.app.socilon.adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.app.socilon.R;
import com.app.socilon.fragments.events.My_Events_Fragment;
import com.app.socilon.fragments.liveshow.ReviewsFragment;

public class PastEventsAdapter extends RecyclerView.Adapter<PastEventsAdapter.holder> {
    Context mcontext;

    CallbackClick callbackClick;


    public interface CallbackClick{
        void clickReviews(int viewId);
    }


    public PastEventsAdapter( Context mcontext, CallbackClick callbackClick) {
        this.mcontext = mcontext;
        this.callbackClick = callbackClick;

    }

    @NonNull
    @Override
    public PastEventsAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.past_events,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PastEventsAdapter.holder holder, int position) {
        holder.seeReviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callbackClick.clickReviews(holder.seeReviews.getId());


            }
        });
        holder.documentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callbackClick.clickReviews(holder.documentation.getId());


            }
        });

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class holder extends RecyclerView.ViewHolder {
        AppCompatButton seeReviews,documentation;
        public holder(@NonNull View itemView) {
            super(itemView);
            seeReviews=itemView.findViewById(R.id.seePastReviews);
            documentation=itemView.findViewById(R.id.seeDocumentation);

        }
    }

}

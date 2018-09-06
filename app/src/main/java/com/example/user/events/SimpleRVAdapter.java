package com.example.user.events;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.DialogFragment;

import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;

public class SimpleRVAdapter extends RecyclerView.Adapter<SimpleViewHolder> {
    List<Event> events;
    fragment1.FrgamentInteractionListener listener;
    public SimpleRVAdapter(fragment1.FrgamentInteractionListener listener, List<Event> events){
        this.events = events;
    }


    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = new TextView(parent.getContext());
        SimpleViewHolder viewHolder = new SimpleViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        holder.textView.setText(events.get(position).getname());
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // AppCompatActivity activity = (AppCompatActivity)v.getContext();
                //activity.getSupportFragmentManager().beginTransaction().replace(R.id.frag1, new fragment2()).addToBackStack(null).commit();
                listener.onEventSelect(null);
            }
        });
    }

    @Override
    public int getItemCount() {
        return events.size();
    }
}

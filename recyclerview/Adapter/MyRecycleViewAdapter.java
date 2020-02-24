package com.example.recyclerview.Adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.Storage.NoteStorage;
import com.example.recyclerview.View.ViewHolder;

import java.util.ArrayList;

public class MyRecycleViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<String> list;

    public MyRecycleViewAdapter(ArrayList<String> list){

        this.list = list;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LinearLayout ll = (LinearLayout)LayoutInflater.from(parent.getContext()).inflate(R.layout.customrow, parent, false);

        return new ViewHolder(ll);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.setData(position);

    }

    @Override
    public int getItemCount() {

        return NoteStorage.getLength();
    }

}

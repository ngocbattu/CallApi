package com.example.callapi.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.callapi.MainActivity;
import com.example.callapi.R;
import com.example.callapi.model.Cat;

import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.CatViewHodler>{
    private MainActivity context;
    private List<Cat> list;

    public CatAdapter(MainActivity context, List<Cat> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public CatViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recy_view_list_animal,null);
        return new CatViewHodler(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull CatViewHodler holder, int position) {
        Cat cat = list.get(position);
        Glide.with(context).load(cat.getUrl()).into(holder.imageAimal);
        String id = cat.getId();
        holder.imageAimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.DetailsCat(id);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CatViewHodler extends RecyclerView.ViewHolder {
        ImageView imageAimal;
        public CatViewHodler(@NonNull View itemView) {
            super(itemView);
            imageAimal = itemView.findViewById(R.id.imageCat);
        }
    }
}

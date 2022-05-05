package com.example.recyclerviewdemonewwithinterface.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemonewwithinterface.databinding.CustomItemLayoutBinding;
import com.example.recyclerviewdemonewwithinterface.interface1.SetOnClickListener;
import com.example.recyclerviewdemonewwithinterface.model.Item;

import java.util.List;

// 4
public class CustomItemAdapter extends RecyclerView.Adapter<CustomItemAdapter.MyViewHolder> {
    CustomItemLayoutBinding binding;
    private Context context;
    private List<Item> itemList;
    // i3 & create constructor also
    private SetOnClickListener setOnClickListener;

    public CustomItemAdapter(Context context, List<Item> itemList, SetOnClickListener setOnClickListener) {
        this.context = context;
        this.itemList = itemList;
        this.setOnClickListener = setOnClickListener;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = CustomItemLayoutBinding.inflate(LayoutInflater.from(context),parent,false);
        MyViewHolder holder = new MyViewHolder(binding);
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.binding.tvLogo.setImageResource(item.getImage());
        holder.binding.tvTitle.setText(item.getName());
        holder.binding.ratingBar.setRating(item.getRating());

        // i4
        holder.binding.cardClick.setOnClickListener(view -> {
            setOnClickListener.onItemClick(item,position);
        });

        /*holder.binding.cardClick.setOnClickListener(v -> {
            Toast.makeText(context, ""+item.getName(), Toast.LENGTH_SHORT).show();
        });*/
    }
    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        CustomItemLayoutBinding binding;
        public MyViewHolder(@NonNull CustomItemLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

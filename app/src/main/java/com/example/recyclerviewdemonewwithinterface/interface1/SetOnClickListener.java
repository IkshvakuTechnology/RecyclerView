package com.example.recyclerviewdemonewwithinterface.interface1;

import com.example.recyclerviewdemonewwithinterface.model.Item;

// 6
public interface SetOnClickListener {
    // i1
    void onItemClick(Item item,int position);
    void onLongItemClick(Item item, int position);
}

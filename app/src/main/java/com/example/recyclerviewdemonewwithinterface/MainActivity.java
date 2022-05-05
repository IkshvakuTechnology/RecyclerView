package com.example.recyclerviewdemonewwithinterface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.recyclerviewdemonewwithinterface.adapter.CustomItemAdapter;
import com.example.recyclerviewdemonewwithinterface.databinding.ActivityMainBinding;
import com.example.recyclerviewdemonewwithinterface.interface1.SetOnClickListener;
import com.example.recyclerviewdemonewwithinterface.model.Item;

import java.util.ArrayList;
import java.util.List;

// i2 & implement methods
public class MainActivity extends AppCompatActivity implements SetOnClickListener {
    // 5
    ActivityMainBinding binding;
    List<Item> itemList;
    CustomItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        prepareData();

        // i5 set interface in argument (Last this)
        adapter = new CustomItemAdapter(MainActivity.this, itemList, this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        // to show listview horizontaly
        // LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        // to show grid view
        // GridLayoutManager layoutManager = new GridLayoutManager(MainActivity.this,3);
        // to show Straggered
        // StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        // layout manager in recycle view
        binding.recycleView.setLayoutManager(layoutManager);
        binding.recycleView.setAdapter(adapter);
    }

    private void prepareData() {
        itemList = new ArrayList<>();

        itemList.add(new Item(1, "Instagram", 3.5f, R.drawable.ic_launcher_background));
        itemList.add(new Item(2, "Pinterest", 2.5f, R.drawable.pinterest));
        itemList.add(new Item(3, "YouTube", 3.f, R.drawable.youtube));
        itemList.add(new Item(4, "Twitter", 5.5f, R.drawable.twitter));
        itemList.add(new Item(5, "Whatsapp", 4.5f, R.drawable.whatsapp));
    }

    @Override
    public void onItemClick(Item item, int position) {
        // i6
        // Toast.makeText(this, ""+itemList.get(position).getName(), Toast.LENGTH_SHORT).show();
        //
        Toast.makeText(this, "" + item.getId()+"___"+position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLongItemClick(Item item, int position) {

    }
}
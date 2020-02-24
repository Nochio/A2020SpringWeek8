package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.Adapter.MyRecycleViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView = findViewById(R.id.recyclerView1);
    private RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new MyRecycleViewAdapter(getList()));
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    private ArrayList<String> getList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("The quick brown fox");
        list.add("Jump over the lazy thug");
        list.add("Again and again");
        list.add("Again and again and again");
        return list;
    }
}

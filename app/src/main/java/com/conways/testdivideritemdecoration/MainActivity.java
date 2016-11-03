package com.conways.testdivideritemdecoration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            list.add(i + "");
        }

        RecyclerView recyclerView = (RecyclerView) this.findViewById(R.id.rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(4,
                StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.addItemDecoration(new GridItemDecoration(this));
        MyAdapter myAdapter = new MyAdapter(list, this);
        recyclerView.setAdapter(myAdapter);
    }
}

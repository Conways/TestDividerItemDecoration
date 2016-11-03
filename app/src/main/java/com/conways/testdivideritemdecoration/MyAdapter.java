package com.conways.testdivideritemdecoration;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by John on 2016/11/2.
 */

public class MyAdapter extends RecyclerView.Adapter<Holder> {

    private List<String> list;
    private Context context;

    public MyAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.tv.setHeight(180+(position%4)*30);
        holder.tv.setText(list.get(position));
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(context).inflate(R.layout.item, parent, false));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

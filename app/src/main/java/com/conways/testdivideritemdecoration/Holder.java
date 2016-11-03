package com.conways.testdivideritemdecoration;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by John on 2016/11/2.
 */

public class Holder extends RecyclerView.ViewHolder {
    public TextView tv;

    public Holder(View itemView) {
        super(itemView);
        tv = (TextView) itemView.findViewById(R.id.textView);
    }
}

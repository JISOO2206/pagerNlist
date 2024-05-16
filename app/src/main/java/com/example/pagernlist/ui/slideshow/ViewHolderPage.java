package com.example.pagernlist.ui.slideshow;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pagernlist.R;
import com.example.pagernlist.ui.data.ViewPagerData;

public class ViewHolderPage extends RecyclerView.ViewHolder {

    private TextView tv_title;
    private RelativeLayout rl_layout;
    private ViewPagerData data;

    public ViewHolderPage(@NonNull View itemView) {
        super(itemView);
        tv_title = itemView.findViewById(R.id.tv_title);
        rl_layout = itemView.findViewById(R.id.rl_layout);
    }

    public void onDataBind(ViewPagerData data){
        this.data = data;
        tv_title.setText(data.getTitle());
        rl_layout.setBackgroundResource(data.getColor());
    }
}

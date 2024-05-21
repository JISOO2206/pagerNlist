package com.example.pagernlist.ui.slideshow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pagernlist.R;
import com.example.pagernlist.ui.data.ViewPagerData;

import java.util.ArrayList;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewHolderPage> {

    private ArrayList<ViewPagerData> listData;
    private Context context;

    public ViewPagerAdapter(Context context,ArrayList<ViewPagerData> listData) {
        this.context = context;
        this.listData = listData;
    }


    // RecyclerView에 들어갈 viewHolder를 할당하는 함수
    // ViewHolder은 실제 레이아웃 파일과 매핑되어야 하고, 상속 받을 Adapter의 타입에 따른다.
    @NonNull
    @Override
    public ViewHolderPage onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listview, parent, false);
        return new ViewHolderPage(view);
    }

    // 실제 각 뷰 홀더에 데이터를 연결해주는 함수
    @Override
    public void onBindViewHolder(@NonNull ViewHolderPage holder, int position) {
        if(holder instanceof ViewHolderPage){
            ViewHolderPage viewHolder = (ViewHolderPage) holder;
//            viewHolder.onDataBind(listData.get(position));
        }
    }

    // RecyclerView 안에 들어갈 ViewHolder의 갯수
    @Override
    public int getItemCount() {
        return listData.size();
    }
}

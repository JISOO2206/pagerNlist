package com.example.pagernlist.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.pagernlist.R;
import com.example.pagernlist.databinding.FragmentSlideshowBinding;
import com.example.pagernlist.ui.data.ViewPagerData;

import java.util.ArrayList;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    private ViewGroup viewGroup;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_pager, container, false);
//        SlideshowViewModel slideshowViewModel =
//                new ViewModelProvider(this).get(SlideshowViewModel.class);
//
//        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
//        View root = binding.getRoot();
//
//        final TextView textView = binding.textSlideshow;
//        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
//        return root;

        initViewPager();
        return viewGroup;
    }

    // viewPager 초기화 메서드
    private void initViewPager(){
        ArrayList<ViewPagerData> list = new ArrayList<>();
        list.add(new ViewPagerData(android.R.color.black,"1 Page"));
        list.add(new ViewPagerData(android.R.color.holo_red_light, "2 Page"));
        list.add(new ViewPagerData(android.R.color.holo_green_dark, "3 Page"));
        list.add(new ViewPagerData(android.R.color.holo_orange_dark, "4 Page"));
        list.add(new ViewPagerData(android.R.color.holo_blue_light, "5 Page"));
        list.add(new ViewPagerData(android.R.color.holo_blue_bright, "6 Page"));
        ViewPager2 viewPager = viewGroup.findViewById(R.id.viewPage2);

        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getActivity(),list);
        viewPager.setAdapter(pagerAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
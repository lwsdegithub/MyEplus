package com.example.myfragment.FragmentActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myfragment.R;
import com.yalantis.phoenix.PullToRefreshView;

/**
 * Created by 李维升 on 2017/10/16.
 */

public class Res_Fragment extends Fragment implements View.OnClickListener {
    private View view;
    private PullToRefreshView res_PullToRefreshView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.resourses_layout,container,false);
        init();
        return view;
    }

    private void init(){
        res_PullToRefreshView=view.findViewById(R.id.res_PullToRefresh);
        res_PullToRefreshView.setOnRefreshListener(new PullToRefreshView.OnRefreshListener() {
            @Override
            public void onRefresh() {
                res_PullToRefreshView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        res_PullToRefreshView.setRefreshing(false);
                    }
                },1000);
            }
        });
    }
    @Override
    public void onClick(View view) {
    }
}

package com.example.myfragment.FragmentActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myfragment.R;
import com.yalantis.phoenix.PullToRefreshView;

/**
 * Created by 李维升 on 2017/10/16.
 */

public class Demands_Fragment extends Fragment implements View.OnClickListener {
    private View view;
    private PullToRefreshView demands_PullToRefreshView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.demands_layout,container,false);
        init();
        return view;
    }
    private void init(){
        demands_PullToRefreshView=view.findViewById(R.id.demands_PullToRefresh);
        demands_PullToRefreshView.setOnRefreshListener(new PullToRefreshView.OnRefreshListener() {
            @Override
            public void onRefresh() {
                demands_PullToRefreshView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        demands_PullToRefreshView.setRefreshing(false);
                    }
                },1000);
            }
        });
    }

    @Override
    public void onClick(View view) {
    }
}

package com.example.myfragment.FragmentActivity;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.myfragment.ActivitiesInMineLayout.AboutActivity;
import com.example.myfragment.ActivitiesInMineLayout.AdviceDialog;
import com.example.myfragment.R;

import net.lemonsoft.lemonhello.LemonHello;
import net.lemonsoft.lemonhello.LemonHelloAction;
import net.lemonsoft.lemonhello.LemonHelloInfo;
import net.lemonsoft.lemonhello.LemonHelloView;
import net.lemonsoft.lemonhello.interfaces.LemonHelloActionDelegate;

/**
 * Created by 李维升 on 2017/10/16.
 */

public class Mine_Fragment extends Fragment implements View.OnClickListener{
    private View view;
    private RelativeLayout personal_information;
    private RelativeLayout my_favorite;
    private RelativeLayout my_submit;
    private RelativeLayout share;
    private RelativeLayout advice;
    private RelativeLayout about;

    private LemonHelloInfo lemonHelloInfo;
    //private AdviceDialog adviceDialog;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.mine_layout,container,false);
        initView();
        return view;
    }
    private void initView(){
        personal_information=view.findViewById(R.id.personal_information_Layout);
        my_favorite=view.findViewById(R.id.my_favorite_Layout);
        my_submit=view.findViewById(R.id.my_Submit);
        share=view.findViewById(R.id.share_Layout);
        advice=view.findViewById(R.id.advice_Layout);
        about=view.findViewById(R.id.about_Layout);

        personal_information.setOnClickListener(this);
        my_favorite.setOnClickListener(this);
        my_submit.setOnClickListener(this);
        share.setOnClickListener(this);
        advice.setOnClickListener(this);
        about.setOnClickListener(this);
        //adviceDialog=new AdviceDialog(getActivity());
        //adviceDialog.setTitle("吐槽一下");
    }
    //设置监听，实现跳转
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.personal_information_Layout:
                //如果已经登录则跳转到个人资料界面，如果没有登录则跳转到登录界面
                break;
            case R.id.my_favorite_Layout:
                break;
            case R.id.my_Submit:
                break;
            case R.id.share_Layout:
                break;
            case R.id.advice_Layout:
                lemonHelloInfo.show(getActivity());
                //adviceDialog.show();
                break;
            case R.id.about_Layout:
                startActivity(new Intent(getActivity(), AboutActivity.class));
                break;
            default:
                break;
        }
    }

}

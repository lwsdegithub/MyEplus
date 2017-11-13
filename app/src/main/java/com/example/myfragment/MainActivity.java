package com.example.myfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myfragment.FragmentActivity.Demands_Fragment;
import com.example.myfragment.FragmentActivity.Mine_Fragment;
import com.example.myfragment.FragmentActivity.Res_Fragment;
import com.example.myfragment.FragmentActivity.New_Fragment;

/**
 * Created by 李维升 on 2017/10/15.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Res_Fragment res_fragment;
    private Demands_Fragment demands_fragment;
    private New_Fragment new_fragment;
    private Mine_Fragment mine_fragment;

    private LinearLayout res_Tab_Layout;
    private LinearLayout demands_Tab_Layout;
    private LinearLayout new_Tab_Layout;
    private LinearLayout mine_Tab_Layout;

    private FragmentManager fragmentManager;

    private TextView titleTextView;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initView();
        fragmentManager=getFragmentManager();
        this.setTabSelected(0);
    }

    private void initView(){
        res_Tab_Layout= (LinearLayout) findViewById(R.id.Msg_Tab_Layout);
        demands_Tab_Layout= (LinearLayout) findViewById(R.id.Friends_Tab_Layout);
        new_Tab_Layout= (LinearLayout) findViewById(R.id.Social_Tab_Layout);
        mine_Tab_Layout= (LinearLayout) findViewById(R.id.Mine_Tab_Layout);
        titleTextView= (TextView) findViewById(R.id.Demo_Title_TextView);
        this.res_Tab_Layout.setOnClickListener(this);
        this.demands_Tab_Layout.setOnClickListener(this);
        this.new_Tab_Layout.setOnClickListener(this);
        this.mine_Tab_Layout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Msg_Tab_Layout:
                titleTextView.setText(R.string.msg_string);
                this.setTabSelected(0);
                break;
            case R.id.Friends_Tab_Layout:
                titleTextView.setText(R.string.friends_string);
                this.setTabSelected(1);
                break;
            case R.id.Social_Tab_Layout:
                titleTextView.setText(R.string.social_string);
                this.setTabSelected(2);
                break;
            case R.id.Mine_Tab_Layout:
                titleTextView.setText(R.string.mine_string);
                this.setTabSelected(3);
                break;
            default:
                break;
        }
    }

    public void setTabSelected(int index){
        reSetBtn();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        hideFragments(fragmentTransaction);
        switch (index){
            case 0:
                ((ImageView)res_Tab_Layout.findViewById(R.id.Msg_Img)).setImageResource(R.drawable.res_ped);
                if (res_fragment ==null){
                    res_fragment =new Res_Fragment();
                    fragmentTransaction.add(R.id.content, res_fragment);
                }
                else {
                    fragmentTransaction.show(res_fragment);
                }
                break;
            case 1:
                ((ImageView)demands_Tab_Layout.findViewById(R.id.Friends_Img)).setImageResource(R.drawable.demands_ped);
                if (demands_fragment ==null){
                    demands_fragment =new Demands_Fragment();
                    fragmentTransaction.add(R.id.content, demands_fragment);
                }
                else {
                    fragmentTransaction.show(demands_fragment);
                }
                break;
            case 2:
                ((ImageView)new_Tab_Layout.findViewById(R.id.Social_Img)).setImageResource(R.drawable.new_ped);
                if (new_fragment ==null){
                    new_fragment =new New_Fragment();
                    fragmentTransaction.add(R.id.content, new_fragment);
                }
                else {
                    fragmentTransaction.show(new_fragment);
                }
                break;
            case 3:
                ((ImageView)mine_Tab_Layout.findViewById(R.id.Mine_Img)).setImageResource(R.drawable.mine_ped);
                if (mine_fragment==null){
                    mine_fragment=new Mine_Fragment();
                    fragmentTransaction.add(R.id.content,mine_fragment);
                }
                else {
                    fragmentTransaction.show(mine_fragment);
                }
                break;
        }
        fragmentTransaction.commit();
    }
    private void reSetBtn(){
        ((ImageView)res_Tab_Layout.findViewById(R.id.Msg_Img)).setImageResource(R.drawable.res_unp);
        ((ImageView)demands_Tab_Layout.findViewById(R.id.Friends_Img)).setImageResource(R.drawable.demands_unp);
        ((ImageView)new_Tab_Layout.findViewById(R.id.Social_Img)).setImageResource(R.drawable.new_unp);
        ((ImageView)mine_Tab_Layout.findViewById(R.id.Mine_Img)).setImageResource(R.drawable.mine_unp);

    }
    private void hideFragments(FragmentTransaction transaction)
    {
        if (res_fragment != null)
        {
            transaction.hide(res_fragment);
        }
        if (demands_fragment != null)
        {
            transaction.hide(demands_fragment);
        }
        if (new_fragment != null)
        {
            transaction.hide(new_fragment);
        }
        if (mine_fragment != null)
        {
            transaction.hide(mine_fragment);
        }
    }

}

package com.example.myfragment.ActivitiesInMineLayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myfragment.FragmentActivity.Mine_Fragment;
import com.example.myfragment.MainActivity;
import com.example.myfragment.R;

/**
 * Created by 李维升 on 2017/11/1.
 */

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView arrow_To_Left_Text;
    private ImageView arrow_TO_Left_Image;
    private TextView textView_ImageView_UpgradeText;
    private TextView textView_ImageView_AboutUsText;
    private RelativeLayout upgrade;
    private RelativeLayout aboutUs;
    private AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity_layout);
        initView();
    }
    private void initView(){
        alertDialog=new AlertDialog.Builder(this);
        //返回栏
        arrow_To_Left_Text=findViewById(R.id.arrow_to_left_text);
        arrow_To_Left_Text.setText("关于");
        arrow_TO_Left_Image=findViewById(R.id.arrow_to_left_image);
        arrow_TO_Left_Image.setOnClickListener(this);
        //具体的item
        upgrade=findViewById(R.id.upgrade);
        aboutUs=findViewById(R.id.about_Us);
        textView_ImageView_UpgradeText=upgrade.findViewById(R.id.textview_imageview_text);
        textView_ImageView_AboutUsText=aboutUs.findViewById(R.id.textview_imageview_text);
        upgrade.setOnClickListener(this);
        aboutUs.setOnClickListener(this);
        textView_ImageView_UpgradeText.setText("检测更新");
        textView_ImageView_AboutUsText.setText("关于我们");

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.arrow_to_left_image:
                finish();
                break;
            case R.id.upgrade:
                alertDialog.setMessage("当前已是最新版本").setIcon(R.drawable.up_arrow).create().show();
                break;
            case R.id.about_Us:
                alertDialog.setMessage("本应用提供华科校园内二手图书的租借和买卖服务，由华中科技大学Eplus团队制作").show();
                break;
            default:
                break;
        }

    }
}

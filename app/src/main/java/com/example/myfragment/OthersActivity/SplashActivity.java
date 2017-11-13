package com.example.myfragment.OthersActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.myfragment.MainActivity;
import com.example.myfragment.R;

/**
 * Created by 李维升 on 2017/10/31.
 */

public class SplashActivity extends AppCompatActivity {
    private Button splashJumpBtn;
    private static final int START_ACTIVITY=0;
    private boolean InMainActivity=false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
        splashJumpBtn = findViewById(R.id.splash_jump_button);
        splashJumpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InMainActivity=true;
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        });
        handler.sendEmptyMessageDelayed(START_ACTIVITY,3000);
    }
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if (InMainActivity==false) {
                super.handleMessage(msg);
                if (msg.what==START_ACTIVITY){
                    startActivity(new Intent(SplashActivity.this,MainActivity.class));
                    finish();
                }
            }
        }
    };

}

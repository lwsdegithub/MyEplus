package com.example.myfragment.ActivitiesInMineLayout;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.view.View;

import com.example.myfragment.R;
/**
 * Created by 李维升 on 2017/11/1.
 */

public class AdviceDialog extends AlertDialog {
    public AdviceDialog(@NonNull Context context) {
        super(context);
    }

    public AdviceDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCanceledOnTouchOutside(false);
    }

    @Override
    public void setView(View view) {
        super.setView(view);
    }
    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }

}

package com.example.myfragment.ActivitiesInMineLayout;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
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
        setContentView(R.layout.advice_dialog_layout);
        setCanceledOnTouchOutside(false);
    }
}

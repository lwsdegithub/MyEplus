package com.example.myfragment.FragmentActivity;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myfragment.R;
import com.example.myfragment.ViewsDesignedByMySelf.SubmitButton;

import java.util.Calendar;
import java.util.zip.Inflater;

import static android.view.View.*;

/**
 * Created by 李维升 on 2017/10/16.
 */

public class New_Fragment extends Fragment implements OnClickListener, com.wdullaer.materialdatetimepicker.date.DatePickerDialog.OnDateSetListener {
    private View view;
    private RadioButton res_RadioBtn;
    private RadioButton demands_RadioBtn;
    private EditText newTelNumberEt;
    private EditText newUserLastNameEt;
    private EditText newBookNameEt;
    private TextView newDeadLineTv;
    private EditText newDetailsEt;
    private SubmitButton submitButton;
    private Calendar now=Calendar.getInstance();
    private com.wdullaer.materialdatetimepicker.date.DatePickerDialog datePickerDialog;
    private int year;
    private int month;
    private int day;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.new_layout,container,false);
        this.initView();
        return view;
    }
    private void initView(){
        res_RadioBtn=view.findViewById(R.id.res_RadioBtn);
        demands_RadioBtn=view.findViewById(R.id.demands_RadioBtn);
        newTelNumberEt=view.findViewById(R.id.newTelNumberEt);
        newUserLastNameEt=view.findViewById(R.id.newUserLastNameEt);
        newBookNameEt=view.findViewById(R.id.newBookNameEt);
        newDeadLineTv=view.findViewById(R.id.newDeadLineTv);
        newDetailsEt=view.findViewById(R.id.newDetailsEt);
        //实例化自定义的submitBtn
        submitButton=view.findViewById(R.id.submit_Btn);
        submitButton.setBackColor(0xff0097cd);
        submitButton.setProgress(1);
        submitButton.setText("提交");
        submitButton.setOnProgressStart(new SubmitButton.OnProgressStart() {
            @Override
            public void progressStart(){

            }
        });
        submitButton.setOnProgressDone(new SubmitButton.OnProgressDone() {
            @Override
            public void progressDone() {

            }
        });
        datePickerDialog= com.wdullaer.materialdatetimepicker.date.DatePickerDialog.newInstance(this,now.get(Calendar.YEAR),now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH));
        //设置监听
        newDeadLineTv.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        //点击日期选择TextView,弹出dialogDatePicker
        if (view.getId()==R.id.newDeadLineTv){
            datePickerDialog.show(getFragmentManager(),null);
        }
    }
    //设置选择的日期
    @Override
    public void onDateSet(com.wdullaer.materialdatetimepicker.date.DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        this.year=year;
        this.month=monthOfYear+1;
        this.day=dayOfMonth;
        newDeadLineTv.setText(year+"年"+month+"月"+day+"日");
    }
}

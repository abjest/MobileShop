package com.lwq.mobileshop2.activity;


import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import com.lwq.mobileshop2.R;
import com.lwq.mobileshop2.common.BaseActivity;
import com.lwq.mobileshop2.fragment.NavigationFragment;

import java.io.IOException;

public class MainActivity extends BaseActivity {


    @Override
    public @LayoutRes
    int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        super.initView();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl_main,new NavigationFragment());
        transaction.commit();
    }
}



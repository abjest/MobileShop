package com.lwq.mobileshop2.fragment;

import androidx.recyclerview.widget.RecyclerView;

import com.lwq.mobileshop2.R;
import com.lwq.mobileshop2.adapter.CategroyLeftAdapter;
import com.lwq.mobileshop2.adapter.CategroyRightAdapter;
import com.lwq.mobileshop2.common.BaseFragment;
import com.lwq.mobileshop2.http.ProgressDialogSubscriber;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class CartFragment extends BaseFragment {


    @Override
    public int getContentViewId() {
        return R.layout.fragment_cart;
    }
}

package com.powyin.nestscroll.adapter;

import android.app.Activity;
import android.view.ViewGroup;

import com.powyin.nestscroll.R;
import com.powyin.nestscroll.net.DataModel;
import com.powyin.scroll.adapter.AdapterDelegate;
import com.powyin.scroll.adapter.MultipleListAdapter;
import com.powyin.scroll.adapter.MultipleRecycleAdapter;
import com.powyin.scroll.adapter.PowViewHolder;

/**
 * Created by powyin on 2016/7/21.
 */
public class TypePowViewHolder_Text extends PowViewHolder<DataModel> {
    public TypePowViewHolder_Text(Activity activity, ViewGroup viewGroup) {
        super(activity,viewGroup);
        registerItemClick(R.id.avatar);
    }
    @Override
    protected int getItemViewRes() {
        return R.layout.view_holder_type_text;
    }

    @Override
    protected boolean acceptData(DataModel data) {
        return data.type==1;
    }

    @Override
    public void loadData(AdapterDelegate<? super DataModel> multipleAdapter, DataModel data, int postion) {

    }

    @Override
    protected boolean isEnableDragAndDrop() {
        return true;
    }
}

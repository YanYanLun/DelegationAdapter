package com.kevin.delegationadapter.sample.samedata.adapter;

import android.databinding.ViewDataBinding;

import com.android.databinding.library.baseAdapters.BR;
import com.kevin.delegationadapter.extras.binding.BindingAdapterDelegate;
import com.kevin.delegationadapter.sample.R;
import com.kevin.delegationadapter.sample.samedata.bean.Bill;

/**
 * ServiceInfoDelegateAdapter
 *
 * @author zwenkai@foxmail.com, Created on 2018-04-28 16:33:18
 *         Major Function：<b></b>
 *         <p/>
 *         注:如果您修改了本类请填写以下内容作为记录，如非本人操作劳烦通知，谢谢！！！
 * @author mender，Modified Date Modify Content:
 */

public class ServiceInfoDelegateAdapter extends BindingAdapterDelegate<Bill> {

    public static final String TAG = "ServiceInfoDelegateAdapter";

    public ServiceInfoDelegateAdapter() {
        super(TAG);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_bill_service_info;
    }

    @Override
    public void setVariable(ViewDataBinding binding, Bill item, int position) {
        binding.setVariable(BR.model, item);
    }
}

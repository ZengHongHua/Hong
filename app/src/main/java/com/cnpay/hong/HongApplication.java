package com.cnpay.hong;

import android.app.Application;

import org.xutils.x;

/**
 * @author zenghonghua
 * @包名: com.cnpay.hong
 * @修改记录:
 * @公司: 深圳华夏通宝信息技术有限公司
 * @date 2016/2/15 0015
 */
public class HongApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化xUtils3
        x.Ext.init(this);
        x.Ext.setDebug(true);
    }
}

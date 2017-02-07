package com.asiainfo.jpush.base;

import android.app.Application;
import android.util.Log;

import cn.jpush.android.api.JPushInterface;

/**
 * 作者:小木箱 邮箱:yangzy3@asiainfo.com 创建时间:2017年02月07日14点59分 描述:
 */
public class ExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("ExampleApplication", "[ExampleApplication] onCreate");
        super.onCreate();

        JPushInterface.setDebugMode(true); 	// 设置开启日志,发布时请关闭日志
        JPushInterface.init(this);     		// 初始化 JPush
    }
}

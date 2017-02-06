package com.asiainfo.jpush.activity;

import android.app.Activity;
import android.os.Bundle;

import com.asiainfo.jpush.R;

import cn.jpush.android.api.JPushInterface;

/**
 * 描述:Jupsh极光推送 创建时间:2/6/17/18:06 作者:小木箱 邮箱:yangzy3@asiainfo.com
 */

public class JPushActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jpush);

        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}

package com.cs.common.utils;

import android.util.Log;

/**
 * author : ChenSen
 * data : 2019/6/21
 * desc:
 */
public class LogUtils {

    public static void logi(String msg) {
        Log.i("tag", msg);
    }

    public static void log(String msg) {
        Log.d("tag", msg);
    }
}

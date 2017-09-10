package io.github.dearzack.jardependence;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * Created by Zack on 2017/9/10.
 */

public class APP extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}

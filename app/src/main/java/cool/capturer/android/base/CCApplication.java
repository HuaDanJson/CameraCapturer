package cool.capturer.android.base;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

public class CCApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}

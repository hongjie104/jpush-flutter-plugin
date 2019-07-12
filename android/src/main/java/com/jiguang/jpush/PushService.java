//package com.jiguang.jpush;
//
//import android.app.Notification;
//import android.app.Service;
//import android.content.Intent;
//import android.content.res.Configuration;
//import android.os.IBinder;
//import android.text.TextUtils;
//import cn.jiguang.ab.f;
//import cn.jiguang.ac.d;
//import cn.jiguang.d.b;
//import cn.jpush.android.service.DataShare;
//
//public class PushService extends Service {
//    private static b mBinder = null;
//
//    public PushService() {
//    }
//
//    public final void onCreate() {
//        super.onCreate();
//        if (mBinder == null) {
//            mBinder = new DataShare();
//        }
//        startForeground(1,new Notification());
//    }
//
//    public final boolean onUnbind(Intent var1) {
//        return super.onUnbind(var1);
//    }
//
//    public final void onDestroy() {
//        super.onDestroy();
//    }
//
//    public final void onConfigurationChanged(Configuration var1) {
//        super.onConfigurationChanged(var1);
//    }
//
//    public final void onLowMemory() {
//        super.onLowMemory();
//    }
//
//    public final void onRebind(Intent var1) {
//        super.onRebind(var1);
//    }
//
//    public final void onTaskRemoved(Intent var1) {
//        super.onTaskRemoved(var1);
//    }
//
//    public final void onTrimMemory(int var1) {
//        super.onTrimMemory(var1);
//    }
//
//    public final void onStart(Intent var1, int var2) {
//        super.onStart(var1, var2);
//    }
//
//    public final IBinder onBind(Intent var1) {
//        return mBinder;
//    }
//
//    public final int onStartCommand(Intent var1, int var2, int var3) {
//        if (var1 != null && !TextUtils.isEmpty(var1.getAction())) {
//            f.a(this, var1.getAction(), var1.getExtras());
//        } else {
//            d.f("JCommonService", "onStartCommand intent is empty or action is empty");
//        }
//
//        return super.onStartCommand(var1, var2, var3);
//    }
//}
//


package com.jiguang.jpush;

import cn.jpush.android.service.JCommonService;

public class PushService extends JCommonService {

}
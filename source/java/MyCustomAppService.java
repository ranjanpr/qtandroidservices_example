package org.qtproject.example;

import android.app.Service;
import android.os.IBinder;
import android.content.Intent;
import android.os.Bundle;
import org.qtproject.qt5.android.bindings.QtService;
import android.util.Log;

public class MyCustomAppService extends QtService {

   /** Called when the service is being created. */
   @Override
   public void onCreate() {
      super.onCreate();
      Log.i("Service", "Service onCreate!");
   }

   /** The service is starting, due to a call to startService() */
   @Override
   public int onStartCommand(Intent intent, int flags, int startId) {
      int ret = super.onStartCommand(intent, flags, startId);
      Log.i("Service", "Service onStartCommand!");
      return ret;
      //return mStartMode;
   }

   /** A client is binding to the service with bindService() */
   @Override
   public IBinder onBind(Intent intent) {
      IBinder ret = super.onBind(intent);
      Log.i("Service", "Service onStartCommand!");
      return ret;
      //return mBinder;
   }

   /** Called when all clients have unbound with unbindService() */
   @Override
   public boolean onUnbind(Intent intent) {
      boolean ret = super.onUnbind(intent);
      Log.i("Service", "Service onUnbind!");
      return ret;
   }

   /** Called when a client is binding to the service with bindService()*/
   @Override
   public void onRebind(Intent intent) {
         super.onRebind(intent);
         Log.i("Service", "Service onRebind!");
   }

   /** Called when The service is no longer used and is being destroyed */
   @Override
   public void onDestroy() {
      super.onDestroy();
      Log.i("Service", "Service onDestroy!");
   }
}

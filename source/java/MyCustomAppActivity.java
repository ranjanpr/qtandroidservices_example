package org.qtproject.example;

import org.qtproject.example.R;
import org.qtproject.qt5.android.bindings.QtActivity;
import org.qtproject.qt5.android.bindings.QtService;
import org.qtproject.example.MyCustomAppService;
import android.content.Intent;
import android.util.Log;
import android.os.Bundle;

public class MyCustomAppActivity extends QtActivity {
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i("Activity", "onCreate Activity!");
        Intent serviceIntent = new Intent(this, org.qtproject.example.MyCustomAppService.class);
        startService(serviceIntent);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity", "onResume Activity!");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("Activity", "onSaveInstanceState Activity!");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.i("Activity", "onPause Activity!");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Activity", "onDestroy Activity!");
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i("Activity", "onActivityResult Activity!");
    }
}

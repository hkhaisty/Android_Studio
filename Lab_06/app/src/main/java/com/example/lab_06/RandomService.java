package com.example.lab_06;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.view.View;
import android.widget.Toast;

public class RandomService extends Service {

    protected char[] dict = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();

        for (int i = 0; i < 100; i++) {

            double random = Math.random() * 26;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(dict[(int) random]);
        }

        return START_STICKY;
    }

    public void stopService(View v){
        Intent serviceIntent = new Intent(this, MainActivity.class);
        stopService(serviceIntent);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

}

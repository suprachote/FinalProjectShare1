package com.google.android.gms.samples.vision.face.facetracker;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openFaceTrackingActivity(View view){
        Intent intent = new Intent(this, FaceTrackerActivity.class);
        startActivity(intent);
    }
}

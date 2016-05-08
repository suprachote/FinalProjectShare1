package com.google.android.gms.samples.vision.face.facetracker;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import android.support.v7.internal.VersionUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;

public class MainActivity extends Activity {
    TextView myLabel;
    EditText myTextbox;
    BluetoothArduino mBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set up
        myTextbox = (EditText)findViewById(R.id.entry);
        myLabel = (TextView) findViewById(R.id.BluetoothStatusText);
        //create bluetooth
        mBlue = BluetoothArduino.getInstance("EIEI");
        mBlue.Connect();


    }
    /*protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == REQUEST_BLUETOOTH_ENABLE) {
            // Make sure the request was successful
            if (resultCode == RESULT_CANCELED)  // not enable bluetooth
            {
                finish();
                System.exit(0);
            }
        }
    }*/
    public void openFaceTrackingActivity(View view){
        Intent intent = new Intent(this, FaceTrackerActivity.class);
        startActivity(intent);
    }
    public void onClickCheckConnection(View view){
        /*try{
            BT.findBT();
            BT.openBT();
        }
        catch (IOException ex){}*/
    }
    public void onClickSend(View view){
        /*try{
            BT.sendData(myTextbox.getText().toString());
        }catch (IOException ex){}*/
        mBlue.SendMessage(myTextbox.getText().toString());
    }
}

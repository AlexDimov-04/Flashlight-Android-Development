package com.example.flashlight;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layout;
    CameraManager cameraManager;
    String cameraId;
    Boolean state=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=findViewById(R.id.cl);
        layout.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(state == false) {
                    try{
                        cameraManager = (CameraManager) getSystemService(CAMERA_SERVICE);
                        cameraId = cameraManager.getCameraIdList()[0];
                        cameraManager.setTorchMode(cameraId, !state);
                        layout.setBackgroundResource(R.drawable.on);
                        state = true;

                    } catch (CameraAccessException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    try {
                        cameraManager = (CameraManager) getSystemService(CAMERA_SERVICE);
                        cameraId = cameraManager.getCameraIdList()[0];
                        cameraManager.setTorchMode(cameraId, !state);
                        layout.setBackgroundResource(R.drawable.off);
                        state = false;
                    } catch (CameraAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
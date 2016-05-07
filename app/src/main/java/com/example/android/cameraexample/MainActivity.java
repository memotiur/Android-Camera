package com.example.android.cameraexample;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void camera(View v){
         Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
         startActivityForResult(intent,0);
     }

    public void video(View v){
        Intent intent=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        startActivityForResult(intent,0);
    }
}

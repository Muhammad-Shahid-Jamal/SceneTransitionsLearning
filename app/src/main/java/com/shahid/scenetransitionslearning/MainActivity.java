package com.shahid.scenetransitionslearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    ViewGroup rootContainer;
    Scene scene1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootContainer = (ViewGroup) findViewById(R.id.root_container);
        scene1 = Scene.getSceneForLayout(rootContainer,R.layout.scene1_layout,this);
        scene1.enter();
    }
}

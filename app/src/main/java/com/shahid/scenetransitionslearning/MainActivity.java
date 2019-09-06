package com.shahid.scenetransitionslearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    ViewGroup rootContainer;
    Scene scene1,scene2;
    Transition bound ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootContainer = (ViewGroup) findViewById(R.id.root_container);
        scene1 = Scene.getSceneForLayout(rootContainer,R.layout.scene1_layout,this);
        scene2 = Scene.getSceneForLayout(rootContainer,R.layout.scene2_layout,this);
        scene1.enter();
//        bound= new ChangeBounds();
        bound = TransitionInflater.from(this).inflateTransition(R.transition.transition);
    }
    public void goToScene1(View view){
//        bound.setDuration(500);
        TransitionManager.go(scene2,bound);
    }
    public void goToScene2(View view){
//        bound.setDuration(500);
        TransitionManager.go(scene1,bound);
    }
}

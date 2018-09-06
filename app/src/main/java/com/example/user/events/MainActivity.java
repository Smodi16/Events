package com.example.user.events;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements
fragment1.FrgamentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm=getSupportFragmentManager();
        fragment1 fragment1= new fragment1();
        fragment2 fragment2=new fragment2();
        // Fragment f=fm.findFragmentById(R.id.frag);

       fm.beginTransaction().add(R.id.frag1,fragment1).commit();
       fm.beginTransaction().add(R.id.frag2,fragment2).commit();
    }

    @Override
    public void onEventSelect(Event event) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frag1,new fragment2(),"fragment 2");
        ft.commit();
    }


}

package com.rjp.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("master 2222222222222222222222");
        System.out.println("master 3333333333333333333333");
        System.out.println("dev 111111111111111");

    }
}

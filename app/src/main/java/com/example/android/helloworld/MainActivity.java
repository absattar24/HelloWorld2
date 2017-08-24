package com.example.android.helloworld;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void TestPrint()
    {
        System.out.println("Test String Github");
        System.out.println("Test2 - after Git post, String Github");

    }
}

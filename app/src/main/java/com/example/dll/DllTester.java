package com.example.dll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DllTester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DLL dll = new DLL();
        dll.pop();
    }
}
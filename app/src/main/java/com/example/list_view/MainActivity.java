package com.example.list_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity<AppCompatActivity> extends AppCompatActivity {
    String[] con = {"Asia","Africa","Europe","America"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}

package com.matpag.dagger.starter.main;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.TextView;

import com.matpag.dagger.starter.BaseActivity;
import com.matpag.dagger.starter.R;
import com.matpag.dagger.starter.second.SecondActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    String commonString;

    @Inject
    Boolean myFalseBoolean;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView)findViewById(R.id.activity_text);
        text.setText(commonString + " " + myFalseBoolean);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}

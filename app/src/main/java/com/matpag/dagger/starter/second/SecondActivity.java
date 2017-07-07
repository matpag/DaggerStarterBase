package com.matpag.dagger.starter.second;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.matpag.dagger.starter.BaseActivity;
import com.matpag.dagger.starter.R;

import javax.inject.Inject;

public class SecondActivity extends BaseActivity {

    @Inject
    String commonString;

    @Inject
    Boolean myTrueBoolean;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView text = (TextView)findViewById(R.id.activity_text);
        text.setText(commonString + " " + myTrueBoolean);
    }
}

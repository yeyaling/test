package com.dming.starbar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean isInteger = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView displayTv = (TextView) findViewById(R.id.display);
        final StarBar starBar = (StarBar) findViewById(R.id.starBar);
        starBar.setOnStarChangeListener(new StarBar.OnStarChangeListener() {
            @Override
            public void onStarChange(float mark) {
                displayTv.setText("当前评分为："+mark);
            }
        });
        findViewById(R.id.she3_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                starBar.setStarMark(3.6f);
            }
        });
        findViewById(R.id.getStar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayTv.setText("当前评分为："+starBar.getStarMark());
            }
        });
        findViewById(R.id.integer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isInteger = !isInteger;
                Button button = (Button) v;
                starBar.setIntegerMark(isInteger);
                button.setText("整数评分: "+isInteger);
            }
        });
    }
}

package com.ocnyang.variationviewpager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.defaultStyle).setOnClickListener(this);
        findViewById(R.id.cardStyle).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.defaultStyle:
                startActivity(new Intent(this,ViewPagerActivity.class));
                break;
            case R.id.cardStyle:
                startActivity(new Intent(this,CardViewPagerActivity.class));
                break;
            default:

                break;
        }
    }
}

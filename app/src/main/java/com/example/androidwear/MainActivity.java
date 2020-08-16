package com.example.androidwear;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends WearableActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);

        // Enables Always-on
        setAmbientEnabled();
    }

    public void clickButton(View view) {
        if (getResources().getConfiguration().isScreenRound()) { //if watch face is round...
            Toast.makeText(this, "ROUND!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "SQUARE!", Toast.LENGTH_SHORT).show();
        }
    }
}

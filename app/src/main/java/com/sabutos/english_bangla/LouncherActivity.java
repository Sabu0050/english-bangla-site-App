package com.sabutos.english_bangla;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

public class LouncherActivity extends AppCompatActivity {

    private ProgressBar spinner;
    int progress = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_louncher);


        spinner=(ProgressBar)findViewById(R.id.progressBar);
        spinner.setVisibility(View.VISIBLE);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(LouncherActivity.this,MainActivity.class));
                finish();
            }
        },6000);

    }
}

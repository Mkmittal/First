package com.example.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.TextView;

public class pop extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = (int) ((dm.widthPixels)*.9);
        int height = (int) (dm.heightPixels*.12);
        Intent intent;
        intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        message=message+", welcome to QSTP";
        TextView textView;
        textView = findViewById(R.id.textView2);
        textView.setText(message);
        WindowManager.LayoutParams params = getWindow().getAttributes();
        //params.gravity= Gravity.BOTTOM;
        params.x=0;
        params.y=300;
        getWindow().setAttributes(params);

        getWindow().setLayout( width,height);

    }
}

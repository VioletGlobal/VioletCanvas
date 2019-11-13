package com.violet.canvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class view extends AppCompatImageView{

        public view(Context context) {
            super(context);
        }

        public view(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public view(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }
    }
}

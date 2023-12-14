package com.abdullaev.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button visible, inVisible;

    Button mc, mr, ms, mPlus, mMinus;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view();
        visible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc.setVisibility(View.VISIBLE);
                mr.setVisibility(View.VISIBLE);
                ms.setVisibility(View.VISIBLE);
                mPlus.setVisibility(View.VISIBLE);
                mMinus.setVisibility(View.VISIBLE);
            }
        });

        inVisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc.setVisibility(View.INVISIBLE);
                mr.setVisibility(View.INVISIBLE);
                ms.setVisibility(View.INVISIBLE);
                mPlus.setVisibility(View.INVISIBLE);
                mMinus.setVisibility(View.INVISIBLE);
            }
        });



    }

    public void view() {
        visible = findViewById(R.id.buttonVisible);
        inVisible = findViewById(R.id.buttonInVisible);

        mc = findViewById(R.id.buttonMC);
        mr = findViewById(R.id.buttonMR);
        ms = findViewById(R.id.buttonMS);
        mPlus = findViewById(R.id.buttonMPlus);
        mMinus = findViewById(R.id.buttonMMinus);
    }

}
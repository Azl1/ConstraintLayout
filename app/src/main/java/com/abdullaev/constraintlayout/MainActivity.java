package com.abdullaev.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button visible, inVisible;

    Button memoryClear, memoryRead, memorySave, mPlus, mMinus;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.layoutland);
        view();
        visible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoryClear.setVisibility(View.VISIBLE);
                memoryRead.setVisibility(View.VISIBLE);
                memorySave.setVisibility(View.VISIBLE);
                mPlus.setVisibility(View.VISIBLE);
                mMinus.setVisibility(View.VISIBLE);
            }
        });

        inVisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoryClear.setVisibility(View.INVISIBLE);
                memoryRead.setVisibility(View.INVISIBLE);
                memorySave.setVisibility(View.INVISIBLE);
                mPlus.setVisibility(View.INVISIBLE);
                mMinus.setVisibility(View.INVISIBLE);
            }
        });



    }

    public void view() {
        visible = findViewById(R.id.buttonVisible);
        inVisible = findViewById(R.id.buttonInVisible);

        memoryClear = findViewById(R.id.buttonMC);
        memoryRead = findViewById(R.id.buttonMR);
        memorySave = findViewById(R.id.buttonMS);
        mPlus = findViewById(R.id.buttonMPlus);
        mMinus = findViewById(R.id.buttonMMinus);
    }

}
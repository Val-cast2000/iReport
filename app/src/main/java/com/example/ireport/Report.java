package com.example.ireport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.gms.tasks.OnCompleteListener;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.core.Repo;

public class Report extends AppCompatActivity {
    TextView mHuman;
    TextView mThreatening;
    TextView mStalking;
    TextView mTouching;
    TextView mSexual;
    TextView mRape;
    TextView mPoor_Street;
    TextView mOthers;
    ImageButton mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        mHuman = findViewById(R.id.human_trafficking);
        mThreatening = findViewById(R.id.threatening);
        mStalking = findViewById(R.id.stalking);
        mTouching = findViewById(R.id.touching_groping);
        mSexual = findViewById(R.id.sexual_invites);
        mRape = findViewById(R.id.rape_sexual);
        mPoor_Street = findViewById(R.id.poor_street);
        mOthers = findViewById(R.id.others);
        mBack = findViewById(R.id.back);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));


            }
        });
        mHuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Sendreport.class));


            }
        });
        mThreatening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Sendreport.class));


            }
        });
        mStalking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Sendreport.class));


            }
        });
        mTouching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Sendreport.class));


            }
        });
        mSexual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Sendreport.class));


            }
        });
        mRape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Sendreport.class));


            }
        });
        mPoor_Street.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Sendreport.class));


            }
        });
        mOthers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Sendreport.class));


            }
        });
    }
}

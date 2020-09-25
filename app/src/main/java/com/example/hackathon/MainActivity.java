package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_home, btn_cate, btn_bag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_home = (Button)findViewById(R.id.btn_home);
        btn_cate = (Button)findViewById(R.id.btn_cate);
        btn_bag = (Button)findViewById(R.id.btn_bag);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Frag_home frag_home = new Frag_home();
                transaction.replace(R.id.frame, frag_home);
                transaction.commit();
            }
        });

        btn_cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Frag_cate frag_cate = new Frag_cate();
                transaction.replace(R.id.frame, frag_cate);
                transaction.commit();
            }
        });

        btn_bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Frag_bag frag_bag = new Frag_bag();
                transaction.replace(R.id.frame, frag_bag);
                transaction.commit();
            }
        });

    }

}
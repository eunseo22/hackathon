package com.example.hackathon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Frag_home frag_home;
    private Frag_cate frag_cate;
    private Frag_bag frag_bag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.action_home:
                        setFrag(0);
                        break;
                    case R.id.action_cate:
                        setFrag(1);
                        break;
                    case R.id.action_bag:
                        setFrag(2);
                        break;
                }
                return true;
            }
        });
        frag_home = new Frag_home();
        frag_cate = new Frag_cate();
        frag_bag = new Frag_bag();
        setFrag(0); //첫 프래그먼트 화면 지정


    }
    //프래그먼트 교체
    private void setFrag(int n){
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch(n){
            case 0:
                ft.replace(R.id.main_frame, frag_home);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, frag_cate);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame, frag_bag);
                ft.commit();
                break;
        }
    }
}
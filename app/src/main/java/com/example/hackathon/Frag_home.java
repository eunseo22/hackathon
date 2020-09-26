package com.example.hackathon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag_home extends Fragment{

    public static Frag_home newInstance(){
        return new Frag_home();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home, container, false);
        Button btn_luvpra = (Button)view.findViewById(R.id.btn_luvpra);
        Button btn_dasan = (Button)view.findViewById(R.id.btn_dasan);

        btn_luvpra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(Luvpra_flower.newInstance());
            }
        });

        btn_dasan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ((MainActivity)getActivity()).replaceFragment(Dasan_flower.newInstance());
            }
        });

        return view;

    }
}


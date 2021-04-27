package com.example.contohfragment.MainActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.contohfragment.R;
import com.example.contohfragment.Fragment.OffFragment;
import com.example.contohfragment.Fragment.OnFragment;


public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button btnon,btnoff;

    OnFragment fragmenton;
    OffFragment fragmentoff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnon = findViewById(R.id.btn_on);
        btnoff = findViewById(R.id.btn_off);

        btnon.setOnClickListener(this);
        btnoff.setOnClickListener(this);
    }
        void menuOn (){
            fragmenton = new OnFragment();
            FragmentTransaction ft = getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, fragmenton);
            ft.commit();
        }

        void menuOff() {
            fragmentoff = new OffFragment();
            FragmentTransaction ft = getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, fragmentoff);
            ft.commit();
        }

    @Override
    public void onClick(View v) {
        if (v == btnon){
            menuOn();
        }
        if (v == btnoff){
            menuOff();
        }

    }
}
package com.example.tugas_pwpb1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mHasin, mLabib, mSyarif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_intent);
        mHasin = (Button) findViewById(R.id.biodata_hasin);
        mHasin.setOnClickListener(this);
        mLabib = (Button) findViewById(R.id.biodata_labib);
        mLabib.setOnClickListener(this);
        mSyarif = (Button) findViewById(R.id.biodata_syarif);
        mSyarif.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.biodata_hasin:
                Intent intent1 = new Intent(MainActivity.this, hasin.class);
                startActivity(intent1);
                break;
            case R.id.biodata_labib:
                Intent intent2 = new Intent(MainActivity.this, labib.class);
                startActivity(intent2);
                break;
            case R.id.biodata_syarif:
                Intent intent3 = new Intent(MainActivity.this, syarif.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }
}

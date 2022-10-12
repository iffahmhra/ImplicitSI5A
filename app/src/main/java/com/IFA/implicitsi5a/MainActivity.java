package com.IFA.implicitsi5a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText etUrl, etLokasi, etTeks;
     Button btnBukaWebsite, btnBukaLokasi, btnBagikanTeks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUrl = findViewById(R.et_url);
        etLokasi = findViewById(R.id.et_lokasi);
        etTeks =  findViewById(R.id.et_teks);
        btnBukaWebsite = findViewById(R.id.btn_buka_website);
        btnBukaLokasi = findViewById(R.id.btn_buka_lokasi);
        btnBagikanTeks
    }
}
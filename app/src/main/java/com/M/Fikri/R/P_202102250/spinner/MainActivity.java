package com.M.Fikri.R.P_202102250.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner _spinner1, _spinner2, _spinner3, _spinner4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        _spinner1 = (Spinner) findViewById(R.id.spinner1);
        _spinner2 = (Spinner) findViewById(R.id.spinner2);
        _spinner3 = (Spinner) findViewById(R.id.spinner3);
        _spinner4 = (Spinner) findViewById(R.id.spinner4);
        initSpinner1();
        initSpinner2();
        initSpinner3();
        initSpinner4();
    }
    private void initSpinner1() {
        List<String> buahList = new ArrayList<>();
        buahList.add("Rambutan");
        buahList.add("Langsat");
        buahList.add("Durian");
        buahList.add("Nangka");
        buahList.add("Mangga");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1,buahList);
        _spinner1.setAdapter(arrayAdapter);
    }
    private void initSpinner2() {
        List<String> mahasiswalist = new ArrayList<>();
        for(int i = 1; i <= 1000; i++) {
            mahasiswalist.add("Mahasiswa ke-" + i);
        }
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, mahasiswalist);
        _spinner2.setAdapter(arrayAdapter2);

    }
    private void initSpinner3() {
        List<String> ganjillist = new ArrayList<>();
        for (int i=1; i <= 999; i+=2) {
            ganjillist.add("Bilangan ke-" + i);
        }
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, ganjillist);
        _spinner3.setAdapter(arrayAdapter3);
    }
    private void initSpinner4() {
        List<String> genapList = new ArrayList<>();
        for (int i = 2; i <= 1000; i+=2) {
            genapList.add("Bilangan ke-" + i);
        }
        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, genapList);
        _spinner4.setAdapter(arrayAdapter4);
    }
}
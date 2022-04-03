package com.amalia.detailnamatempat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amalia.uasamalia.R;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[];
    int image[] = {R.drawable.jalanankota, R.drawable.gununglaut, R.drawable.kudaponi, R.drawable.laut,R.drawable.perkotaan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);

        s1 = getResources().getStringArray(R.array.pariwisata);
        s2 = getResources().getStringArray(R.array.desc);

        adapter myadapter = new adapter(this, s1, s2, image);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
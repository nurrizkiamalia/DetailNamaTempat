package com.amalia.detailnamatempat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.amalia.uasamalia.R;

public class detail extends AppCompatActivity {

    ImageView img;
    TextView txt1, txt2;

    String data1, data2;
    int image;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img = findViewById(R.id.gambar2);
        txt1 = findViewById(R.id.juduldetail);
        txt2 = findViewById(R.id.descdetail);
        btn = findViewById(R.id.btnback);

        getData();
        setData();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(detail.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    private void getData(){
        if (getIntent().hasExtra("image") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")){
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            image = getIntent().getIntExtra("image",1);
        } else {
            Toast.makeText(this, "Data perlu diisi",Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        txt1.setText(data1);
        txt2.setText(data2);
        img.setImageResource(image);
    }
}
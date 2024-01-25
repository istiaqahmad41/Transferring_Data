package com.example.transferring_data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tx1 ;
    TextView tx2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tx1 = findViewById(R.id.tx1);
        tx2 = findViewById(R.id.tx2);

        String str1 = getIntent().getExtras().getString("key1");
        tx1.setText(str1);
        String str2 = getIntent().getExtras().getString("key2");
        tx2.setText(str2);

    }
}
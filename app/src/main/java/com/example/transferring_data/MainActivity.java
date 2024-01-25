package com.example.transferring_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    EditText ed3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=findViewById(R.id.edtx1);
        ed2=findViewById(R.id.edtx2);
        ed3=findViewById(R.id.edtx3);
        btn = findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten =  new Intent(MainActivity.this,MainActivity2.class);
                String nametext = ed1.getText().toString().trim();
                inten.putExtra("key1",nametext);
                String pricetext = ed2.getText().toString().trim();
                String quantitytext = ed3.getText().toString().trim();

                Double d1 = Double.valueOf(pricetext);
                Double d2 = Double.valueOf(quantitytext);
                Double result= d1 *d2;
                String total = String.valueOf(result);

                inten.putExtra("key2",total);
                startActivity(inten);
            }
        });




    }
}
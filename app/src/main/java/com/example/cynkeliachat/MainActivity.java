package com.example.cynkeliachat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nickname, ip, puerto;
    Button conectar;
    String n, i, p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nickname = findViewById(R.id.editTextNick);
        ip = findViewById(R.id.editTextIP);
        puerto = findViewById(R.id.editTextPuerto);
        conectar = findViewById(R.id.button);

        conectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = nickname.getText().toString();
                i = ip.getText().toString();
                p = puerto.getText().toString();

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("nickname", n);
                intent.putExtra("ip", i);
                intent.putExtra("puerto", p);
                startActivity(intent);
            }
        });

    }
}

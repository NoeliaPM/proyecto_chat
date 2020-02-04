package com.example.cynkeliachat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    String nickname;
    int ip, puerto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FragmentUsuarios frgUsu = (FragmentUsuarios)getSupportFragmentManager().findFragmentById(R.id.FrgUsuarios);

        Bundle bundle = getIntent().getExtras();
        nickname = bundle.getString("nickname");
        ip = Integer.parseInt(bundle.getString("ip"));
        puerto = Integer.parseInt(bundle.getString("puerto"));


    }
}

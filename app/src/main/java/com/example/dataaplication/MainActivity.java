package com.example.dataaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Set<String> set = new HashSet<>();
        set.add("11");
        set.add("12");
        set.add("13");

        SharedPreferences sharedPref = getSharedPreferences("Material", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("Email", "thomascaycedo19@outlook.com");
        editor.putString("Nombre", "Thomas Caycedo Martinez");
        editor.putString("datos", set);
        editor.commit()
    }
}
package com.esatgozcu.sharedprefdeletedata;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.delete);

        sharedPreferences = getSharedPreferences("MyPref", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        editor.putString("key","apple");
        editor.apply();
    }

    public void delete(View view){

        editor.remove("key");
        editor.apply();

    }
}

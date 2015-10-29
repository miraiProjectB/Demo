package com.example.b1013208.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.b1013208.demo.R.id.onset_button;
import static com.example.b1013208.demo.R.id.undo_button;

public class SelectItem extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_item);
    }
    public void onClick(View view){
        switch (view.getId()){
            case undo_button:
                Intent goMainActivity = new Intent(this, MainActivity.class);
                startActivity(goMainActivity);
                break;
            case onset_button:
                Intent goOnsetSleep = new Intent(this, OnsetSleep.class);
                startActivity(goOnsetSleep);
                break;
        }
    }
}
package com.example.b1013208.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.b1013208.demo.R.id.before_button;
import static com.example.b1013208.demo.R.id.next_button;
import static com.example.b1013208.demo.R.id.undo_button;
import static com.example.b1013208.demo.R.id.main_button;

public class DetailSample extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
    }
    public void onClick(View view){
        switch (view.getId()){
            case undo_button:
                Intent goOnset = new Intent(this, OnsetSleep.class);
                startActivity(goOnset);
                break;
            case next_button:
                setContentView(R.layout.detail_next);
                break;
            case before_button:
                setContentView(R.layout.detail_before);
                break;
            case main_button:
                setContentView(R.layout.detail);
                break;
        }
    }

}

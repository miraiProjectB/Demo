package com.example.b1013208.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import static com.example.b1013208.demo.R.id.completion_button;
import static com.example.b1013208.demo.R.id.undo_button;

public class OnsetSleep extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hikaku_onset_sleep);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter.add("入眠までの時間が長い順");
        adapter.add("入眠までの時間が短い順");
        adapter.add("活動量が多い順");
        adapter.add("活動量が少ない順");

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

    }

    public void onClick(View view){
        switch (view.getId()){
            case completion_button:
                Intent goDetail = new Intent(this, DetailSample.class);
                startActivity(goDetail);
                break;
            case undo_button:
                Intent goSelectItem = new Intent(this, SelectItem.class);
                startActivity(goSelectItem);
                break;
        }
    }
}

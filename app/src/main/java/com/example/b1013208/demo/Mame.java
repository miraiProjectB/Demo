package com.example.b1013208.demo;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import static com.example.b1013208.demo.R.id.undo_button;

public class Mame extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mame);
    }
    public void onClick(View view){
        switch (view.getId()){
            case undo_button:
                finish();
        }
    }
}
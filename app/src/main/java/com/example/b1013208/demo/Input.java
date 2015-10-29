package com.example.b1013208.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.b1013208.demo.R.id.next_button;
import static com.example.b1013208.demo.R.id.undo_button;

public class Input extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_subjectivity);
    }

    //ボタンアクション
    //xmlにクリックイベントを取得するメソッドを追加するのを忘れないように
    public void onClick(View view){
        switch (view.getId()){
            case undo_button:
                Intent goMainActivity = new Intent(this, MainActivity.class);
                startActivity(goMainActivity);
                break;
            case next_button:
                Intent goActMemo = new Intent(this, ActMemo.class);
                startActivity(goActMemo);
                break;
        }
    }
}

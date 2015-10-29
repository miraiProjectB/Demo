package com.example.b1013208.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.b1013208.demo.R.id.completion_button;
import static com.example.b1013208.demo.R.id.undo_button;

public class ActMemo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_memo);
    }

    //ボタンアクション
    //xmlにクリックイベントを取得するメソッドを追加するのを忘れないように
    public void onClick(View view){
        switch (view.getId()){
            case undo_button:
                Intent goInput = new Intent(this, Input.class);
                startActivity(goInput);
                break;
            case completion_button:
                Intent goMainActivity = new Intent(this, MainActivity.class);
                startActivity(goMainActivity);
                //this.finish();
        }
    }
}
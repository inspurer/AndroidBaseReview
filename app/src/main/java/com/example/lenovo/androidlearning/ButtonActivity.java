package com.example.lenovo.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mbtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mbtn4 = findViewById(R.id.btn_4);
        mbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //注意这里要加一个ButtonAcitivity,因为在onClick中上下文变了
                Toast.makeText(ButtonActivity.this,"btn4被点击了",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void ShowToast(View v){
        Toast.makeText(this,"btn3被点击了",Toast.LENGTH_SHORT).show();
    }
}

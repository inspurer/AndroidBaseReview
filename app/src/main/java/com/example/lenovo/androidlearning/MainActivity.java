package com.example.lenovo.androidlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lenovo.androidlearning.gridview.GridViewActivity;
import com.example.lenovo.androidlearning.listview.ListViewAcitivity;

public class MainActivity extends AppCompatActivity {

    private Button mtnTextView, mtnButton, mtnEditText, mtnRadioButton,mtnCheckBox;

    private Button mtnImageView,mtnListView,mtnGridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtnTextView = findViewById(R.id.btn_tv);


        mtnButton = findViewById(R.id.btn_btn);


        mtnEditText = findViewById(R.id.btn_et);


        mtnRadioButton = findViewById(R.id.btn_rb);

        mtnCheckBox = findViewById(R.id.btn_cb);

        mtnImageView = findViewById(R.id.btn_iv);

        mtnListView = findViewById(R.id.btn_lv);

        mtnGridView = findViewById(R.id.btn_gv);

        setListener();

    }

    public void setListener(){
        onClick onclick = new onClick();
        mtnTextView.setOnClickListener(onclick);
        mtnButton.setOnClickListener(onclick);
        mtnEditText.setOnClickListener(onclick);
        mtnRadioButton.setOnClickListener(onclick);
        mtnCheckBox.setOnClickListener(onclick);
        mtnImageView.setOnClickListener(onclick);
        mtnListView.setOnClickListener(onclick);
        mtnGridView.setOnClickListener(onclick);
    }

    private class onClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int id = view.getId();
            Intent intent = null;
            switch (id){
                case R.id.btn_tv:
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_btn:
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_et:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_rb:
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_cb:
                    intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.btn_iv:
                    intent = new Intent(MainActivity.this,ImageViewActivity.class);
                    break;

                case R.id.btn_lv:
                    intent = new Intent(MainActivity.this,ListViewAcitivity.class);
                    break;
                case R.id.btn_gv:
                    intent = new Intent(MainActivity.this,GridViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }


}

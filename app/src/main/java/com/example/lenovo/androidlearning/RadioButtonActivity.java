package com.example.lenovo.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    private RadioGroup mrg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        mrg1 = findViewById(R.id.rg_1);
        mrg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            //i是发生变化的radiobutton的id
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton rb = radioGroup.findViewById(i);
                Toast.makeText(RadioButtonActivity.this,rb.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}

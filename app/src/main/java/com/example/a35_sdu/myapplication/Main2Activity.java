package com.example.a35_sdu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView nameTextView;
    String getNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameTextView = findViewById(R.id.txvName);

        getNameString = getIntent().getStringExtra("nameString");

        nameTextView.setText("ยินดีต้อนรับ"+getNameString+"เข้าสู่ระบบ");
    }
}

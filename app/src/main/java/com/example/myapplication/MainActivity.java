package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.bt1);
        Button btn2 = findViewById(R.id.bt2);
        Button btn3 = findViewById(R.id.bt3);
        Button btn4 = findViewById(R.id.bt4);

        TextView tview1 = (TextView)findViewById(R.id.tv1);
        TextView tview2 = (TextView)findViewById(R.id.tv2);
        TextView tview3 = (TextView)findViewById(R.id.tv3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.valueOf(tview1.getText().toString());
                int num2 = Integer.valueOf(tview2.getText().toString());
                tview3.setText("" + (num1+num2));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num3 = Integer.valueOf(tview1.getText().toString());
                int num4 = Integer.valueOf(tview2.getText().toString());
                tview3.setText("" + (num3-num4));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num5 = Integer.valueOf(tview1.getText().toString());
                int num6 = Integer.valueOf(tview2.getText().toString());
                tview3.setText("" + (num5*num6));
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num7 = Float.valueOf(tview1.getText().toString());
                float num8 = Float.valueOf(tview2.getText().toString());
                tview3.setText("" + (num7/num8));
            }
        });


    }
}
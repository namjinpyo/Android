package com.example.buttoneventhandle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_red;
    Button btn_green;
    Button btn_blue;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.InitializeView();
    }

    public void InitializeView() {
        btn_red = (Button) findViewById(R.id.button_red);
        btn_green = (Button) findViewById(R.id.button_green);
        btn_blue = (Button) findViewById(R.id.button_blue);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void btnOnClick(View view) {
        switch (view.getId()) {
            case R.id.button_red:
                textView.setTextColor(Color.RED);
                break;
            case R.id.button_green:
                textView.setTextColor(Color.GREEN);
                break;
            case R.id.button_blue:
                textView.setTextColor(Color.BLUE);
                break;
        }
    }
}
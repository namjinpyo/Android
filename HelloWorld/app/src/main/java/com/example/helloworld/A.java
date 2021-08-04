package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button launch = (Button)findViewById(R.id.launchActivity);
        launch.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(A.this, B.class);
                startActivity(intent);
            }
        });
    }
    /*
    public void onClick_A_button_handler(View view) {
        Intent intent = new Intent(A.this, B.class);
        startActivity(intent);
    }
    */
}
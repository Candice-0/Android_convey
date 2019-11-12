package com.example.convey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = (View)findViewById(R.id.frame);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String data = "Hello NextActivity";
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                intent.putExtra("extra_data", data);
                //startActivity(intent);
                startActivityForResult(intent, 1);
            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("MainActivity", returnedData);
                }
                break;
            default:
        }
    }
}

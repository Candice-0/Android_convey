package com.example.convey;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_layout);
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d("NextActivity", data);
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("data_return", "Hello MainActivity!");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}

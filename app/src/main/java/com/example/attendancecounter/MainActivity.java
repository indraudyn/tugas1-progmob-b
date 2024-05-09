package com.example.attendancecounter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText attendanceEditText;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attendanceEditText = findViewById(R.id.attendanceEditText);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(v -> {
            String attendanceCountStr = attendanceEditText.getText().toString();
            int attendanceCount = Integer.parseInt(attendanceCountStr);

            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("attendanceCount", attendanceCount);
            startActivity(intent);
        });
    }
}

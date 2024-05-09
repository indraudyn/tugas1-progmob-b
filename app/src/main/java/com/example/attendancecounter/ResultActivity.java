package com.example.attendancecounter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView statusTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        statusTextView = findViewById(R.id.statusTextView);

        Intent intent = getIntent();
        int attendanceCount = intent.getIntExtra("attendanceCount", 0);

        String status;
        if (attendanceCount >= 11 && attendanceCount <= 16) {
            status = "Diperbolehkan Untuk UAS";
        } else if (attendanceCount < 10) {
            status = "Tidak Diperbolehkan UAS";
        } else {
            status = "Invalid attendance count";
        }

        statusTextView.setText(status);
    }
}

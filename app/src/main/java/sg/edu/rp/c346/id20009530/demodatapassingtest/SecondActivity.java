package sg.edu.rp.c346.id20009530.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvInteger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvInteger = findViewById(R.id.tvInteger);

        Intent intentRecieved = getIntent();
        int value = intentRecieved.getIntExtra("Value",0);
        tvInteger.setText("Integer value recieved is: " + value);

    }
}
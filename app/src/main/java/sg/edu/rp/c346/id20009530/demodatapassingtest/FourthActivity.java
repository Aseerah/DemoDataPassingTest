package sg.edu.rp.c346.id20009530.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvDouble = findViewById(R.id.tvDouble);


        Intent intentRecieved = getIntent();
        double number = intentRecieved.getDoubleExtra("number", 0.0);
        tvDouble.setText("Double value recieved is: " + number);

    }
}
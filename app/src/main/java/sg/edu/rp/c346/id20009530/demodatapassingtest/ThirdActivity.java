package sg.edu.rp.c346.id20009530.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvChar = findViewById(R.id.tvChar);

        Intent intentRecieved = getIntent();
        char letter = intentRecieved.getCharExtra("letter", 'x');
        tvChar.setText("Character value recieved is: " + letter);

    }
}
package sg.edu.rp.c346.id20009530.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // step 1
    Button buttonPassInteger;
    Button buttonPassChar;
    TextView tvDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 2
        buttonPassInteger = findViewById(R.id.buttonPassInteger);
        buttonPassChar = findViewById(R.id.buttonPassChar);
        tvDouble = findViewById(R.id.tvDouble);

        // step 3
        buttonPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Value", 1);
                startActivity(intent);
            }
        });

        buttonPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("letter", 'a');
                startActivity(intent);
            }
        });

        tvDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("number", 99.99);
                startActivity(intent);
            }
        });

    }
}
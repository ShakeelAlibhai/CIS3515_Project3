package edu.temple.coloractivityproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        Spinner s;
        s = findViewById(R.id.spinner);

        String colors[] = {
                "Blue",
                "Red",
                "White",
                "Yellow",
                "Green"
        };

        ColorAdapter a = new ColorAdapter(this, colors);
        s.setAdapter(a);
    }
}

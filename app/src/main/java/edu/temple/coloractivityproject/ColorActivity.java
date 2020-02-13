package edu.temple.coloractivityproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
                "Green",
                "Aqua",
                "Olive",
                "Lime",
                "Cyan",
                "Silver"
        };

        ColorAdapter a = new ColorAdapter(this, colors);
        s.setAdapter(a);

        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                parent.setBackgroundColor(Color.WHITE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

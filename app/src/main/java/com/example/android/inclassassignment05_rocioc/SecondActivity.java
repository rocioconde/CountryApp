package com.example.android.inclassassignment05_rocioc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayText = (TextView) findViewById(R.id.display_text);

        Intent intent = getIntent();

        Country c = (Country) intent.getSerializableExtra(Keys.COUNTRY);
        displayText.setText(c.toString());
    }
}

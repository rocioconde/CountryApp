package com.example.android.inclassassignment05_rocioc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText countryName;
    private EditText population;
    private CheckBox isPresidentWoman;
    private EditText moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryName = (EditText) findViewById(R.id.country);
        population = (EditText) findViewById(R.id.population);
        isPresidentWoman = (CheckBox) findViewById(R.id.president);
        moreInfo = (EditText) findViewById(R.id.more_information);

    }

    public void submit(View view) {

        String country = countryName.getText().toString();
        String info = moreInfo.getText().toString();
        String pop = population.getText().toString();
        int population = Integer.parseInt(pop);
        boolean isWoman = isPresidentWoman.isChecked();

        Country c = new Country(country, population, isWoman, info);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(Keys.COUNTRY, c);
        startActivity(intent);


    }
}

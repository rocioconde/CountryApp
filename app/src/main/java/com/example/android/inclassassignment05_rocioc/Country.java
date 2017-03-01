package com.example.android.inclassassignment05_rocioc;

import java.io.Serializable;

/**
 * Created by ccteuser on 2/27/17.
 */

public class Country implements Serializable {

    private String name;
    private int population;
    private boolean isPresidentWoman;
    private String moreInfo;

    public Country(String name, int population, boolean isPresidentWoman, String moreInfo) {
        this.name = name;
        this.isPresidentWoman = isPresidentWoman;
        this.population = population;
        this.moreInfo = moreInfo;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public boolean isPresidentWoman() {
        return isPresidentWoman;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setPresidentWoman(boolean presidentWoman) {
        isPresidentWoman = presidentWoman;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    @Override
    public String toString() {
        return "Country: " + name +
                "\nPopulation: " + population +
                "\nIs the President a Woman? " + isPresidentWoman +
                "\nMore Information: " + moreInfo;
    }
}

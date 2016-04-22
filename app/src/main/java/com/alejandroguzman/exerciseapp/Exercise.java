package com.alejandroguzman.exerciseapp;

import android.graphics.Bitmap;

/**
 * Created by Alejandro Guzman on 4/21/16.
 */
public class Exercise {


    String name;
    String description;
    Bitmap picture;

    public Exercise (String name, String description) {
        setDescription(description);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Bitmap getPicture() {
        return picture;
    }

    public void setPicture(Bitmap picture) {
        this.picture = picture;
    }
}

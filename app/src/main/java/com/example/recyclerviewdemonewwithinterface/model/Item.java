package com.example.recyclerviewdemonewwithinterface.model;

// 3
public class Item {
    private int id;
    private String name;
    private float rating;
    private int image;

    public Item(int id, String name, float rating, int image) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.image = image;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
}

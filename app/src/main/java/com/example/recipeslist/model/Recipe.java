package com.example.recipeslist.model;

public class Recipe {
    private int id;
    private String name;
    private String description;
    private int photo; // Resource ID for drawable
    private String ingredients;
    private String procedure;

    public Recipe(int id, String name, String description, int photo, String ingredients, String procedure) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.photo = photo;
        this.ingredients = ingredients;
        this.procedure = procedure;
    }

    public int getId () {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPhoto() {
        return photo;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getProcedure() {
        return procedure;
    }
}
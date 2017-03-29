package com.temptilicious.therecipetree;

import java.io.Serializable;

/**
 * Created by Admin on 21-07-2015.
 */
public class RecipeBean implements Serializable {
    int icon ;
    String title;
    int image;
    String recipe;
    int marker;

    public RecipeBean() {
    }

    public RecipeBean(int icon, String title, int image, String recipe, int marker) {
        this.icon = icon;
        this.title = title;
        this.image = image;
        this.recipe = recipe;
        this.marker = marker;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public int getMarker() {
        return marker;
    }

    public void setMarker(int marker) {
        this.marker = marker;
    }
}

package com.temptilicious.therecipetree;

import java.io.Serializable;

/**
 * Created by Admin on 27-07-2015.
 */
public class IngredientBean implements Serializable {
    String name,meaning;

    public IngredientBean() {
    }

    public IngredientBean(String name, String meaning) {
        this.name = name;
        this.meaning = meaning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
